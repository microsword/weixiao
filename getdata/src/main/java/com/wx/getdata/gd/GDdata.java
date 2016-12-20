package com.wx.getdata.gd;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.ArrayList;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wx.getdata.Util;
public class GDdata {
	
	public static GD_Bean getBean(JSONObject js) throws Exception{
		GD_Bean bean = new GD_Bean();
			 bean.setType("");
		     bean.setName(js.getString("name"));
		     bean.setTel(js.getString("tel"));
		     bean.setAddr(js.getString("address"));
		     bean.setPname(js.getString("pname"));
		     bean.setCname(js.getString("cityname"));
		     bean.setAname(js.getString("adname"));
		     
		     JSONArray j = js.getJSONArray("photos");
		     if (j.size()>0)
		    	bean.setPic_url(j.getJSONObject(0).getString("url")); 
		     else 
		    	 bean.setPic_url("");
		     String[] s = js.getString("location").split(",");
		     bean.setL(s[0]);
		     bean.setW(s[1]);
		return bean;
	}
	
	
	public static void main( String args[]) throws Exception{
		
		String typecode = "1102";
		String url = "http://restapi.amap.com/v3/place/text?key=e5b245676822372d2ecbe16da3da8892&keywords=&types=" + typecode+ "&city="+URLEncoder.encode("杭州","utf-8")+"&children=1&offset=100&page=1&extensions=all";
		//System.out.println(doGet(url,"UTF-8"));
		JSONObject fs = JSON.parseObject(Util.doGet(url,"utf-8"));
		
		JSONArray ja=fs.getJSONArray("pois");
		List<GD_Bean> l = new ArrayList<GD_Bean>();
		for(int i=0;i<ja.size();i++)
		{
			l.add(getBean(ja.getJSONObject(i)));		
		}	
		GD_BeanServices beanservices = new GD_BeanServices();
		beanservices.insertUser(l);
		
		
	}
	
	
	
}
