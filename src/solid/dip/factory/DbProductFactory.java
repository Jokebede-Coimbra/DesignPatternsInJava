package solid.dip.factory;

import solid.dip.exemplo2.model.Db;
import solid.dip.exemplo2.model.IDbProduct;
import solid.dip.exemplo2.model.MySQLProduct;

public class DbProductFactory {

    public static IDbProduct create(Db type) {
        if (type == Db.MYSQL) {
            return new MySQLProduct();
        } else {
            return new MySQLProduct();
        }
    }

}
