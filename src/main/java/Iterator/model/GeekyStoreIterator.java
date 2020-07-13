package Iterator.model;

import Iterator.Iterator;

import java.util.ArrayList;

public class GeekyStoreIterator implements Iterator {
    ArrayList<Product> catalogs;
    int position = 0;

    public GeekyStoreIterator(ArrayList<Product> catalogs) {
        this.catalogs = catalogs;
    }

    @Override
    public boolean hasNext() {
        return position < catalogs.size() && catalogs.get(position) != null;
    }

    @Override
    public Object next() {
        Product product = catalogs.get(position);
        position += 1;
        return product;
    }

    public GeekyStoreIterator createIterator() {
        return null;
    }
}
