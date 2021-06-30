package calc;

public class Results {

	public static int physics = 100;
	public static int chemistry = 150;
	public static int biology = 80;
	public static int total = physics + chemistry + biology;
	public static double percentage = (total / 450.00) * 100;

	public static void displayResults() {
		System.out.print("Physics:");
		System.out.println(physics);
		System.out.print("Chemsitry:");
		System.out.println(chemistry);
		System.out.print("Biology:");
		System.out.println(biology);
		System.out.print("Total:");
		System.out.println(total);
	}

	public static void getPercentage() {
		System.out.print("Percentage: ");
		System.out.println(percentage);
	}

}
