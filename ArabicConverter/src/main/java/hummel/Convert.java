package main.java.hummel;

import java.util.*;

public class Convert {
	public static Scanner scan = new Scanner(System.in);
	public static HashMap<String, String> letters = new HashMap<>();
	static {
		letters.put("А", "");
		letters.put("Е", "");
		letters.put("Ё", "");
		letters.put("И", "");
		letters.put("О", "");
		letters.put("У", "");
		letters.put("Ы", "");
		letters.put("Э", "");
		letters.put("Ю", "");
		letters.put("Я", "");
		letters.put("Ь", "");

		letters.put("Б", "ب");
		letters.put("В", "و");
		letters.put("Г", "ه");
		letters.put("Д", "د");
		letters.put("Ж", "ژ");
		letters.put("З", "ض");
		letters.put("Й", "ى");
		letters.put("К", "ق");
		letters.put("Л", "ل");
		letters.put("М", "م");
		letters.put("Н", "ن");
		letters.put("П", "پ");
		letters.put("Р", "ر");
		letters.put("С", "ص");
		letters.put("Т", "ط");
		letters.put("Ф", "ف");
		letters.put("Х", "خ");
		letters.put("Ц", "ࢯ");
		letters.put("Ч", "چ");
		letters.put("Ш", "ش");
		letters.put("Щ", "ش");
		letters.put("Ъ", "ع");
	}

	public static void main(String[] args) {
		String entered;
		do {
			entered = scan.nextLine();
			entered = entered.toUpperCase();
			for (String sus: letters.keySet()) {
				entered = entered.replace(sus, letters.get(sus));
			}
			System.out.println(reverse(entered));
		} while (entered != "СТОП");
	}

	public static String reverse(String str) {
		  return new StringBuilder(str).reverse().toString();
	}

	public static void viceVersa() {
		letters.put("ب", "Б");
		letters.put("و", "В");
		letters.put("ه", "Г");
		letters.put("د", "Д");
		letters.put("ژ", "Ж");
		letters.put("ض", "З");
		letters.put("ى", "Й");
		letters.put("ق", "К");
		letters.put("ل", "Л");
		letters.put("م", "М");
		letters.put("ن", "Н");
		letters.put("پ", "П");
		letters.put("ر", "Р");
		letters.put("ص", "С");
		letters.put("ط", "Т");
		letters.put("ف", "Ф");
		letters.put("خ", "Х");
		letters.put("ࢯ", "Ц");
		letters.put("چ", "Ч");
		letters.put("ش", "Ш");
		letters.put("ع", "Ъ");
	}
}