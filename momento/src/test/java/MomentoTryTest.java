import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class MomentoTryTest {
    @Test
    public void testInitialization(){
        Document docTester = new Document();
        assertEquals("", docTester.getString());
    }

    @Test
    public void testWrite(){
        Document docTester = new Document();
        assertEquals("", docTester.getString());
        docTester.write("Written");
        assertEquals("Written", docTester.getString());
    }

    @Test
    public void testRemoveWord(){
        Document docTester = new Document();
        assertEquals("", docTester.getString());
        docTester.write("Written Something");
        docTester.removeWord();
        assertEquals("Written", docTester.getString());
        assertNotEquals("Written Something",docTester.getString());
    }
}
