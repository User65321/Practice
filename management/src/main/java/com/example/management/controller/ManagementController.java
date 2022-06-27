package com.example.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.management.service.BookService;

@Controller
public class ManagementController {

	@Autowired
	public BookService manager;
	
	
	//ここから登録
	@GetMapping("/")
	public String bookRegister() {
		return "bookRegister";
	}
	
	@PostMapping("/")
	public String bookRegister(ModelMap modelMap,@RequestParam("ID") String ID,@RequestParam("Name")String Name) {
		manager.Register(modelMap, ID, Name);
		
		
		return "bookRegister";
	}
	
	//ここから検索
		@GetMapping("bookSearch")
		public String bookSearch() {
			return "bookSearch";
		}
		@PostMapping("bookSearch")
		public String bookSearch(ModelMap modelMap,@RequestParam("ID")String ID) {
			
			manager.Search(modelMap, ID);
			return "bookSearch";
		}
		
}
		
	