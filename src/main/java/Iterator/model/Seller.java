package Iterator.model;

public class Seller {

    GeekyStoreIterator geekyStoreIterator;

    public Seller(GeekyStoreIterator geekyStoreIterator) {
        this.geekyStoreIterator = geekyStoreIterator;
    }

    public void printCatelog(){
        geekyStoreIterator = geekyStoreIterator.createIterator();
        System.out.println("print catelog");
    }

    public  void printCatalog(GeekyStoreIterator geekyStoreIterator){
        while (geekyStoreIterator.hasNext()){
            Product product = (Product)geekyStoreIterator.next();
            System.out.println(product.getClass());

        }
    }


}
