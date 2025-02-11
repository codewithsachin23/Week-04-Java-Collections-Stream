package org.day01.problemstatement.javagenerics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    List<Product<? extends OnlineMarketplace>> products;
    ProductCatalog(){
        this.products=new ArrayList<>();
    }
    public void addProduct(Product<? extends OnlineMarketplace> product){
        products.add(product);
    }
    public List<Product<? extends OnlineMarketplace>> getProducts() {
        return products;
    }

    public static  <T extends Product<?>> void applyDiscount(T product, double percentage){
        double discountPrize=product.getPrize()-(product.getPrize()*(percentage/100));
        product.setPrize(discountPrize);
    }






}
