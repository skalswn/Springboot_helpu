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

	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}

	@RequestMapping("/test")
	public String test() {
		return "test";
	}

	@RequestMapping("/demo")
	public String demo() {
		return "Demo";
	}

	@RequestMapping("/gallery_view")
	public String gallery_view() {
		return "gallery_view";
	}

	@RequestMapping("/home")
	public String home() {
		return "home";
	}


	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/join")
	public String join() {
		return "join";
	}

	@RequestMapping("/diary")
	public String diary() {
		return "Mydiary";
	}

	@RequestMapping("/gallery")
	public String gallery() {
		return "gallery";
	}

	@RequestMapping("/memo")
	public String memo() {
		return "input_memo";
	}

	@RequestMapping("/fmemo")
	public String fmemo() {
		return "input_food";
	}

	@RequestMapping("/search")
	public String search() {
		return "input_search";
	}

	@RequestMapping("/input_gallery")
	public String input_gallery() {
		return "input_gallery";
	}

	@RequestMapping("/input_search")
	public String input_search() {
		return "input_search";
	}

	@RequestMapping("/calendar")
	public String calendar() {
		return "calendar";
	}

	@RequestMapping("/input_food")
	public String input_food() {
		return "input_food";
	}

	@RequestMapping("/input_memo")
	public String input_memo() {
		return "input_memo";
	}
	@RequestMapping("/imemo")
	public String imemo() {
		return "NewFile";
	}
}