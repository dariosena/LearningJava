package ooad.guitar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List<Guitar> guitars;
	
	public Inventory() {
		this.guitars = new LinkedList<Guitar>();
	}
	
	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, 
			Wood backWood, Wood topWood, int numStrings) {
		
		GuitarSpec guitarSpec = new GuitarSpec(model, backWood, topWood, builder, type, numStrings);
		Guitar guitar = new Guitar(serialNumber, price);
		guitar.setGuitarSpec(guitarSpec);
		
		this.guitars.add(guitar);
		
	}
	
	public Guitar getGuitar(String serialNumber) {
		
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		
		return null;
	}
	
	public List<Guitar> search(GuitarSpec searchSpec) {

		List<Guitar> matchingGuitars = new LinkedList<Guitar>();
		
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			
			Guitar guitar = i.next();
			GuitarSpec guitarSpec = guitar.getGuitarSpec();
			
			if (searchSpec.equals(guitarSpec)) {
				matchingGuitars.add(guitar);
			}
			
		}

		return matchingGuitars;
	}
}
