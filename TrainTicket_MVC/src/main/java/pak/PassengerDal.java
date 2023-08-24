package pak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.json.JSONArray;

public class PassengerDal {
	public JSONArray add(String no, String name, String age, String gen) {
		JSONArray ja = new JSONArray();
		String url = "jdbc:postgresql://192.168.110.48:5432/plf_training?user=plf_training_admin&password=pff123";

		try {
			Class.forName("org.postgresql.Driver");
			Connection c = DriverManager.getConnection(url);

			PreparedStatement s = c
					.prepareStatement("INSERT INTO trn_Passenger(sno, name, age, gender) VALUES (?, ?, ?, ?)");
			s.setString(1, no);
			s.setString(2, name);
			s.setString(3, age);
			s.setString(4, gen);
			s.executeUpdate();
			// int rowsAffected = s.executeUpdate();
			// System.out.println(rowsAffected + " rows inserted.");
			c.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ja;
	}
}
