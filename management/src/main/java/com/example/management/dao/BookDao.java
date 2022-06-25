package com.example.management.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public class BookDao {

public Map<String,String>book=new HashMap<>();
	
//登録処理
	public void bookRegister(ModelMap modelMap,@RequestParam("Number") String Number,@RequestParam("Name")String Name){
		book.put(Number, Name);
	}
	//検索処理
	public Map<String, String> bookSearch(ModelMap modelMap,@RequestParam("Number")String Number) {
		book.get(Number);
		return book;
	}
	
	//削除処理
	public Map<String, String> bookDelete(ModelMap modelMap,@RequestParam("Number")String Number) {
		book.remove(Number);
		return book;
	}
}
