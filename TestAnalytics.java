package lab6;

public class TestAnalytics {
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private final static int NUMOFQUESTIONs = 50;
	private final static int MARKFORQUESTION = 2;
	private final static int NUMOFQUESTIONCHOICES = 4;
	private final static String TESTCORRECTANSWER = "D,C,A,D,A,B,C,D,B,C,A,B,D,C,A,A,"
			+ "A,C,A,B,B,D,B,D,A,B,B,A,C,B,C,A,C,B,B,C,C,C," + "A,B,A,B,B,C,A,B,A,A,D,C";

	private String stdName;

	private String[] s;

	private String stdId;

	private String stdAns;

	private int grade;

	private double gradeF;

	private int s1, s2, s3, s4;

	private String msg;

	private String temp;

	private int count;

	public TestAnalytics() {
	}

	public TestAnalytics(String str) {
		this.count = 0;
		this.temp = "";
		this.msg = "";
		this.s = str.split(",", 3);
		this.stdName = s[0];
		this.stdId = s[1];
		this.stdAns = s[2];
		this.grade = 0;
		this.s1 = 0;
		this.s2 = 0;
		this.s3 = 0;
		this.s4 = 0;

		for (int i = 0; i < TESTCORRECTANSWER.length(); i += 2) {
			if (this.stdAns.toUpperCase().charAt(i) == this.TESTCORRECTANSWER.toUpperCase().charAt(i)) {
				grade += 2;
				gradeF = grade;
				temp = String.format("%5.2f", gradeF);
				count += 1;

			} else {
				grade += 0;
				gradeF = grade;
				temp = String.format("%5.2f", gradeF);
				count += 0;
			}
		}
		if (grade < 50) {
			msg += "Student(" + stdName + ") failed the test. " + stdName + " answered (" + count
					+ ") correct questions and scored ( " + temp + ") out of 100.";
		} else {
			msg += "Student(" + stdName + ") passed the test. " + stdName + " answered (" + count
					+ ") correct questions and scored ( " + temp + ") out of 100.";
		}
		for (int j = 0; j < TESTCORRECTANSWER.length(); j += 2) {
			if (this.stdAns.toUpperCase().charAt(j) == 'A') {
				s1 += 1;

			} else if (this.stdAns.toUpperCase().charAt(j) == 'B') {
				s2 += 1;

			} else if (this.stdAns.toUpperCase().charAt(j) == 'C') {
				s3 += 1;

			} else if (this.stdAns.toUpperCase().charAt(j) == 'D')
				s4 += 1;

		}
	}

	public String getStudentName() {
		return stdName;
	}

	public String getStudentID() {
		return stdId;
	}
	public String getStudentAnswer() {
		return stdAns;
	}

	public int calculateStudentGrade() {
		return grade;
	}

	public String getStudentAnswerFrequency() {
		return "The frequency of the student(" + stdName + ") answer is A(" + s1 + "), B(" + s2 + "), C(" + s3
				+ ") and D(" + s4 + ").";
	}

	public String toString() {
		return msg;
	}

	// TODO: Your implementation starts here

	// TODO: Your implementation starts here
	/*
	 * Your implementation starts here Recall that : 1. No System.out.println
	 * statements should appear here. Instead, you need to return the result. 2. No
	 * Scanner operations should appear here (e.g., input.nextInt()). Instead, refer
	 * to the input parameters of this method.
	 */

}
