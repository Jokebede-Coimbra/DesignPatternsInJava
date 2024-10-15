package solid.dip.exemplo1.payment;

import solid.dip.exemplo1.model.MySQLProduct;

public class Payment {
    public void pay(String productID) {
        MySQLProduct dbProduct = new MySQLProduct();
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}
