package com.third.Vo;

import com.third.pojo.Cart;
import com.third.pojo.Product;

public class CartandProductVo extends Cart {
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "CartandProductVo{" +
                "product=" + product +
                "} " + super.toString();
    }
}
