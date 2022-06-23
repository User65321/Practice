package com.example.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.bookDao;
import service.bookService;

@Controller
public class ManagementController {

	@Autowired
	public bookService bookService;
	
	@Autowired
	public bookDao dao;
	
	//ここから登録
	@GetMapping("/")
	public String bookRegister() {
		return "bookRegister";
	}
	
	@PostMapping("/")
	public String bookRegister(ModelMap modelMap,@RequestParam("Number") Integer Number,@RequestParam("Name")String Name) {
		bookService.Register(modelMap, Number, Name);
		dao.bookRegister(modelMap, Number, Name);
		return "bookRegister";
	}
	
	//ここから検索
		@GetMapping("bookSearch")
		public String bookSearch() {
			return "bookSearch";
		}
		@PostMapping("bookSearch")
		public String bookSearch(ModelMap modelMap,@RequestParam("Number")Integer Number) {
			bookService.Search(modelMap, Number);
			return "bookSearch";
		}
		
		//ここから一覧
		@GetMapping("bookList")
		public String bookList(ModelMap modelMap) {
			bookService.List(modelMap);
			return "bookList";
		}
	
	
}