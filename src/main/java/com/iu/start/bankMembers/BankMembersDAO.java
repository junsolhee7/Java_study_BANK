package com.iu.start.bankMembers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.start.util.DBConnector;

public class BankMembersDAO {
	
	public int setJoin(BankMembersDTO bankMembersDTO) throws Exception{
		//1.DB 연결
		Connection con = DBConnector.getConnection();
		
		//2.sql 작성
		String sql = "INSERT INTO BANKMEMBERS VALUES(?,?,?,?,?)";
		
		//3.미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4.? 세팅
		st.setString(1, bankMembersDTO.getUserName());
		st.setString(2, bankMembersDTO.getPassWord());
		st.setString(3, bankMembersDTO.getName());
		st.setString(4, bankMembersDTO.getEmail());
		st.setString(5, bankMembersDTO.getPhone());
		
		//5.전송후 결과처리
		System.out.println("Start1!");
		ResultSet rs = st.executeQuery();
		System.out.println("Start2!");
		String username = rs.getString("USERNAME");
		System.out.println("Start3!");
		System.out.println(username);
		System.out.println("Start4!");
		
		
		//6.연결 해제
		
		int result = st.executeUpdate();
		System.out.println("Finish");
		return result;
		
	}

}
