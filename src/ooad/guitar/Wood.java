/**
 * 
 */
package ooad.guitar;

/**
 * @author dario
 *
 */
public enum Wood {

	INDIAN_ROSEWOOD, BRASILIAN_ROSEWOOD, MAHOGANY,
	MAPLE, COCOBOLO, ADIRONDACK, ALDER, SITKA;
	
	public String toString() {
		switch (this) {
			case INDIAN_ROSEWOOD: return "Indian Rosewood";
			case BRASILIAN_ROSEWOOD: return "Brasilian Rosewood";
			case MAHOGANY: return "Mahogany";
			case MAPLE: return "Maple";
			case COCOBOLO: return "Cocobolo";
			case ADIRONDACK: return "Adirondack";
			case ALDER: return "Alder";
			case SITKA: return "Sitka";
			default: return null;
		}
	}
}
