package com.example.demo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController {

	/*
	 * @RequestMapping("/gallery_view") public String gallery_view() { return
	 * "gallery_view"; }
	 */
	/*
	 * @RequestMapping("/diary") public String diary() { return "Mydiary"; }
	 */

	

	@RequestMapping("/login")
	public String login() {
		return "00_2login";
	}

	@RequestMapping("/join")
	public String join() {
		return "00_3join";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "01home";
	}
	
	@RequestMapping("/gallery")
	public String gallery() {
		return "02_1gallery_view";
	}
	
	@RequestMapping("/input_food")
	public String input_food() {
		return "02_2_1input_food";
	}
	@RequestMapping("/search")
	public String search() {
		return "02_2_1input_search";
	}
	@RequestMapping("/input_gallery")
	public String input_gallery() {
		return "02_2_2input_gallery";
	}
	@RequestMapping("/calendar")
	public String calendar() {
		return "02_3calendar";
	}
	@RequestMapping("/habit")
	public String habit() {
		return "03_1foodhabit";
	}
	@RequestMapping("/memo")
	public String memo() {
		return "04_1memo";
	}
	@RequestMapping("/input_memo")
	public String input_memo() {
		return "04_2input_memo";
	}
	
}	