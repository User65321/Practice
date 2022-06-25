package com.example.management.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.management.service.BookService;

@Controller
public class ManagementController {

//	@Autowired
//	public PersonForm personForm;
	@Autowired
	public BookService manager;
	
	
	//ここから登録
	@GetMapping("/")
	public String bookRegister() {
		return "bookRegister";
	}
	
	@PostMapping("/")
	public String bookRegister(ModelMap modelMap,@RequestParam("Number") String Number,@RequestParam("Name")String Name) {
		manager.Register(modelMap, Number, Name);
		return "bookRegister";
	}
	
	//ここから検索
		@GetMapping("bookSearch")
		public String bookSearch() {
			return "bookSearch";
		}
		@PostMapping("bookSearch")
		public String bookSearch(@ModelAttribute @Valid  PersonForm personForm,BindingResult bindingResult,ModelMap modelMap,@RequestParam("Number")String Number) {
			
//			if(bindingResult.hasErrors()) {
//				return "bookError";
//			} 
			
			
			manager.Search(modelMap, Number);
			return "bookSearch";
		}
		
		//ここから削除
		@GetMapping("bookDelete")
		public String bookDelete() {
			return "bookDelete";
		}
		@PostMapping("bookDelete")
		public String bookDelete(ModelMap modelMap,@RequestParam("Number")String Number) {
			manager.Delete(modelMap, Number);
			return "bookDelete";
		}
		
}
		
//		//ここから一覧
//		@GetMapping("bookList")
//		public String bookList(ModelMap modelMap) {
//			manager.List(modelMap);
//			return "bookList";
//		}
	