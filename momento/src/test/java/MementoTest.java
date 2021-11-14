import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class MementoTest {
    @Test
    public void testInitialization(){
        Editor editor = new Editor();
        assertEquals("", editor.getString());
    }

    @Test
    public void testWrite(){
        Editor editor = new Editor();
        assertEquals("", editor.getString());
        editor.write("Written");
        assertEquals("Written", editor.getString());
    }

    @Test
    public void testRemoveWord(){
        Editor editor = new Editor();
        assertEquals("", editor.getString());
        editor.write("Written Something");
        editor.removeWord();
        assertEquals("Written", editor.getString());
        assertNotEquals("Written Something",editor.getString());
    }

    @Test
    public void testUndo(){
        Editor editor = new Editor();
        assertEquals("", editor.getString());
        editor.write("Written Something");
        editor.removeWord();
        assertEquals("Written", editor.getString());

        editor.undo();
        assertEquals("Written Something", editor.getString());

        editor.write(" Let's add this text.");
        editor.write(" Let's add more but this one should be removed because of undo.");

        editor.undo();
        assertEquals("Written Something Let's add this text.",editor.getString());

        editor.undo();
        editor.undo();
        assertEquals("",editor.getString());

        editor.undo();
        assertEquals("",editor.getString());
    }
}
