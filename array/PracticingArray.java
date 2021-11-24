public class PracticingArray {
	public static void main(String[] args) {
	arrayNumber();
	arrayStrings();
	}

 	public static void arrayNumber() {
	int[] squareRow = {1, 4, 9, 16, 25};

	for (int n : squareRow) {
		System.out.println(n);
		}
	}

	public static void arrayStrings() {

	String[] family = {"Father", "Mother", "Brother", "Sister"};

	for (String i : family) {
		System.out.println(i);
		}
	}
}
