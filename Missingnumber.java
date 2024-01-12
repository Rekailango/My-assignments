
public class Missingnumber {

	public static void main(String[] args) {

		boolean isavailable = false;
		int arr1[] = { 1, 4, 3, 2, 8, 6, 7, 5 };
		int arr2[] = { 1, 4, 3, 2, 8, 6, 7 };
		for (int i = 0; i <= 7; i++) {
			isavailable = false;
			for (int j = 0; j <= 6; j++) {

				if (arr1[i] == arr2[j]) {
					isavailable = true;
				}

			}
			if (isavailable == false) {
				System.out.println(arr1[i]);
			}
			
		}

	}
}
