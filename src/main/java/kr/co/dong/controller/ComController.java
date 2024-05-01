package kr.co.dong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import kr.co.dong.com.ComBean;
import kr.co.dong.com.ComService;

@Controller
public class ComController {
	@Autowired
	ComService comService;
	
	@GetMapping("com")
	public String listAll(Model model) {
		List<ComBean> listAll = comService.listAll();
		model.addAttribute("listAll", listAll);
		return "com";
	}
	
	@GetMapping("comselectone")
	public String comselectone(@RequestParam("id") int id, Model model) {
		ComBean cb = comService.selectOne(id);
		model.addAttribute("com", cb);
		return "com/comselectone";
	}
	
	@GetMapping("com/cominsertform")
	public String cominsertform() {
		return "com/cominsertform";
	}

	@PostMapping("com/cominsertform")
	public String cominsert(ComBean cb, Model model) {
		System.out.println(cb.getTitle());
	    int r = comService.insert(cb);
	    
		return "redirect:/com";		
	}

	@GetMapping("com/comupdateform")
	public String comupdateform(@RequestParam("id") int id, Model model) {
	    ComBean cb = comService.selectOne(id);
	    model.addAttribute("com", cb);
	    System.out.println(cb);
	    
	    return "com/comupdateform";
	}

	@PostMapping("com/comupdateform")
	public String comupdate(@RequestParam("id") int id, ComBean cb) {
	    cb.setId(id); // 수정할 데이터의 id 설정
	    System.out.println(cb);
	    int r = comService.update(cb);
	    System.out.println(r);
	    
		return "redirect:/com";		
	}
	
	@GetMapping("com/comdelete")
	public String comdelete(@RequestParam("id") int id, Model model) {
		int r = comService.delete(id);
		System.out.println(r);
		
		return "redirect:/com";		
	}

	
}
