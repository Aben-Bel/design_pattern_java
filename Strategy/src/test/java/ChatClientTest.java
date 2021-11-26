import org.junit.*;

import static org.junit.Assert.*;

public class ChatClientTest {
    @Test
    public void testInitialization(){
        ChatClient cc = new ChatClient();
        assertNotNull(cc);
    }

    @Test
    public void testEncryption(){
        ChatClient cc = new ChatClient();
        cc.send("To be encrypted", new DES());
        cc.send("To be encrypted", new AES());
    }


}
