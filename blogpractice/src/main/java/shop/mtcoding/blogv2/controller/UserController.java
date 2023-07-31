package shop.mtcoding.blogv2.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/*
 * @Controller
 * 1.ComponentScan->New->Ioc등록
 * 2.return되는 값이 view 파일
 * 
 */

@Controller //view 리졸버 발동
public class UserController {
	
	@PostMapping("/join")
    public String join(String username, String password, String email) throws IOException {

        // String username = request.getParameter("username");
        // String password = request.getParameter("passsword");
        // String email = request.getParameter("email");

        // BufferedReader br = request.getReader();
        // //버퍼가 소비됨
        // String body = br.readLine();

        // // 버퍼를 소비해서, 못 꺼냄
        // String username = request.getParameter("username");

        System.out.println("username : " + username);
        System.out.println("password : " + password);
        System.out.println("email : " + email);

        return "redirect:/";
    }

	@GetMapping("/joinForm")
	public String joinForm() {
		return "user/joinForm";
	}
	
	@GetMapping("/loginForm")
	public String loginForm() {
		return "user/loginForm";
	}
	
	@GetMapping("/updateForm")
	public String updateForm() {
		return "user/updateForm";
	}
	
	
}



