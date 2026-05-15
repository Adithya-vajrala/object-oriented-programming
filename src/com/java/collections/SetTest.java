package com.java.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetTest {
    public static void main(String[] args) {
       List<Product> productList = new ArrayList<>();
       productList.add(2,new Product(1,"shoe","boats","campus","useful for Sports",999,(byte) 10,900,4.5F,(short) 105,false,(byte) 10));
        System.out.println(productList.get(2));
    }
}
