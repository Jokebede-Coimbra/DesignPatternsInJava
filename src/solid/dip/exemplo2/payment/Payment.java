package solid.dip.exemplo2.payment;

import solid.dip.exemplo2.model.Db;
import solid.dip.exemplo2.model.IDbProduct;
import solid.dip.factory.DbProductFactory;

public class Payment {
    public void pay(String productID) {

        IDbProduct dbProduct = DbProductFactory.create(Db.MYSQL);
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}
