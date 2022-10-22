package collegeparta;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LecturerTest {

	@Test void someLibraryMethodReturnsTrue() {
        Lecturer classUnderTest = new Lecturer("Mr.Mosely","45","","",null);
        assertTrue(classUnderTest.getUsername().equals("Mr.Mosely45"));
    }
}
