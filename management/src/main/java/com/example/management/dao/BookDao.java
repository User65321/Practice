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
	public void bookRegister(ModelMap modelMap,@RequestParam("ID") String ID,@RequestParam("Name")String Name){
		book.put(ID, Name);
	}
	//検索処理
	public Map<String, String> bookSearch(ModelMap modelMap,@RequestParam("ID")String ID) {
		book.get(ID);
		return book;
	}
}
