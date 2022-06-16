import java.util.Locale;
public class exercicio1 {
	public static void main(String[] args) {
		String product1 = "computer";
		String product2 = "office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'f';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("products:");
		System.out.printf("%s, wich price is %.2f%n", product1, price1);
		System.out.printf("%s, wich price is %.2f%n", product2, price2);
		System.out.println(" ");
		System.out.printf("record: %d years old, code %d and gender: %C%n", age, code, gender);
		System.out.println("  ");
		System.out.printf("measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places: %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		
}
}