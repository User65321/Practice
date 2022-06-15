package com.example.sample;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

public interface bookDao {

	public Map<Integer,String>book=new HashMap<>();
	
	//登録処理
	public String bookRegister(ModelMap modelMap,@RequestParam("Number") Integer Number,@RequestParam("Name")String Name);
	
	//検索処理
	public String bookSearch(ModelMap modelMap,@RequestParam("Number")Integer Number);
	
	//一覧表示処理
	public String bookList(ModelMap modelMap);
}
