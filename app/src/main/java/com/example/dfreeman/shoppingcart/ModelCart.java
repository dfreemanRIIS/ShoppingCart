package com.example.dfreeman.shoppingcart;

import java.util.ArrayList;

public class ModelCart{

    private final ArrayList<ModelProducts> cartProducts = new ArrayList<>();


    public ModelProducts getProducts(int pPosition) {

        return cartProducts.get(pPosition);
    }

    public void setProducts(ModelProducts Products) {

        cartProducts.add(Products);

    }

    public int getCartSize() {

        return cartProducts.size();

    }

    public boolean checkProductInCart(ModelProducts aProduct) {

        return cartProducts.contains(aProduct);

    }

}