package collegeparta;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ModuleTest {

	@Test void someLibraryMethodReturnsTrue() {
        module classUnderTest = new module("","CT401","",null,null);
        assertTrue(classUnderTest.getID().equals("CT401"));
        
    }
}
