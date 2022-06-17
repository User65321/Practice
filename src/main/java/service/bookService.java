package service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import dao.bookDao;

@Service
public class bookService {
	
	@Autowired
	public bookDao dao;
	
	public Map<Integer,String>book=new HashMap<>();
	
	//登録処理
		public String Register(ModelMap modelMap,@RequestParam("Number") Integer Number,@RequestParam("Name")String Name) {
			dao.bookRegister(modelMap, Number, Name);
			modelMap.addAttribute("message","「"+Number+"/"+Name+"」を登録しました。");
			return "bookRegister";
		}
		
		//検索処理
		public String Search(ModelMap modelMap,@RequestParam("Number")Integer Number) {
			String Name=dao.bookSearch(modelMap, Number);
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
		public String List(ModelMap modelMap) {
			dao.bookList(modelMap);
			modelMap.addAttribute("book",book);
			return "bookList";
			
		}
}