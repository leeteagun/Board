package kr.co.dong.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.dong.manager.ManagerService;

@Controller
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @PostMapping("/checkManagerPassword")
    public String checkManagerPassword(@RequestParam("password") String password,
                                       HttpSession session) {
        try {
            // 비밀번호를 정수로 변환
            int intPassword = Integer.parseInt(password);
            
            // 비밀번호 확인하는 서비스 메서드 호출
            String isValidPassword = managerService.manager(intPassword);
            System.out.println("비밀번호 확인 결과: " + isValidPassword);
            
            // 세션에 "isValidPassword" 속성이 있으면 관리자로 간주하여 com 페이지로 리다이렉트
            if (isValidPassword != null) {
                session.setAttribute("isValidPassword", isValidPassword);
                return "redirect:/com";
            } else {
                return "redirect:/com";
            }
        } catch (NumberFormatException e) {
            // 비밀번호를 정수로 변환하는 과정에서 숫자가 아닌 문자가 포함되어 있을 경우 예외 처리
            System.out.println("비밀번호 형식이 올바르지 않습니다.");
            return "redirect:/com"; // 예외 발생 시 에러 페이지로 이동
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예외 발생: " + e.getMessage());
            // 예외 처리 로직을 여기에 추가
            return "redirect:/com"; // 예외 발생 시 에러 페이지로 이동
        }
    }

    
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/com";
	}

}


//  System.out.println(password);
//  try {
//      String isValidPassword = managerService.manager(password);
//      System.out.println("비밀번호 확인 결과: " + isValidPassword);
//      System.out.println("예외 미발생");
//      session.setAttribute("isValidPassword", isValidPassword);
//      return "redirect:/com"; // 비밀번호 확인 결과에 따라 리다이렉트
//  } catch (Exception e) {
//  	e.printStackTrace();
//      System.out.println("예외 발생: " + e.getMessage());
//      // 예외 처리 로직을 여기에 추가
//      return "redirect:/error"; // 예외 발생 시 에러 페이지로 이동
//  }
