package com.iu.start.bankMembers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

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

		
		System.out.println("성공 전");
		int result = st.executeUpdate();
		System.out.println("성공 후");
		
		//6.연결 해제
		DBConnector.disConnect(st, con);
		
		return result;
	}
	public ArrayList<BankMembersDTO> getSearchByID(String search) throws Exception{
		ArrayList<BankMembersDTO> ar = new ArrayList<BankMembersDTO>();
		Connection con = DBConnector.getConnection();
		String sql = "SELECT * FROM BANKMEMBERS WHERE USERNAME LIKE ? ORDER BY USERNAME ASC";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, "%"+search+"%");
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			BankMembersDTO bankMembersDTO = new BankMembersDTO();
			bankMembersDTO.setUserName( rs.getString("USERNAME"));
			bankMembersDTO.setPassWord(( rs.getString("PASSWORD")));
			bankMembersDTO.setName(( rs.getString("NAME")));
			bankMembersDTO.setEmail(( rs.getString("EMAIL")));
			bankMembersDTO.setPhone(( rs.getString("PHONE")));
			ar.add(bankMembersDTO);
		}
		return ar;
	}
}
