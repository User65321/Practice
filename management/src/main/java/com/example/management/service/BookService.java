package com.example.management.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class BookService {

	
	public Integer Number;
	public String Name;
	
	//登録処理
	public void Register(ModelMap modelMap,@RequestParam("Number") Integer Number,@RequestParam("Name")String Name) {
		this.Number=Number;
		this.Name=Name;
		modelMap.addAttribute("message","「"+Number+"/"+Name+"」を登録しました。");
		
	}
		
		//検索処理
	public void Search(ModelMap modelMap,@RequestParam("Number")Integer Number) {
		this.Number=Number;
		String result;
		if(Name!=null) {
			result="「"+Number+"の検索結果は"+Name+"」です";
		}else {
			result="「"+Number+"は登録されていません";
		}
		modelMap.addAttribute("result",result);
	}
	

}
