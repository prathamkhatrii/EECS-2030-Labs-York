package Lab0;

public class Lab0 {

	public static String getMyID(){
		return "219447424";
	}
	
	public static String getLetterGrade(double grade) {
		if (grade>=90) {
			return "A+";
		}
		else if(grade>=80 && grade<90) {
			return "A";
		}
		else if(grade>=75 && grade<80) {
			return "B+";
		}
		else if(grade>=70 && grade<75) {
			return "B";
		}
		else if(grade>=65 && grade<70) {
			return "C+";
		}
		else if(grade>=60 && grade<65) {
			return "C";
		}
		else if(grade>=55 && grade<60) {
			return "D+";
		}
		else if(grade>=50 && grade<55) {
			return "D";
		}
		else if(grade>=45 && grade<50) {
			return "E";
		}
		else if(grade<45) {
			return "F";
		}
		return "";
	}
}
