package de.boeken.beispiel002;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EnumMapTest {

	public static void main(String[] args) {

		Kisten[] kiste = new Kisten[] { 
				new Kisten("GELB", Kisten.Art.KISTE_KLEIN),
				new Kisten("ROT", Kisten.Art.KISTE_KLEIN), 
				new Kisten("BLAU", Kisten.Art.KISTE_KLEIN),

				new Kisten("SCHWARZ", Kisten.Art.KISTE_MITTEL), 
				new Kisten("BLAU", Kisten.Art.KISTE_MITTEL),
				new Kisten("GELB", Kisten.Art.KISTE_MITTEL),

				new Kisten("SCHWARZ", Kisten.Art.KISTE_GROSS), 
				new Kisten("BLAU", Kisten.Art.KISTE_GROSS),
				new Kisten("GELB", Kisten.Art.KISTE_GROSS), };

		Map<Kisten.Art, Set<Kisten>> kisteneNachArt = new EnumMap<Kisten.Art, Set<Kisten>>(Kisten.Art.class);

		for (Kisten.Art a : Kisten.Art.values())
			kisteneNachArt.put(a, new HashSet<Kisten>());
		for (Kisten f : kiste)
			kisteneNachArt.get(f.art()).add(f);

		System.out.println(kisteneNachArt);

	}

}

class Kisten {

	public enum Art {
		KISTE_KLEIN, KISTE_MITTEL, KISTE_GROSS
	};

	private final String farbe;
	private final Art art;

	public Kisten(String farbe, Art art) {

		this.farbe = farbe;
		this.art = art;
	}

	public Art art() {
		return art;
	}

	@Override
	public String toString() {
		return farbe;
	}

}
