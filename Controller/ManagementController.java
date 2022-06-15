package com.example.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ManagementController {

	@Autowired
	public bookService manager;
	
	
	//ここから登録
	@GetMapping("/")
	public String bookRegister() {
		return "bookRegister";
	}
	
	@PostMapping("/")
	public String bookRegister(ModelMap modelMap,@RequestParam("Number") Integer Number,@RequestParam("Name")String Name) {
		manager.bookRegister(modelMap, Number, Name);
		return "bookRegister";
	}
	
	//ここから検索
		@GetMapping("bookSearch")
		public String bookSearch() {
			return "bookSearch";
		}
		@PostMapping("bookSearch")
		public String bookSearch(ModelMap modelMap,@RequestParam("Number")Integer Number) {
			manager.bookSearch(modelMap, Number);
			return "bookSearch";
		}
		
		//ここから一覧
		@GetMapping("bookList")
		public String bookList(ModelMap modelMap) {
			manager.bookList(modelMap);
			return "bookList";
		}
	
	
}
