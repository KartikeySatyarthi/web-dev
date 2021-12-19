package com.Stocks.DailyAdjusted.Controller;






import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Stocks.DailyAdjusted.Entity.StocksEnity;
import com.Stocks.DailyAdjusted.Entity.StringInput1;
//import com.Stocks.DailyAdjusted.Services.DailyAdjustedService;
import com.Stocks.DailyAdjusted.Services.DataManager;


@Controller
public class DailyAdjustedController 
{

	@Autowired
	private StocksEnity es;
	
	@Autowired
	private DataManager dm;
	
	@Autowired
	private StringInput1 si;
	
	
	@GetMapping("/")
	public String home(Model model) throws IOException, InterruptedException, JSONException
	{		
		StocksEnity es=dm.fetchData("TSLA");
		model.addAttribute("es",es);
		return "index";
		
	}
	
	
	@GetMapping("/ss")
	public String search(HttpServletRequest r,Model model) throws IOException, InterruptedException, JSONException
	{		
		String str=r.getParameter("value");
		StocksEnity es=dm.fetchData(str);
		model.addAttribute("es",es);
		return "index";
		
	}
	
	
	
	

	
	
}
