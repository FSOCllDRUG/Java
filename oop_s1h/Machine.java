package oop_s1h;

import java.util.ArrayList;

public interface Machine {
    ArrayList getProductByName(String searchName);

    ArrayList getProductByPrice(Double searchName);

    void addProduct(Product newItem);

}