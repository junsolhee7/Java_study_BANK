package com.iu.start.bankBook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/bankbook/*")
public class BankBookController {

	// / bankbook/list Get list
	// / bankbook/detail Get detail
	@RequestMapping(value="list",method=RequestMethod.GET)
	public String list() {
		System.out.println("list 실행");
		return "bankBook/list";
	}
	@RequestMapping(value="detail",method=RequestMethod.GET)
	public String detail(Long booknum) {
		System.out.println("detail 실행");
		System.out.println("booknum="+booknum);
		return "bankbook/detail";
	}
	@RequestMapping(value="add", method=RequestMethod.GET)
	public String add() {
		System.out.println("add GET 실행");
		return "bankbook/add";
	}
	@RequestMapping(value="add", method=RequestMethod.POST)
	public String add(BankBookDTO bankBookDTO) {
		System.out.println("add POST 실행");
		return "bankbook/add";
	}
	
	
}
