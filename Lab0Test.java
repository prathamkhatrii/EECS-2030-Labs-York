
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class Lab0Test {

	@Test
	public void testStudentNo() {
		String myId = Lab0.getMyID(); 
		boolean correct = false;
		correct = myId.length() == 9 ? true : false;
		assertTrue(correct, "Your student id does not contain 9 digits");		
	}
	
	@Test
	public void testAPlus() {
		String letterGrade = Lab0.getLetterGrade(93.00); 
		boolean correct = false;
		correct = letterGrade.compareTo("A+") == 0 ? true : false;
		assertTrue(correct, "A+ grade is not computed correctly!");		
	}
	
	//write test cases for the corresponding grade values
	
}