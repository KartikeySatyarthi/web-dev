package com.Stocks.DailyAdjusted.Services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import com.Stocks.DailyAdjusted.Entity.StocksEnity;

@Component
public class DataManager {

	public StocksEnity fetchData(String s) throws IOException, InterruptedException, JSONException
	{		
		HttpRequest request = HttpRequest.newBuilder()
		.uri(URI.create("https://yfapi.net/v6/finance/quote?region=US&lang=en&symbols="+s))
		.header("x-api-key", "aE4WXiBWsg9qRrOQ4QUZD24dYhvUsGYq4BSzepGo")
	    .method("GET", HttpRequest.BodyPublishers.noBody())
		.build();
					
		
		HttpResponse<String> response = HttpClient.newHttpClient()
												.send(request, HttpResponse.BodyHandlers.ofString());	
		System.out.println(response.body());


		
		
		//Parsing
		
		

		JSONObject JO=new JSONObject(response.body());		
		JSONObject  arr=JO.getJSONObject("quoteResponse");
		JSONArray ar1r= arr.getJSONArray("result");
		 
		 		 
		 
		 //Populating the entity 
		 
		 StocksEnity se=new StocksEnity();
		 
		 for(int i=0;i<ar1r.length();i++)
		 {
			 String symbol = ar1r.getJSONObject(i).getString("symbol");
			 se.setLongName( ar1r.getJSONObject(i).getString("longName"));
			 se.setAsk( (Double) ar1r.getJSONObject(i).get("ask"));
			 se.setRegularMarketDayHigh((Double) ar1r.getJSONObject(i).get("regularMarketDayHigh"));
			 se.setRegularMarketDayLow((Double) ar1r.getJSONObject(i).get("regularMarketDayLow"));
			 se.setFiftyTwoWeekHigh((Double) ar1r.getJSONObject(i).get("fiftyTwoWeekHigh"));
		     se.setFiftyTwoWeekLow((Double) ar1r.getJSONObject(i).get("fiftyTwoWeekLow"));
	         se.setMarketCap((Long) ar1r.getJSONObject(i).get("marketCap"));
			// se.setSharesOutstanding((Long) ar1r.getJSONObject(i).get("sharesOutstanding"));
			 se.setTrailingPE((Double) ar1r.getJSONObject(i).get("trailingPE"));
		     se.setPriceToBook((Double) ar1r.getJSONObject(i).get("priceToBook"));
		     //se.setTrailingAnnualDividendYield((Double) ar1r.getJSONObject(i).get("trailingAnnualDividendYield"));
		     se.setBookValue((Double) ar1r.getJSONObject(i).get("bookValue"));
			 se.setEpsTrailingTwelveMonths((Double) ar1r.getJSONObject(i).get("epsTrailingTwelveMonths"));
			 se.setFiftyDayAverage((Double) ar1r.getJSONObject(i).get("fiftyDayAverage"));
			 se.setTwoHundredDayAverage((Double) ar1r.getJSONObject(i).get("twoHundredDayAverage"));
			 
		 }
		 
		 
        return se;
		
	}
}
