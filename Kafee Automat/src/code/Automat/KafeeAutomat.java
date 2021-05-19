package code.Automat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class KafeeAutomat {

	public static void main(String[] args) {

		int auswahl, geldAuswahl = 0;
		double preis = 0, einwurf = 0;
		String getraenk = "";
		String auswahl2 = "";
		DecimalFormat df = new DecimalFormat(",##0.00");
		do {
			System.out.println(
					"Menü: \n1-Kafee			1,00 €\n2-Cappucino		1,50 €\n3-Kakao			2,00 €\n4-Espresso		1,20 €");
			auswahl = new Scanner(System.in).nextInt();

			switch (auswahl) {
			case 1:
				preis = 1.00;
				getraenk = "Kafee";
				break;
			case 2:
				preis = 1.50;
				getraenk = "Capuccino";
				break;
			case 3:
				preis = 2.00;
				getraenk = "Kakao";
				break;
			case 4:
				preis = 1.20;
				getraenk = "Espresso";
				break;
			default:
				System.out.println("Falsch Eingabe!!!");
				break;
			}

			do {
				System.out.println("Zahlen Sie bitte " + preis + " €");
				System.out.println("Geldeinwurf:\n1-10 Cent\n2-20 Cent\n3-50 Cent");
				geldAuswahl = new Scanner(System.in).nextInt();
				switch (geldAuswahl) {
				case 1:
					einwurf = einwurf + 0.1;
					break;
				case 2:
					einwurf = einwurf + 0.2;
					break;
				case 3:
					einwurf = einwurf + 0.5;
					break;
				default:
					System.out.println("Falsch eingabe!!!");
					break;
				}
				System.out.println("Bereits bezahlt " + einwurf + " €");

			} while (einwurf < preis);// !(einwurf>=preis)
			System.out.println("Erhalten Sie " + df.format((einwurf - preis)) + " € zurück.");
			System.out.println("Ihr Getränk " + getraenk + " ist bereit");
			System.out.println("Möchten Sie neu bestellen J/N");
			auswahl2 = new Scanner(System.in).nextLine();

		} while (auswahl2.equalsIgnoreCase("j"));

		System.out.println("Guten Apetit!!!");

	}
}
