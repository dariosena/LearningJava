package ooad.guitar;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

	public static void main(String[] args) {
		
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		GuitarSpec whatErinLikes = new GuitarSpec("Stratocastor", Wood.ALDER, Wood.ALDER, 
				Builder.FENDER, Type.ELETRIC, 6);
		
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
		
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like this guitars:");
			for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = i.next();
				GuitarSpec guitarSpec = guitar.getGuitarSpec();
				System.out.println(" We have a "
						+ guitarSpec.getBuilder() + " " + guitarSpec.getModel() + " "
						+ guitarSpec.getNumStrings() + "-string "
						+ guitarSpec.getType() + " guitar:\n    "
						+ guitarSpec.getBackWood() + " back and sides, \n    "
						+ guitarSpec.getTopWood() + " top.\n You can have it for only $"
						+ guitar.getPrice() + "!\n ----");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", 
				Type.ELETRIC, Wood.ALDER, Wood.ALDER, 6);
		
		inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor", 
				Type.ELETRIC, Wood.ALDER, Wood.ALDER, 6);
	}

}
