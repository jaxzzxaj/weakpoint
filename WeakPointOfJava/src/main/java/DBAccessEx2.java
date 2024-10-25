package ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBAccessEx2 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/OuyouDB";
		String user = "root";
		String password = "";

		try (Connection con = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = con.prepareStatement(
						"SELECT id,name,age,unit_name FROM trainee "
								+ "JOIN unit ON trainee.unit_id = unit.unit_id "
								+ "WHERE id = 7")) {
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String unit_name = rs.getString("unit_name");
				System.out.println("ID：" + id
						+ " 名前：" + name
						+ " 年齢：" + age
						+ " 単元：" + unit_name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
