package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");

		String ortaMetin = "İlginizi Çekebilir";
		String altMetin = "Vade Süresi";

		System.out.println("ortaMetin");

		int vade = 12;

		double dolarDun = 18.20;
		double dolarBug = 18.15;

		boolean dolarDustumu = false;

		String okYonu = "";

		if (dolarBug < dolarDun) { // True
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBug > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}

		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		// ARRAYLER

		String[] krediler = { "Hızlı Kredi", "Maaşını Halkbanktan", "Mutlu Emekli" };
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);

		}

	}
}
