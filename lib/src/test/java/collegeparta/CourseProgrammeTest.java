package collegeparta;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CourseProgrammeTest {

	@Test void someLibraryMethodReturnsTrue() {
        CourseProgramme classUnderTest = new CourseProgramme("Electronic & Computer Engineering",null,null,null,null);
        assertTrue(classUnderTest.getName().equals("Electronic & Computer Engineering"));
    }
}
