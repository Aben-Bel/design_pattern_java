
import java.util.ArrayList;
import java.util.List;

public class ListIterator implements Iterator {

    private List<Product> products;
    private int index = 0;

    ListIterator(List products){
        this.products = products;
    }



    @Override
    public boolean hasNext() {
        return index<products.size();
    }

    @Override
    public void next() {
        index++;
    }

    @Override
    public Product current() {
        if(hasNext()) return products.get(index);
        return null;
    }
}
