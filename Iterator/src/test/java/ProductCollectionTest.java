import org.junit.Test;

import static org.junit.Assert.*;

public class ProductCollectionTest {

    @Test
    public void initializationTest(){
        ProductCollectionTest pc = new ProductCollectionTest();
        assertNotNull(pc);
    }

    @Test
    public void listIteratorTest(){
        ProductCollection pc = new ProductCollection();
        ListIterator iterator = pc.createIterator();
        assertNotNull(iterator);

        assertFalse(iterator.hasNext());

        assertNull(iterator.current());

        iterator.next();
        assertFalse(iterator.hasNext());
        assertNull(iterator.current());

        pc.add(new Product(0,"product 1"));
        pc.add(new Product(1, "product 2"));

        iterator = pc.createIterator();

        assertTrue(iterator.hasNext());
        assertEquals(iterator.current().toString(), new Product(0, "product 1").toString());
        iterator.next();
        iterator.next();

        assertFalse(iterator.hasNext());
    }
}
