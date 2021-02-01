package ua.lgs.academy;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CarMapper {
	public static Car map(ResultSet result) throws SQLException {
		int id = result.getInt("id");
		String manufacturer = result.getString("manufacturer");
		String model= result.getString("model");
		String color= result.getString("color");
		int modelYear= result.getInt("model_year");
		float price= result.getFloat("price");
		String description=result.getString("description");
		
		return new Car(id, manufacturer,model,color,modelYear,price,description);
		
	}
}
