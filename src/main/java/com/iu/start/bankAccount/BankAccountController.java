package com.iu.start.bankAccount;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iu.start.bankMembers.BankMembersDTO;

@Controller
@RequestMapping(value="/bankAccount/*")
public class BankAccountController {
	
	private BankAccountDAO bankAccountDAO;
	
	public BankAccountController() {
		this.bankAccountDAO = new BankAccountDAO();
	}
	
	@RequestMapping(value="add.iu", method=RequestMethod.GET)
	public String add(BankAccountDTO bankAccountDTO, HttpSession session) throws Exception{
		System.out.println("BankAccount Add");
		BankMembersDTO bankMembersDTO = (BankMembersDTO)session.getAttribute("member");
		
		bankAccountDTO.setUserName(bankMembersDTO.getUserName());
		
		//DTO : userName(session), BookNum(parameter) 
		int result = this.bankAccountDAO.add(bankAccountDTO);
		System.out.println(result==1);
		
		return "redirect:../bankbook/list.iu";
	}
}
