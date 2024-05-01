package kr.co.dong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.dong.dis.DisBean;
import kr.co.dong.dis.DisService;

@Controller
public class DisController {
	@Autowired
	DisService disService;
	
	@GetMapping("dis")
	public String listAll(Model model) {
		List<DisBean> listAll = disService.listAll();
		model.addAttribute("listAll", listAll);
		return "dis";
	}
	
	@GetMapping("disselectone")
	public String disselectone(@RequestParam("id") int id, Model model) {
		DisBean db = disService.selectOne(id);
		model.addAttribute("dis", db);
		return "dis/disselectone";
	}
	
	@GetMapping("dis/disinsertform")
	public String disinsertform() {
		return "dis/disinsertform";
	}

	@PostMapping("dis/disinsertform")
	public String disinsert(DisBean db, Model model) {
		System.out.println(db.getTitle());
	    int r = disService.insert(db);
	    
		return "redirect:/dis";		
	}

	@GetMapping("dis/disupdateform")
	public String disupdateform(@RequestParam("id") int id, Model model) {
	    DisBean db = disService.selectOne(id);
	    model.addAttribute("dis", db);
	    System.out.println(db);
	    
	    return "dis/disupdateform";
	}

	@PostMapping("dis/disupdateform")
	public String disupdate(@RequestParam("id") int id, DisBean db) {
	    db.setId(id); // 수정할 데이터의 id 설정
	    System.out.println(db);
	    int r = disService.update(db);
	    System.out.println(r);
	    
		return "redirect:/dis";		
	}
	
	@GetMapping("dis/disdelete")
	public String disdelete(@RequestParam("id") int id, Model model) {
		int r = disService.delete(id);
		System.out.println(r);
		
		return "redirect:/dis";		
	}

	
}
