package ua.lgs.academy;

public class Car {
	private int id;
	private String manufactutrer;
	private String model;
	private String color;
	private int modelYear;
	private double price;
	private String description;
	
	public Car(String manufactutrer, String model, String color, int modelYear, double price, String description) {
		this.manufactutrer = manufactutrer;
		this.model = model;
		this.color = color;
		this.modelYear = modelYear;
		this.price = price;
		this.description = description;
	}

	public Car(int id, String manufactutrer, String model, String color, int modelYear, double price,
			String description) {
		this.id = id;
		this.manufactutrer = manufactutrer;
		this.model = model;
		this.color = color;
		this.modelYear = modelYear;
		this.price = price;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getManufactutrer() {
		return manufactutrer;
	}

	public void setManufactutrer(String manufactutrer) {
		this.manufactutrer = manufactutrer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", manufactutrer=" + manufactutrer + ", model=" + model + ", color=" + color
				+ ", modelYear=" + modelYear + ", price=" + price + ", description=" + description + "]";
	}
	
	
	
	
	
}
