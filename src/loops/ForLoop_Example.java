package loops;

public class ForLoop_Example {

	public static void main(String[] args) {
		// ✅ Task 0: A loop to print numbers 1–10
		for (int i = 1; i <= 10; i++) {
			System.out.println("number " + i);
		}

		// ✅ Task 1: Print Even Numbers from 2 to 20
		for (int j = 2; j <= 20; j += 2) {
			System.out.println("Even numbers: " + j);
		}

		// ✅ Task 2: Print All Browser Names from an Array
		String[] browsers = { "chrome", "firefox", "brave" };
		for (int k = 0; k < browsers.length; k++) {
			System.out.println("browser name is: " + browsers[k]);
		}

	}

}
