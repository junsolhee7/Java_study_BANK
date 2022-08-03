package com.iu.start.test;

import java.util.ArrayList;

import com.iu.start.bankMembers.BankMembersDAO;
import com.iu.start.bankMembers.BankMembersDTO;

public class TestMain {

	public static void main(String[] args) {

		BankMembersDAO bankMembersDAO = new BankMembersDAO();
		BankMembersDTO bankMembersDTO = new BankMembersDTO();
		
//		bankMembersDTO.setUserName("타락파워전사");
//		bankMembersDTO.setPassWord("1234");
//		bankMembersDTO.setName("전하준");
//		bankMembersDTO.setEmail("junsolhee7@navercom");
//		bankMembersDTO.setPhone("010-9510-0258");
		

		try{
//			int result = bankMembersDAO.setJoin(bankMembersDTO);
//			System.out.println(result==1);
			
			ArrayList<BankMembersDTO> ar = bankMembersDAO.getSearchByID("냉");
			System.out.println("USERNAME \t PASSWORD \t NAME \t EMAIL \t PHONE");
			for(BankMembersDTO bankMembers : ar) {
				System.out.print(bankMembers.getUserName()+"\t");	
				System.out.print(bankMembers.getPassWord()+"\t");	
				System.out.print(bankMembers.getName()+"\t");	
				System.out.print(bankMembers.getEmail()+"\t");	
				System.out.println(bankMembers.getPhone()+"\t");
				
				System.out.println("-----------------------------------");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}


	}
}
