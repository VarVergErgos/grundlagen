package de.boeken.beispiel001;

public enum Kombination {
	KOMBINATION_ONE("Fixum: 70,00 % Variable: 30,00%", 70.00, 30.00), KOMBINATION_TWO("Fixum: 65,00 % Variable: 35,00%",65.00, 35.00),
	KOMBINATION_THREE("Fixum: 60,00 % Variable: 40,00%",60.00, 40.00), KOMBINATION_FOUR("Fixum: 50,00 % Variable: 50,00%",50.00, 50.00);

	private final double fix;
	private final double variable;
	private final String variante;

	private Kombination(String variante, double fix, double variable) {
		this.variante = variante;
		this.fix = fix;
		this.variable = variable;
	}

	public double getFixenAnteil() {
		return fix;
	}

	public double getVariablenAnteil() {
		return variable;
	}

	public String getVariante() {
		return variante;
	}
	
	

}
