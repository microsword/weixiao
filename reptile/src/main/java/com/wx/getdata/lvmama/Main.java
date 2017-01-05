package com.wx.getdata.lvmama;

import com.wx.getdata.entity.Activity;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 * Created by jianhu on 2017/1/4.
 */
public class Main {
    /**
     * 获得驴妈妈列表页面的标题和连接
     * @return
     */
    public static List<Activity> getActivity() throws Exception{
        List<Activity> list = new ArrayList<>();
        String base_url = "https://m.lvmama.com";
        Document doc;
        for(int i=1;i<=5;i++)
        {
            String URL="https://m.lvmama.com/tour/scenictour?keyword=%E4%B8%BB%E9%A2%98%E4%B9%90%E5%9B%AD&channel=1" +
                       "&latitude=31.238032669517935&longitude=121.38725332252167&scenictour_page="+i;
            try {
                doc = Jsoup.connect(URL).get();
                System.out.println("。。。正在获取第 "+ i+ " 波头文件数据。。。，总共 100 波！");
                Element Listsearch = doc.getElementsByAttributeValue("class","searchList  ").first();
                Element List = Listsearch.getElementsByTag("article").first();
                Elements Listdetail = List.getElementsByTag("li");
                //System.out.print(Listdetail.size());

                for (Element element :Listdetail) {

                    Element e = element.getElementsByTag("a").first();
                    String link = base_url + e.attr("href");
                    Element eimg = e.getElementsByAttributeValue("class","ml-pro-img").first();
                    Element eimg_src = eimg.getElementsByTag("img").first();
                    String logo = eimg_src.attr("data-lazy-url");
                    Element location = eimg.getElementsByTag("span").first();
                    String city = location.text();
                    Element ename = e.getElementsByAttributeValue("class","ml-pro-info").first();
                    Element ename_info = ename.getElementsByTag("p").first();
                    String title = ename_info.text();
                    Element eprice = ename.getElementsByAttributeValue("class","price").first();
                    String sprice = eprice.getElementsByTag("i").last().text();
                    //System.out.println(sprice);
                    Double price = Double.parseDouble(sprice);
                    if(link !=null & link !="")
                    {
                        Activity activity = new Activity();
                        activity.setTitle(title);
                        activity.setLogo(logo);
                        activity.setLink_url(link);
                        activity.setMin_fee(price);
                        activity.setCity_id(Const.getCityId(city));
                        activity.setProvince_id(35);
                        activity.setPublish(0);
                        activity.setCreated_user(1);
                        activity.setStatus(0);
                        activity.setType(1);
                        activity.setIsgroup(0);
                        activity.setCreated_at(new Date());
                        activity.setJoin_begin_time(new Date());
                        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        Date myDate2 = dateFormat2.parse("2017-12-30 12:00:00");
                        activity.setJoin_end_time(myDate2);
                        activity.setBegin_time(new Date());
                        activity.setEnd_time(myDate2);
                        activity.setAge(0);
                        activity.setBusinessid(1);
                        list.add(activity);

                        //System.out.println(activity.toString());
                    }

                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return list;

    }



    public static void main(String args[]) throws Exception{

        List<Activity> list = getActivity();

        Services services = new Services();
        services.insertActivity(list);


    }


}
