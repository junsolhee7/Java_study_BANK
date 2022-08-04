package com.iu.start.bankBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.start.util.DBConnector;

public class BankBookDAO {
	
//	public int setBankBook(BankBookDTO bankBookDTO) throws Exception{
//		Connection con = DBConnector.getConnection();
//		String sql = "INSERT INTO BANKBOOK VALUES (?,?,?,1)";
//		
//	};
//
//	public ArrayList<BankBookDTO> getList() throws Exception{
//		
//	};
//	
//	
//	public int setChangeSale(BankBookDTO bankBookDTO) throws Exception{
//		
//	};
//	
//	public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception{
//		
//	};

	public ArrayList<BankBookDTO> getList() throws Exception {
		ArrayList<BankBookDTO> ar = new ArrayList<BankBookDTO>();

		Connection con = DBConnector.getConnection();
		String sql = "SELECT * FROM BANKBOOK ORDER BY BOOKNUM DESC";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			BankBookDTO dto = new BankBookDTO();
			dto.setBookNum(rs.getLong(1));
			dto.setBookName(rs.getString(2)); 
			dto.setBookRate(rs.getDouble(3)); 
			dto.setBookSale(rs.getInt(4)); 
			ar.add(dto);
		}
		DBConnector.disConnect(rs, st, con);
		return ar;
	}
}
