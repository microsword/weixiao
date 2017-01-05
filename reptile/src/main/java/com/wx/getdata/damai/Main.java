package com.wx.getdata.damai;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wx.getdata.entity.Activity;
import com.wx.getdata.util.Util;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static Activity getActivity(String id,String venid,Activity activity) throws Exception{

		String mainURL="https://mapi.damai.cn/nproj.aspx?id="+id+"&source=10099&version=50403&visitorId=WFtiSu5UvYQDAKwBWJMX811l";
		String locationURL="https://mapi.damai.cn/Ven.aspx?id="+venid+"&source=10099&version=50403";
		String detailURL="https://mapi.damai.cn/nProjdesc.aspx?id="+id+"&source=10099&version=50403";

		JSONObject fs = JSON.parseObject(Util.doGet(locationURL,"utf-8"));
		activity.setAddress(fs.getString("AddRess"));
		activity.setLat(Double.parseDouble(fs.getString("Lat")));
		activity.setLng(Double.parseDouble(fs.getString("Lng")));
		activity.setContent("Text");


		Document doc = Jsoup.connect(detailURL).get();
		activity.setHtml(doc.toString());
		//System.out.println(doc.toString());

		return activity;
	}
	
	public static void main( String args[]) throws Exception{

		String URL="https://mapi.damai.cn/ProjLst.aspx?EndTime=&StartTime=&cc=0&cityid=1580&mc=0&ot=0&p=1&ps=20&source=10099&version=50403";
		String picURL ="https://ossali.damai.cn/perform/project/";
		JSONObject fs = JSON.parseObject(Util.doGet(URL,"utf-8"));
		
		JSONArray ja=fs.getJSONArray("l");

		List<Activity> list = new ArrayList<>();
		for(int i=0;i<ja.size();i++)
		{
			JSONObject js = ja.getJSONObject(i);
			Activity activity = new Activity();
			String id=js.getString("i");
			String venid = js.getString("VenId");
			if(!venid.equals("0"))
			{
			String logo = picURL + id.substring(0,4) + "/" + id + "_n.jpg";
			activity.setLogo(logo);
			activity.setTitle(js.getString("n"));
			String time = js.getString("t");
				String[] times = time.replaceFirst(",","-").split("-");
			if (times.length==1) {
				activity.setBegin_time(Util.changeDateFormat(times[0]));
				activity.setEnd_time(Util.changeDateFormat(times[0]));
				activity.setJoin_begin_time(Util.changeDateFormat(times[0]));
				activity.setJoin_end_time(Util.changeDateFormat(times[0]));



			}else if(times.length==2){
				activity.setBegin_time(Util.changeDateFormat(times[0]));
				activity.setEnd_time(Util.changeDateFormat(times[1]));
				activity.setJoin_begin_time(Util.changeDateFormat(times[0]));
				activity.setJoin_end_time(Util.changeDateFormat(times[1]));
		}
			String price = js.getString("p");
			if(price != null){
				String[] prices = price.split("-");
				activity.setMin_fee(Double.parseDouble(prices[0]));
			}

			activity.setCity_id(3501);
			activity.setProvince_id(35);
			activity.setPublish(0);
			activity.setCreated_user(1);
			activity.setStatus(0);
			activity.setType(3);
			activity.setIsgroup(0);
			activity.setAge(0);
			activity.setBusinessid(1);
			activity.setCreated_at(new Date());

			list.add(getActivity(id,venid,activity));
				System.out.println("。。。正在载入第"  + i+1 +"个活动数据，总计" + ja.size() + "个。。。");

		}
	}


		Services services = new Services();
		services.insertActivity(list);

		
		
	}
	
	
	
}
