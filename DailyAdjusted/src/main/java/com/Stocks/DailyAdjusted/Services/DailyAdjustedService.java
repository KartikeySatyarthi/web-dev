//package com.Stocks.DailyAdjusted.Services;
//import java.io.IOException;
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.annotation.PostConstruct;
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import com.Stocks.DailyAdjusted.Entity.StocksEnity;
//@Service
//public class DailyAdjustedService {
//	
//	
//	@PostConstruct
//	public void show() 
//	{
//		String s="TSLA";
//		try {
//			DataManager dm=new DataManager();
//			dm.fetchData(s);
//		} catch (IOException | InterruptedException | JSONException e) {
//			
//			e.printStackTrace();
//		}
//	}
//	
//	
//}
