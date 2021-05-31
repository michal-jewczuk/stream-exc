package test.java.assignment;

import test.java.model.Product;
import test.java.reader.Reader;

import java.util.Collections;
import java.util.List;

public class ProductCreator {

    /**
     * Implement this method to return all product based on given example file;
     * Each line in example file represents one instance of a Product
     * Use only stream transformation in this file.
     */
    public static List<Product> getAllProducts(String filename) {
        List<String> stringData = Reader.INSTANCE.loadStringData(filename);

        return Collections.EMPTY_LIST;
    }

}
