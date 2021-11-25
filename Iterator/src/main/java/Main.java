public class Main {
    public static void main(String[] args) {
        ProductCollection pc = new ProductCollection();
        pc.add(new Product(0,"product 1"));
        pc.add(new Product(1, "product 2"));
        pc.add(new Product(2, "product 3"));
        pc.add(new Product(3, "product 4"));

        ListIterator iterator = pc.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.current().toString());
            iterator.next();
        }
    }
}
