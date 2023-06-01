package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.transaction.Transactional;



@Controller
public class ManageController {
	
	@Autowired
	InventoryRepository repository;
	
//	@PostConstruct
//	public void init() {
//		Inventory inv1 =new Inventory();
//		inv1.setBook("初期値1");
//		inv1.setPrice(150);
//		repository.saveAndFlush(inv1);
//		
//		Inventory inv2 =new Inventory();
//		inv2.setBook("初期値2");
//		inv2.setPrice(250);
//		repository.saveAndFlush(inv2);
//		
//		Inventory inv3 =new Inventory();
//		inv3.setBook("初期値3");
//		inv3.setPrice(350);
//		repository.saveAndFlush(inv3);
//		
//	}
		
	@GetMapping("/")
	public String index(Inventory inventory,Model model) {
		Iterable<Inventory> list=repository.findAll();
		model.addAttribute("data",list);
		return "index";
	}
	
	@GetMapping("form")
	public String form(@ModelAttribute Inventory inventory,Model model) {
		model.addAttribute(inventory);
		return "form";
	}
	
	@PostMapping("/create")
	@Transactional
//	public String create(Inventory inventory,@RequestParam("book") String book,@RequestParam("price") Integer price) {
	public String create(@ModelAttribute @Validated Inventory inventory,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "form";
		}else {
		repository.saveAndFlush(inventory);
		return "redirect:/";
		}

	}
	
//	@PostMapping("/create")
//	@Transactional
//	public String create(Inventory inventory,@RequestParam("book") String book,@RequestParam("price") Integer price) {
//		repository.saveAndFlush(inventory);
//		return "redirect:/";
//
//	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Long id,Model model) {
		Optional<Inventory>data =repository.findById((Long)id);
		model.addAttribute("inventory",data);
		return "edit";
	}
	
	@PostMapping("/update")
	@Transactional
	public String update(@ModelAttribute Inventory inventory){
		repository.saveAndFlush(inventory);
		return "redirect:/";
	}
	
	@PostMapping("/delete")
	@Transactional
	public String delete(@ModelAttribute Inventory inventory) {
		repository.deleteById(inventory.getId());
		return "redirect:/";
	}
	
}
