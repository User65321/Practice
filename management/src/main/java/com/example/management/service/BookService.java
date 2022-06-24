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
			modelMap.addAttribute("message","社員番号「"+Number+"」で「"+Name+"」を登録しました。");
			
		
	}
		
		//検索処理
	public void Search(ModelMap modelMap,@RequestParam("Number")Integer Number) {
		this.Number=Number;
		String result;
		if(Name!=null) {
			result="社員番号「"+Number+"」の検索結果は「"+Name+"」です";
		}else {
			result="「"+Number+"」は登録されていません";
		}
		modelMap.addAttribute("result",result);
	}
	
	//削除処理
	public void Delete(ModelMap modelMap,@RequestParam("Number")Integer Number) {
		this.Number=Number;
		String Dresult;
		if(Name!=null) {
			Dresult="社員番号:「"+Number+"」は存在しません」";
		}else {
			Dresult="社員番号:「"+Number+"」を削除しました。";
		}
		modelMap.addAttribute("Dresult",Dresult);
	}

}
