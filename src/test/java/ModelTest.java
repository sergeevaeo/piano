import org.junit.Test;

import static org.junit.Assert.*;

public class ModelTest {
    @Test
    public void testNote() {

        int a = 60;

        for(Model.Note note : Model.notes) {
            assertEquals(note.number, a);
            assertNotNull(note.key);
            a++;
        }
    }
}