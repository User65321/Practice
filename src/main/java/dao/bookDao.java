package dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

public class bookDao {

public static Map<Integer,String>book=new HashMap<>();
	
	//登録処理
	public void bookRegister(ModelMap modelMap,@RequestParam("Number") Integer Number,@RequestParam("Name")String Name){
		book.put(Number, Name);
	}
	//検索処理
	public String bookSearch(ModelMap modelMap,@RequestParam("Number")Integer Number) {
		return book.get(Number);
	}
	
	//一覧表示処理
	public void bookList(ModelMap modelMap) {
		book.keySet();
	}
}
