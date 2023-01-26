package com.yedam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExe {

	public static void main(String[] args) {
		// jdbc 오라클 데이터 CRUD작업.
		// 1.ojdbc.jar라이브러리.
		// 2.Connection 객체. db연걸 쿼리실행 or 실행결과 통로.
		Connection conn; 
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "insert into employees(employee_id, job_id, last_name, email, hire_date)"
					 + "values(300, 'IT_PROG', '홍', 'HONG', sysdate)";
		
		sql = "update employees set first_name = '길동' where employee_id = '300'";
		
		// jdbc driver정상.
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 에러.");
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pass = "hr";
		
		try {
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("연결성공!!");
			stmt = conn.createStatement(); //쿼리실행 처리결과 객체
			
			int r = stmt.executeUpdate(sql); //db 정보 변경 insert,update,delete
			
			rs = stmt.executeQuery("select * from employees order by employee_id");
			
			while(rs.next()) {
				System.out.println("사원번호: " + rs.getInt("employee_id")
				+ ", 이름: " + rs.getString("first_name")
				+ ", 이메일: " + rs.getString("email")
				+ ", 급여: " + rs.getInt("salary"));
			}
			System.out.println("끝");
		} catch (SQLException e) {
			System.out.println("처리실패!!");
			e.printStackTrace();
		}
	}

}
















