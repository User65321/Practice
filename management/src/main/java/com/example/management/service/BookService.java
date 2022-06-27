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
	
	public String ID;
	public String Name;
	
	//登録処理
	public void Register(ModelMap modelMap,@RequestParam("ID") String ID,@RequestParam("Name")String Name) {
			this.ID=ID;
			this.Name=Name;
			
			bookDao.bookRegister(modelMap, ID, Name);
			modelMap.addAttribute("message","社員ID「"+ID+"」で「"+Name+"」を登録しました。");
			
		
	}
		
		//検索処理
	public void Search(ModelMap modelMap,@RequestParam("ID")String ID) {
		this.ID=ID;
		String result;
		
		bookDao.bookSearch(modelMap, Name);
		if(Name!=null) {
			result="社員ID；「"+ID+"」の検索結果は「"+Name+"」です";
		}else {
			result="「"+ID+"」は登録されていません";
		}
		modelMap.addAttribute("result",result);
	}

}
