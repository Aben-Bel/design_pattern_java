import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class MementoTest {
    @Test
    public void testInitialization(){
        Editor editor = new Editor();
        assertEquals("", editor.getText());
    }

    @Test
    public void testWrite(){
        Editor editor = new Editor();
        assertEquals("", editor.getText());
        editor.write("Written");
        assertEquals("Written", editor.getText());
    }

    @Test
    public void testRemoveWord(){
        Editor editor = new Editor();
        assertEquals("", editor.getText());
        editor.write("Written Something");
        editor.removeWord();
        assertEquals("Written", editor.getText());
        assertNotEquals("Written Something",editor.getText());
    }

    @Test
    public void testUndo(){
        Editor editor = new Editor();
        History history = new History();

        assertEquals("", editor.getText());

        history.push(editor.takeSnapShot());
        editor.write("Written Something");

        history.push(editor.takeSnapShot());
        editor.removeWord();
        assertEquals("Written", editor.getText());

        editor.undo(history.pop());
        assertEquals("Written Something", editor.getText());

        history.push(editor.takeSnapShot());
        editor.write(" Let's add this text.");

        history.push(editor.takeSnapShot());
        editor.write(" Let's add more but this one should be removed because of undo.");


        editor.undo(history.pop());
        assertEquals("Written Something Let's add this text.",editor.getText());

        editor.undo(history.pop());
        editor.undo(history.pop());
        assertEquals("",editor.getText());

    }
}
