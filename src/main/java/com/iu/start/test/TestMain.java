package com.iu.start.test;

import com.iu.start.bankMembers.BankMembersDAO;
import com.iu.start.bankMembers.BankMembersDTO;

public class TestMain {

	public static void main(String[] args) {
	
		System.out.println("Start!");
		BankMembersDTO bankMembersDTO = new BankMembersDTO();
		BankMembersDAO bankMembersDAO = new BankMembersDAO();
		bankMembersDTO.setUserName("JeonHaJun");
		bankMembersDTO.setPassWord("1234");
		bankMembersDTO.setName("전하준");
		bankMembersDTO.setEmail("junsolhee7@naver.com");
		bankMembersDTO.setPhone("010-9510-0258");
		
		try{
			int result = bankMembersDAO.setJoin(bankMembersDTO);
					System.out.println(result==1);	
		}
		catch(Exception e) {
			e.printStackTrace();
		}


	}
}
