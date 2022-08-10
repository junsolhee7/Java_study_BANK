package com.iu.start.bankMembers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/member/*")
//이 클래스는 Controller역할,
//Container에게 이 클래스의 객체의 생성을 위임 (new로 생성) (Tomcat X, Spring Container)
public class MemberController {

	// annotation
	// @ : 설명+실행
	
	// /member/login //절대경로작성
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String  login() {
		System.out.println("login 실행");
		return "member/login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String  login(BankMembersDTO bankMembersDTO) {
		System.out.println("DB에 login 실행");
		//"Redirect:다시접속할URL주소(절대경로,상대경로)"
		return "redirect:../";
	}

	
	//join  /member/join //Get
	
	@RequestMapping(value = "join", method = RequestMethod.GET)
	
	public String join() {
		
		System.out.println("join Get 실행");
		
		return "member/join";
		
	}
	
	
	// /member/join //Post
	@RequestMapping(value = "join", method = RequestMethod.POST)
	
//	public String join(HttpServletRequest request) throws Exception{
	public String join(BankMembersDTO bankMembersDTO) throws Exception{
		
		System.out.println("join Post 실행");
		
		BankMembersDAO bankMembersDAO = new BankMembersDAO();
		
//		BankMembersDTO bankMembersDTO = new BankMembersDTO();
//		String username = request.getParameter("username");
//		bankMembersDTO.setUserName(userName);
//		bankMembersDTO.setPassWord(request.getParameter("password"));
//		bankMembersDTO.setName(request.getParameter("name"));
//		bankMembersDTO.setEmail(request.getParameter("email"));
//		bankMembersDTO.setPhone(request.getParameter(phone));
//		bankMembersDTO.setUserName(request.getParameter(userName));
//		bankMembersDTO.setPhone(phone);
//		bankMembersDTO.setUserName(request.getParameter("userName"));
		
		
		int result = bankMembersDAO.setJoin(bankMembersDTO);
		System.out.println((bankMembersDTO.getUserName()));
		System.out.println(result==1);
		
		return "redirect:./login";
	}
	
//	@RequestMapping(value="search", method=RequestMethod.POST)
//	public String search(String userName) {
//		System.out.println("search POST 실행");
//		System.out.println("userName: "+userName);
//		return "member/list";
//	} //내가작성한코드
	
	@RequestMapping(value="search", method=RequestMethod.GET)
	public void getSearchByID() throws Exception{
		System.out.println("search get 실행");	
	}
	
	@RequestMapping(value="search", method=RequestMethod.POST)
	public String getSearchByID(String search, Model model) throws Exception{
		System.out.println("search POST 실행");
		
		BankMembersDAO bankMembersDAO = new BankMembersDAO();
		ArrayList<BankMembersDTO> ar = bankMembersDAO.getSearchByID(search);
		model.addAttribute("list",ar);
		
		return "member/list";
	}
	

	
	
}
