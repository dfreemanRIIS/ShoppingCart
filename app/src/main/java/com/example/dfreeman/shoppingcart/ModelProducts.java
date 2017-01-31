package com.example.dfreeman.shoppingcart;

public class ModelProducts {

    private final String productName;
    private final String productDesc;
    private final int productPrice;

    public ModelProducts(String productName,String productDesc,int productPrice)
    {
        this.productName  = productName;
        this.productDesc  = productDesc;
        this.productPrice = productPrice;
    }

    public String getProductName() {

        return productName;
    }

    public String getProductDesc() {

        return productDesc;
    }

    public int getProductPrice() {

        return productPrice;
    }

}