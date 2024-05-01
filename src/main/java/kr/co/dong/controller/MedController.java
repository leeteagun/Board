package kr.co.dong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.dong.med.MedBean;
import kr.co.dong.med.MedService;

@Controller
public class MedController {
	@Autowired
	MedService medService;
	
	@GetMapping("med")
	public String listAll(Model model) {
		List<MedBean> listAll = medService.listAll();
		model.addAttribute("listAll", listAll);
		return "med";
	}
	
	@GetMapping("medselectone")
	public String medselectone(@RequestParam("id") int id, Model model) {
		MedBean mb = medService.selectOne(id);
		model.addAttribute("med", mb);
		return "med/medselectone";
	}
	
	@GetMapping("med/medinsertform")
	public String medinsertform() {
		return "med/medinsertform";
	}

	@PostMapping("med/medinsertform")
	public String medinsert(MedBean mb, Model model) {
		System.out.println(mb.getTitle());
	    int r = medService.insert(mb);
	    
		return "redirect:/med";		
	}

	@GetMapping("med/medupdateform")
	public String medupdateform(@RequestParam("id") int id, Model model) {
	    MedBean mb = medService.selectOne(id);
	    model.addAttribute("med", mb);
	    System.out.println(mb);
	    
	    return "med/medupdateform";
	}

	@PostMapping("med/medupdateform")
	public String medupdate(@RequestParam("id") int id, MedBean mb) {
	    mb.setId(id); // 수정할 데이터의 id 설정
	    System.out.println(mb);
	    int r = medService.update(mb);
	    System.out.println(r);
	    
		return "redirect:/med";		
	}
	
	@GetMapping("med/meddelete")
	public String Headelete(@RequestParam("id") int id, Model model) {
		int r = medService.delete(id);
		System.out.println(r);
		
		return "redirect:/med";		
	}

	
}
