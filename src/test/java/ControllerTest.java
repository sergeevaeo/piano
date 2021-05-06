
import junit.framework.TestCase;

public class ControllerTest extends TestCase {

    public void testNote() {

        int a = 60;

        for(Controller.Note note : Controller.notes) {
            assertEquals(note.number, a);
            assertNotNull(note.key);
            a++;
        }
    }
}