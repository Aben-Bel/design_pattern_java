import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {
    @Test
    public void initializationTest(){
        Product p = new Product(1,"Sock");
        assertNotNull(p);
    }
}