package com.example.dfreeman.shoppingcart;

import java.util.ArrayList;
import android.app.Application;

public class Controller extends Application{

    private final ArrayList<ModelProducts> myProducts = new ArrayList<>();
    private final ModelCart myCart = new ModelCart();


    public ModelProducts getProducts(int pPosition) {

        return myProducts.get(pPosition);
    }

    public void setProducts(ModelProducts Products) {

        myProducts.add(Products);

    }

    public ModelCart getCart() {

        return myCart;

    }

    public int getProductsArraylistSize() {

        return myProducts.size();
    }

}