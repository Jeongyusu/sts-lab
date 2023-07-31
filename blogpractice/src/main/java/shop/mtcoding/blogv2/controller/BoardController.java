package shop.mtcoding.blogv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	
	@GetMapping({"/", "/board"})
	public String index() {
		return "index";
	}
	
	@GetMapping("/board/saveForm")
	public String saveForm() {
		return "board/saveForm";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "board/datail";
	}
	
	@GetMapping("/board/1")
	public String detailView() {
		return "board/detail";
	}
	
	


}
