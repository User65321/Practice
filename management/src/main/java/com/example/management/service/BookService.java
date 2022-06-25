package com.example.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.management.dao.BookDao;

@Service
public class BookService {

	@Autowired
	public BookDao bookDao;
	
	public String Number;
	public String Name;
	
	//登録処理
	public void Register(ModelMap modelMap,@RequestParam("Number") String Number,@RequestParam("Name")String Name) {
			this.Number=Number;
			this.Name=Name;
			modelMap.addAttribute("message","社員番号「"+Number+"」で「"+Name+"」を登録しました。");
			bookDao.bookRegister(modelMap, Name, Name);
		
	}
		
		//検索処理
	public void Search(ModelMap modelMap,@RequestParam("Number")String Number) {
		this.Number=Number;
		String result;
		if(Name!=null) {
			result="社員番号「"+Number+"」の検索結果は「"+Name+"」です";
		}else {
			result="「"+Number+"」は登録されていません";
		}
		modelMap.addAttribute("result",result);
		bookDao.bookSearch(modelMap, Number);
	}
	
	//削除処理
	public void Delete(ModelMap modelMap,@RequestParam("Number")String Number) {
		this.Number=Number;
		String Dresult;
		if(Number!=null) {
			Dresult="社員番号:「"+Number+"」を削除しました。";
		}else {
			Dresult="社員番号:「"+Number+"」は存在しません」";
		}
		modelMap.addAttribute("Dresult",Dresult);
		bookDao.bookDelete(modelMap, Number);
	}

}
