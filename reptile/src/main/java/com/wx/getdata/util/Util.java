package com.wx.getdata.util;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
	 /**
	 httpClient的get请求方式2
	 * @return
	 * @throws Exception
	 */
	public static String doGet(String url, String charset)
			throws Exception {
		/*
		 * 使用 GetMethod 来访问一个 URL 对应的网页,实现步骤: 1:生成一个 HttpClinet 对象并设置相应的参数。
		 * 2:生成一个 GetMethod 对象并设置响应的参数。 3:用 HttpClinet 生成的对象来执行 GetMethod 生成的Get
		 * 方法。 4:处理响应状态码。 5:若响应正常，处理 HTTP 响应内容。 6:释放连接。
		 */
		/* 1 生成 HttpClinet 对象并设置参数 */
		HttpClient httpClient = new HttpClient();
		// 设置 Http 连接超时为5秒
		httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(10000);
		/* 2 生成 GetMethod 对象并设置参数 */
		GetMethod getMethod = new GetMethod(url);
		// 设置 get 请求超时为 5 秒
		getMethod.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 5000);
		// 设置请求重试处理，用的是默认的重试处理：请求三次
		getMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,	new DefaultHttpMethodRetryHandler());
		String response = "";
		/* 3 执行 HTTP GET 请求 */
		try {
			int statusCode = httpClient.executeMethod(getMethod);
			/* 4 判断访问的状态码 */
			if (statusCode != HttpStatus.SC_OK) {
				System.err.println("请求出错: "+ getMethod.getStatusLine());
			}
			/* 5 处理 HTTP 响应内容 */
			// HTTP响应头部信息，这里简单打印
			Header[] headers = getMethod.getResponseHeaders();
			for (Header h : headers)
				System.out.println(h.getName() + "------------ " + h.getValue());
			// 读取 HTTP 响应内容，这里简单打印网页内容
			//byte[] responseBody = getMethod.getResponseBody();// 读取为字节数组
			//response = new String(responseBody, charset);
			//System.out.println("----------response:" + response);
			// 读取为 InputStream，在网页内容数据量大时候推荐使用
			InputStream in = getMethod.getResponseBodyAsStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in)); 
			StringBuffer resBuffer = new StringBuffer(); 
			String resTemp = ""; 
			while((resTemp = br.readLine()) != null)
				{ 
					resBuffer.append(resTemp); 
					} 
			response = resBuffer.toString();
			 
		} catch (HttpException e) {
			// 发生致命的异常，可能是协议不对或者返回的内容有问题
			System.out.println("请检查输入的URL!");
			e.printStackTrace();
		} catch (IOException e) {
			// 发生网络异常
			System.out.println("发生网络异常!");
			e.printStackTrace();
		} finally {
			/* 6 .释放连接 */
			getMethod.releaseConnection();
		}
		return response;
	}

	public static Date changeDateFormat(String date) throws Exception{

		String[] dates = date.split("\\.");
		String newdate = dates[0] + "-" + dates[1] + "-" + dates[2] +" 00:00:00";
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date rdate = dateFormat.parse(newdate);
		return rdate;

	}
	     
}
