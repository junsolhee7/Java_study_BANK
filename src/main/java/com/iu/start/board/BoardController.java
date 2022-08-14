package com.iu.start.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/board/*")
public class BoardController {
	
	@RequestMapping(value="list.gg", method=RequestMethod.GET)
	public String list() throws Exception{
		System.out.println("list실행");
		return "board/list";
	}

}
