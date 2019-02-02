package de.boeken.beispiel001;

public class AppKombination {

	private static double zieleinkommen = 100000;
	private static Kombination kombi;

	public static void main(String[] args) {

		ausgabeBerechnung(Kombination.KOMBINATION_ONE.name());
		ausgabeBerechnung(Kombination.KOMBINATION_TWO.name());
		ausgabeBerechnung(Kombination.KOMBINATION_THREE.name());
		ausgabeBerechnung(Kombination.KOMBINATION_FOUR.name());

		
		for(Kombination k : Kombination.values()) {
			System.out.println(k.getVariante());
		}
	}

	private static void ausgabeBerechnung(String kombination) {
		kombi = Kombination.valueOf(kombination);

		kombi = Kombination.valueOf(kombination);

		System.out.println(kombi.getVariante() + " :   " + kombi.getFixenAnteil());
		System.out.println(kombi.getVariante() + " :   " + kombi.getVariablenAnteil());
		System.out.println("");
		System.out.println("Zieleinkommen:\t\t " + String.format("%10.2f", zieleinkommen));
		System.out.println("Fixum:\t\t\t "       + String.format("%10.2f", berechneFixum()));
		System.out.println("Variable:\t\t "      + String.format("%10.2f", berechneVariable()));
		System.out.println("--------------------------------------------");
		System.out.println("");

		
	}

	private static double berechneFixum() {

		return zieleinkommen * kombi.getFixenAnteil() / 100.00;
	}

	private static double berechneVariable() {

		return zieleinkommen * kombi.getVariablenAnteil() / 100.00;
	}
}
