package com.example.sample;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ManagementController {

	private Map<Integer,String>book=new HashMap<>();
	
	//ここから登録
	@GetMapping("/")
	public String bookRegister() {
		return "bookRegister";
	}
	
	@PostMapping("/")
	public String bookRegister(ModelMap modelMap,@RequestParam("Number") Integer Number,@RequestParam("Name")String Name) {
		book.put(Number, Name);
		modelMap.addAttribute("message","「"+Number+"/"+Name+"」を登録しました。");
		return "bookRegister";
	}
	
	//ここから検索
		@GetMapping("bookSearch")
		public String bookSearch() {
			return "bookSearch";
		}
		@PostMapping("bookSearch")
		public String bookSearch(ModelMap modelMap,@RequestParam("Number")Integer Number) {
			String Name=book.get(Number);
			String result;
			if(Name!=null) {
				result="「"+Number+"の検索結果は"+Name+"」です";
			}else {
				result="「"+Number+"は登録されていません";
			}
			modelMap.addAttribute("result",result);
			return "bookSearch";
		}
		
		//ここから一覧
		@GetMapping("bookList")
		public String bookList(ModelMap modelMap) {
			modelMap.addAttribute("book",book);
			return "bookList";
		}
	
	
}
