package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.transaction.Transactional;

@Controller
public class ManageController {
	
	@Autowired
	TipRepository repository;
	
	@GetMapping("/")
	public String index(Tip tip,Model model) {
		Iterable<Tip> list=repository.findAll(Sort.by(Sort.Direction.ASC, "id"));
		model.addAttribute("data",list);
		return "index";
	}
	
	@GetMapping("form")
	public String form(@ModelAttribute Tip tip,Model model) {
		model.addAttribute(tip);
		return "form";
	}
	
	
	@PostMapping("/create")
	@Transactional
	public String create(@ModelAttribute Tip tip) {
		repository.saveAndFlush(tip);
		return "redirect:/";
	}
	

	@GetMapping("/detail/{id}")
	public String detail(@PathVariable Long id,Model model) {
		Optional<Tip>data =repository.findById((Long)id);
		model.addAttribute("tip",data.get());
		return "detail";
	}
	

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Long id,Model model) {
		Optional<Tip>data =repository.findById((Long)id);
		model.addAttribute("tip",data.get());
		return "edit";
	}
	
	@PostMapping("/update")
	@Transactional
	public String update(@ModelAttribute Tip tip){
		repository.saveAndFlush(tip);
		return "redirect:/";
	}
	
	@PostMapping("/delete")
	@Transactional
	public String delete(@ModelAttribute Tip tip) {
		repository.deleteById(tip.getId());
		return "redirect:/";
	}

}
