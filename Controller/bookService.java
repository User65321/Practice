package com.example.sample;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class bookService implements bookDao {
	
	public Map<Integer,String>book=new HashMap<>();
	
	//登録処理
		public String bookRegister(ModelMap modelMap,@RequestParam("Number") Integer Number,@RequestParam("Name")String Name) {
			book.put(Number, Name);
			modelMap.addAttribute("message","「"+Number+"/"+Name+"」を登録しました。");
			return "bookRegister";
		}
		
		//検索処理
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
		
		//一覧表示処理
		public String bookList(ModelMap modelMap) {
			modelMap.addAttribute("book",book);
			return "bookList";
			
		}
}
