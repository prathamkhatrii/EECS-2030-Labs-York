package lab2;

/**
 * Objective: practice If statements, nested If statements, Demorgan's Law, Data
 * Comparison
 *
 */
public class Lab2 {
	/**
	 * Takes an integer as the gender of a person, integer age, double weigh, double
	 * height, and a boolean athlete and calculates the needed daily calories for
	 * that person as a double.
	 */
	public static double getCalories(int gender, int age, double weight, double height, boolean athlete) {
		double maleCal = ((10 * weight) + (6.25 * height) - (5 * age) + 5);
		double femaleCal = ((10 * weight) + (6.25 * height) - (5 * age) - 161);
		double maleAthleteCal = (1.20 * maleCal);
		double femaleAthleteCal = (1.15 * femaleCal);
		if (gender == 1 && athlete == false) {
			if (age > 0 && weight > 0 && height > 0) {
				return maleCal;
			} else {
				return -1;
			}
		}
		if (gender == 1 && athlete == true) {
			if (age > 0 && weight > 0 && height > 0) {
				return maleAthleteCal;
			} else {
				return -1;
			}
		}
		if (gender == 2 && athlete == false) {
			if (age > 0 && weight > 0 && height > 0) {
				return femaleCal;
			} else {
				return -1;
			}
		}
		if (gender == 2 && athlete == true) {
			if (age > 0 && weight > 0 && height > 0) {
				return femaleAthleteCal;
			} else {
				return -1;
			}
		} else if (gender > 3 || gender < 1) {
			return -1;
		} else {
			return -1;
		}
	}

	/**
	 * Takes a salary as a double and calculates the tax owed for this salary
	 * returns a double value. if the salary is an invalid amount it returns -1.
	 */
	public static double computeTax(double income) {
		double tax1 = 0 + (0.10 * (income));
		double tax2 = 715 + (0.15 * (income - 7150));
		double tax3 = 4000 + (0.25 * (income - 29050));
		double tax4 = 14325 + (0.28 * (income - 70350));
		if (income > 0 && income <= 7150) {
			return tax1;
		} else if (income > 7150 && income <= 29050) {
			return tax2;
		} else if (income > 29050 && income <= 70350) {
			return tax3;
		} else if (income > 70350) {
			return tax4;
		} else {
			return -1;
		}
	}

	/**
	 * Takes a date as three integers:day, month, and year. The method returns a
	 * true if he date is valid and false otherwise. The method checks if the month
	 * is valid, and the year is after the year 1000. It checks if the day is valid
	 * according to the month. If the month is february, it checks if the year is a
	 * leap year
	 */
	public static boolean validDate(int day, int month, int year) {
		boolean monthValid = false;
		boolean yearValid = false;
		boolean dayValid = false;
		int daysInMonth = 0;
		boolean isLeapYear = false;

		if (year >= 1000) {
			yearValid = true;
		} else {
			yearValid = false;
		}

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			isLeapYear = true;
		} else {
			isLeapYear = false;
		}
		if (month >= 1 && month <= 12) {
			monthValid = true;
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				daysInMonth = 31;
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				daysInMonth = 30;
			} else if (month == 2) {

				if (isLeapYear == true) {
					daysInMonth = 29;

				} else if (isLeapYear == false) {
					daysInMonth = 28;

				}
			}
		} else {
			monthValid = false;
		}

		if (day >= 1 && day <= daysInMonth) {
			dayValid = true;
		} else {
			dayValid = false;
		}
		if (yearValid == true && monthValid == true && dayValid == true) {
			return true;
		} else {
			return false;
		}
	}
}
