package day2a;

public class StringFormatDemo {

	public static void main(String[] args) {
		System.out.println(String.format("%-30s", "Below 100 Units") + "Rs " +String.format("%-5.2f", 2.5));
		System.out.println(String.format("%-30s", "101 to 200 Units") + "Rs " +String.format("%-5.2f", 3.5));
		System.out.println(String.format("%-30s", "201 to 300 Units") + "Rs " +String.format("%-5.2f", 4.5));
		System.out.println(String.format("%-30s", "Above 300 Units") + "Rs " +String.format("%-5.2f", 5.5));
		System.out.println(String.format("%-30s", "Fixed Meter Charges") + "Rs " +String.format("%-5d", 100));
		

	}

}
