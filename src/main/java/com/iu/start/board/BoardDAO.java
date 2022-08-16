package com.iu.start.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.start.util.DBConnector;


public class BoardDAO {

	
	public ArrayList<BoardDTO> getList() throws Exception {
		ArrayList<BoardDTO> ar = new ArrayList<BoardDTO>(); 
		
		Connection con = DBConnector.getConnection();
		String sql = "SELECT * FROM BOARD ORDER BY WRITENUM DESC";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			BoardDTO dto = new BoardDTO();
			dto.setWriteNum(rs.getLong(1));
			dto.setWriteTitle(rs.getString(2));
			dto.setWriteContent(rs.getString(3));
			dto.setWriteUser(rs.getString(4));
			dto.setWriteDate(rs.getDate(5));
			dto.setHits(rs.getLong(6));
			ar.add(dto);
		}
		
//		DBConnector.disConnect(rs,st,con); 오류발생
		rs.close();
		st.close();
		con.close();
		return ar;
	}
	
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception{
		Connection con = DBConnector.getConnection();
		String sql = "SELECT * FROM BOARD WHERE WRITENUM=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setLong(1,boardDTO.getWriteNum());
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			boardDTO.setWriteNum(rs.getLong(1));
			boardDTO.setWriteTitle(rs.getString(2));
			boardDTO.setWriteContent(rs.getString(3));
			boardDTO.setWriteUser(rs.getString(4));
			boardDTO.setWriteDate(rs.getDate(5));
			boardDTO.setHits(rs.getLong(6));
		}
		
		return boardDTO;
	}
}
