package com.iu.start.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionTest {
	
	
	public static Connection getConnection() throws Exception{
		//1. 접속 정보 작성
		
		//id
		String user ="hr";
		//pw
		String password="hr";
		//ip:port
		String url = "jdbc:oracle:thin:@192.168.7.23:1521:xe";
		//driver 명
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		//2. driver 메모리에 로딩
		Class.forName(driver);
		
		//3. DB 연겷 후 Connection 객체 반환
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println(con);
		
		return con;
	}
	
	
//		public static Connection getConnection() throws Exception{
//			// id,pw,url,driver
//			// getConnection
//			
//			String user = "hr";
//			String password = "hr";
//			String url = "jdbc:oracle:thin:@192.168.7.23:1521:xe"; //127.0.0.1, localhost, oracle port = 1521
//			String driver = "oracle.jdbc.driver.OracleDriver";
//			
//			//Class.forName(driver);
//			
//			Connection con = DriverManager.getConnection(url, user,password);
//			
//			
//		} 
//		
		
		
	

}
