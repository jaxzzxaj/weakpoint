package ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBAccessEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("会社名を入力してください。");
		System.out.print("→");
		String co_name = sc.next();

		String url = "jdbc:mysql://localhost/OuyouDB";
		String user = "root";
		String password = "";

		try (Connection con = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = con.prepareStatement("SELECT id,name FROM trainee "
						+ "JOIN company ON trainee.co_id = company.co_id "
						+ "WHERE co_name = ? ORDER BY id")) {
			pstmt.setString(1, co_name);
			ResultSet rs = pstmt.executeQuery();

			boolean isFound = false;

			while (rs.next()) {
				isFound = true;
				int id = rs.getInt("id");
				String name = rs.getString("name");
				System.out.println("ID：" + id + " 名前：" + name);
			}

			if (isFound == false) {
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
