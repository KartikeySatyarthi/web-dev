package io.covid.cases.CoronaVirusTracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import io.covid.cases.CoronaVirusTracker.Services.CoronaVirusDataService;

@Controller
public class HomeController {

	@Autowired
	CoronaVirusDataService cvds;
	
	@GetMapping("/")
	public String home(Model model)
	{
		model.addAttribute("locationStats",cvds.getAllStats());
		model.addAttribute("tc",cvds.getTotalCases());
		model.addAttribute("yc",cvds.getOldCases());
		return "home";
	}
}
