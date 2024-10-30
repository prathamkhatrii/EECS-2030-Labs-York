package lab4;

public class Lab4 {
	public static int longestSeq(int[] array) {
		if (array.length != 0) {
			int length = 1;
			int count = 1;
			for (int i = 1; i < array.length; i++) {
				if (array[i] != array[i - 1]) {
					if (array[i] == array[i - 1] + 1) {
						count += 1;
					} else {
						length = Math.max(length, count);
						count = 1;
					}
				}
			}
			if (Math.max(length, count) != 1) {
				return Math.max(length, count);
			} else {
				return 1;
			}
		} else {
			return 0;
		}
	}

	public static String countArray(int[] array) {
		String str = "";

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0 && array[i] >= 2 && array[i] < 100) {
				if (str.length() != 0) {
					str += "\n" + array[i] + ": ";
				} else {
					str += array[i] + ": ";
				}
				int count = 1;
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] == array[j]) {
						count++;
						array[j] = 1;
					}
				}
				str += count;
			}
		}
		return str;

	}

	public static boolean validString(String str1, String str2) {
		String s = "";
		for (int i = 0; i < str2.length(); i++) {
			for (int j = 0; j < str1.length(); j++) {

				if (str2.charAt(i) == str1.charAt(j)) {
					s += str1.charAt(j);
					str1 = str1.substring(j + 1);
					break;
				}

			}
		}
		if (s.equals(str2)) {
			return true;
		} else {
			return false;
		}
	}

	public static String arrayResult(int[][] array) {
		int sum = 0;
		int prod = 1;
		if (array.length == 1) {
			prod = 0;
		} else {
			prod = 1;
		}
		if (array.length > 0) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[0].length; j++) {
					if ((i + j) % 2 == 0) {
						sum += array[i][j];
					} else {
						prod *= array[i][j];
					}
				}
			}
			return "Sum:" + sum + ", " + "Product:" + prod;
		}
		return "";
	}

	public static boolean magicSquare(int[][] array) {
		int col = 0;
		int row = 0;
		int dia = 0;
		int n = array.length;
		if (array.length > 0 && array[0].length > 0) {
			for (int i = 0; i < array.length; i++) {
				dia += array[i][i];
				for (int j = 0; j < array[0].length; j++) {
					col += array[j][i];
					row += array[i][j];
				}
			}
			if (col / n == dia && row / n == dia && row / n == col / n) {
				return true;

			}
		}
		return false;
	}
}
