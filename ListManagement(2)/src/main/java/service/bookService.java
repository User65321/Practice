package service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.sample.PersonForm;

@Service
public class bookService {
	
	@Autowired
	public PersonForm personForm;

	Integer Number;
	String Name;
	
	
	public Map<Integer,String>book=new HashMap<>();
	
	
	//登録処理
		public PersonForm Register(ModelMap modelMap,@RequestParam("Number") Integer Number,@RequestParam("Name")String Name) {
			this.Number=Number;
			this.Name=Name;
			modelMap.addAttribute("message","「"+Number+"/"+Name+"」を登録しました。");
			return personForm;
		}
		
		//検索処理
		public PersonForm Search(ModelMap modelMap,@RequestParam("Number")Integer Number) {
			this.Number=Number;
			String result;
			if(Name!=null) {
				result="「"+Number+"の検索結果は"+Name+"」です";
			}else {
				result="「"+Number+"は登録されていません";
			}
			modelMap.addAttribute("result",result);
			return personForm;
		}
		
		//一覧表示処理
		public Map<Integer, String> List(ModelMap modelMap) {
			modelMap.addAttribute("book",book);
			return book;
			
		}
}