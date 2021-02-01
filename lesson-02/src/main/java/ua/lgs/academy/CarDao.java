package ua.lgs.academy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarDao {

	private static String READ_ALL = "select * from car";
	private static String CREATE = "insert into car(manufacturer,model,color,model_year,price,description) values(?,?,?,?,?,?)";
	private static String READ_BY_ID = "select * from car where id =?";
	private static String UPDATE_BY_ID = "update car set manufacturer =?, model=?, color=?, model_year=?, price=?, description=? where id=?";
	private static String DELETE_BY_ID = "delete from car where id=?";

	private Connection connection;
	private PreparedStatement preparedStatement;

	public CarDao(Connection connection) {
		this.connection = connection;
	}

	public void insert(Car car) throws SQLException {
		preparedStatement = connection.prepareStatement(CREATE);
		preparedStatement.setString(1, car.getManufactutrer());
		preparedStatement.setString(2, car.getModel());
		preparedStatement.setString(3, car.getColor());
		preparedStatement.setInt(4, car.getModelYear());
		preparedStatement.setDouble(5, car.getPrice());
		preparedStatement.setString(6, car.getDescription());

		preparedStatement.executeUpdate();
	}

	public void update(Car car) throws SQLException {
		preparedStatement = connection.prepareStatement(UPDATE_BY_ID);
		preparedStatement.setString(1, car.getManufactutrer());
		preparedStatement.setString(2, car.getModel());
		preparedStatement.setString(3, car.getColor());
		preparedStatement.setInt(4, car.getModelYear());
		preparedStatement.setDouble(5, car.getPrice());
		preparedStatement.setString(6, car.getDescription());
		preparedStatement.setInt(7,car.getId());
		preparedStatement.executeUpdate();
	}

	public Car read(int id) throws SQLException {
		preparedStatement = connection.prepareStatement(READ_BY_ID);
		preparedStatement.setInt(1, id);
		ResultSet result = preparedStatement.executeQuery();
		result.next();
		return CarMapper.map(result);

	}

	public void delete(int id) throws SQLException {
		preparedStatement = connection.prepareStatement(DELETE_BY_ID);
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
	}

	public List<Car> readAll() throws SQLException {
		List<Car> listOfCars = new ArrayList<>();
		preparedStatement = connection.prepareStatement(READ_ALL);
		ResultSet result = preparedStatement.executeQuery();
		while (result.next()) {
			listOfCars.add(CarMapper.map(result));
		}
		return listOfCars;
	}

}
