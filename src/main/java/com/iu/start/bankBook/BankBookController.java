package com.iu.start.bankBook;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/bankbook/*")
public class BankBookController {

	// / bankbook/list Get list
	// / bankbook/detail Get detail
	@RequestMapping(value="list",method=RequestMethod.GET)
	public String list(Model model) throws Exception{
		System.out.println("list 실행");
		BankBookDAO bankBookDAO = new BankBookDAO();
		//DB 없으신 분들
		ArrayList<BankBookDTO> ar = new ArrayList<BankBookDTO>();
		for(int i=0;i<10;i++) {
			BankBookDTO bankBookDTO = new BankBookDTO();
			bankBookDTO.setBookName("bookName"+i);
			bankBookDTO.setBookNum((long)i);
			bankBookDTO.setBookRate(Math.random());
			bankBookDTO.setBookSale(1);
			ar.add(bankBookDTO);
		}
		
//		ArrayList<BankBookDTO> ar = bankBookDAO.getList();
		model.addAttribute("list", ar);
		
		return "bankbook/list";
	}
	@RequestMapping(value="detail",method=RequestMethod.GET)
	public ModelAndView detail(BankBookDTO bankBookDTO) throws Exception{		
		ModelAndView mv = new ModelAndView();
		System.out.println(bankBookDTO.getBookNum());
		System.out.println("detail 실행");
		
		BankBookDAO bankBookDAO = new BankBookDAO();
//		bankBookDTO = bankBookDAO.getDetail(bankBookDTO);
//		return "bankbook/detail";
//		DB가 없으신 분들
		bankBookDTO.setBookName("name");
		bankBookDTO.setBookRate(3.12);
		bankBookDTO.setBookSale(1);
		
		mv.setViewName("bankbook/detail");
		mv.addObject("dto",bankBookDTO);
		
		return mv;
	}
	
	// /bankbook /add GET / WEB-INF/views/bankbook/add.jsp
	@RequestMapping(value="add", method=RequestMethod.GET)
	public void add() throws Exception{
		System.out.println("add GET 실행");
		//return "bankbook/add";
	}
	// /bankbook /add POST / WEB-INF/views/bankbook/add.jsp
	@RequestMapping(value="add", method=RequestMethod.POST)
	public ModelAndView add(BankBookDTO bankBookDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		System.out.println("add POST 실행");
		System.out.println(bankBookDTO.getBookName());
		System.out.println(bankBookDTO.getBookRate());
		mv.setViewName("redirect:./list");
		return mv;
	}
	
	
}
