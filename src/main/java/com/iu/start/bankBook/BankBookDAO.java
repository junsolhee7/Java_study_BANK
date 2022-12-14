package com.iu.start.bankBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;

import com.iu.start.bankMembers.BankMembersDTO;
import com.iu.start.util.DBConnector;
	
	public class BankBookDAO implements BookDAO {
		
		public int setDelete(BankBookDTO bankBookDTO)throws Exception{
			Connection con = DBConnector.getConnection();
			String sql = "DELETE BANKBOOK WHERE BOOKNUM=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setLong(1,bankBookDTO.getBookNum());
			int result = st.executeUpdate();
			DBConnector.disConnect(st, con);
			return result;	
		}
		
		@Override
		public int setUpdate(BankBookDTO bankBookDTO) throws Exception{
			Connection con = DBConnector.getConnection();
			String sql = "UPDATE BANKBOOK SET BOOKNAME=?, BOOKRATE=? WHERE BOOKNUM=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,bankBookDTO.getBookName());
			st.setDouble(2,bankBookDTO.getBookRate());
			st.setLong(3,bankBookDTO.getBookNum());
			int result = st.executeUpdate();
			DBConnector.disConnect(st, con);
			return result;
					
		}

		
		@Override
		public int setBankBook(BankBookDTO bankBookDTO) throws Exception {
			long milis = System.currentTimeMillis();
			System.out.println(milis);
			Connection con = DBConnector.getConnection();
			String sql = "INSERT INTO BANKBOOK VALUES(?,?,?,0)";
			PreparedStatement st = con.prepareStatement(sql);
			
			
			st.setLong(1,milis);
			st.setString(2,bankBookDTO.getBookName());
			st.setDouble(3,bankBookDTO.getBookRate());
			int result = st.executeUpdate();
			DBConnector.disConnect(st, con);
			return result;
			
		}

		@Override
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

		@Override
		public int setChangeSale(BankBookDTO bankBookDTO) throws Exception {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception {
			
			BankBookDTO banBookDTO2=null;
			
			Connection con = DBConnector.getConnection();
			
			String sql ="SELECT * FROM BANKBOOK WHERE BOOKNUM=?";
			
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setLong(1, bankBookDTO.getBookNum());
			
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				banBookDTO2 = new BankBookDTO();
				banBookDTO2.setBookNum(rs.getLong("BOOKNUM"));
				banBookDTO2.setBookName(rs.getString("BOOKNAME"));
				banBookDTO2.setBookRate(rs.getDouble("BOOKRATE"));
				banBookDTO2.setBookSale(rs.getInt("BOOKSALE"));
			}
			DBConnector.disConnect(rs, st, con);
			return banBookDTO2;
		}

	}