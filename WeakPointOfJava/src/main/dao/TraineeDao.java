package ex5_1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ex5.entity.Trainee;

public class TraineeDao {
	private static final String URL = "jdbc:mysql://localhost/OuyouDB";
	private static final String USER = "root";
	private static final String PASSWORD = "";

	/**
	 * IDに一致する研修生を取得する
	 *
	 * @param id
	 * @return Trainee
	 */
	public Trainee searchById(int id) {
		Trainee trainee = null;
		try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement("SELECT * FROM trainee WHERE id = ?")) {
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				trainee = new Trainee();
				trainee.setId(rs.getInt("id"));
				trainee.setName(rs.getString("name"));
				trainee.setAge(rs.getInt("age"));
				trainee.setGender(rs.getString("gender"));
				trainee.setCoId(rs.getInt("co_id"));
				trainee.setUnitId(rs.getInt("unit_id"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return trainee;
	}

}
