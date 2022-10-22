package collegeparta;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
	
	@Test void someLibraryMethodReturnsTrue() {
        Student classUnderTest = new Student("Daniel Brennings","22","","",null,null);
        assertTrue(classUnderTest.getUsername().equals("Daniel Brennings22"));
    }

}
