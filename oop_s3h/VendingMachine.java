package oop_s3h;

public interface VendingMachine {

    Product getProduct(String name) throws IllegalStateException;

}