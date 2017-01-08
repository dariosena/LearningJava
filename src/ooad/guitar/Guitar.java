package ooad.guitar;

public class Guitar {

	private String serialNumber;
	private GuitarSpec guitarSpec;
	private double price;
	
	public Guitar(String serialNumber, double price) {
		this.price = price;
		this.serialNumber = serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public GuitarSpec getGuitarSpec() {
		return guitarSpec;
	}
	
	public void setGuitarSpec(GuitarSpec guitarSpec) {
		this.guitarSpec = guitarSpec;
	}
}
