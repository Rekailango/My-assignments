
public class IsPrime {

	public static void main(String[] args) {
		int n = 50;

		for (int i = 2; i <= 50; i++) {
			boolean isPrimeNumber = true;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					isPrimeNumber = false;

					break;

				}

			}

			if (i%2!=0) {

				System.out.println(i);
			}

		}
	}

}
