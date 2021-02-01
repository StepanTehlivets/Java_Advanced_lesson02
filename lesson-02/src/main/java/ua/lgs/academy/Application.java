package ua.lgs.academy;

import java.sql.SQLException;

public class Application {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		CarDao carDao = new CarDao(ConnectionUtils.openConnection());

		carDao.readAll().forEach(System.out::println);

		carDao.delete(3);
		System.out.println("");
		carDao.readAll().forEach(System.out::println);

		Car carFormDB = carDao.read(4);
		System.out.println("");
		System.out.println(carFormDB);
		carFormDB.setColor("green");
		carFormDB.setDescription("Blank");
		carDao.update(carFormDB);
		System.out.println("");
		Car carFormDB2 = carDao.read(2);
		System.out.println(carFormDB2);
		System.out.println("");
		
		Car carToAddToDB = new Car("Audi", "A4", "black", 2003, 120.21, "");
		
		try {
			carDao.insert(carToAddToDB);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		carDao.readAll().forEach(System.out::println);
		
}}
