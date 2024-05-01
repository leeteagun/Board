package kr.co.dong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.dong.hea.HeaBean;
import kr.co.dong.hea.HeaService;

@Controller
public class HeaController {
	@Autowired
	HeaService heaService;
	
	@GetMapping("hea")
	public String listAll(Model model) {
		List<HeaBean> listAll = heaService.listAll();
		model.addAttribute("listAll", listAll);
		return "hea";
	}
	
	@GetMapping("heaselectone")
	public String Heaselectone(@RequestParam("id") int id, Model model) {
		HeaBean hb = heaService.selectOne(id);
		model.addAttribute("hea", hb);
		return "hea/heaselectone";
	}
	
	@GetMapping("hea/heainsertform")
	public String Heainsertform() {
		return "hea/heainsertform";
	}

	@PostMapping("hea/heainsertform")
	public String Heainsert(HeaBean hb, Model model) {
		System.out.println(hb.getTitle());
	    int r = heaService.insert(hb);
	    
		return "redirect:/hea";		
	}

	@GetMapping("hea/heaupdateform")
	public String Heaupdateform(@RequestParam("id") int id, Model model) {
	    HeaBean hb = heaService.selectOne(id);
	    model.addAttribute("hea", hb);
	    System.out.println(hb);
	    
	    return "hea/heaupdateform";
	}

	@PostMapping("hea/heaupdateform")
	public String Heaupdate(@RequestParam("id") int id, HeaBean hb) {
	    hb.setId(id); // 수정할 데이터의 id 설정
	    System.out.println(hb);
	    int r = heaService.update(hb);
	    System.out.println(r);
	    
		return "redirect:/hea";		
	}
	
	@GetMapping("hea/headelete")
	public String Headelete(@RequestParam("id") int id, Model model) {
		int r = heaService.delete(id);
		System.out.println(r);
		
		return "redirect:/hea";		
	}

	
}
