package DAO;

import ClassJava.Product;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by user on 21.11.2016.
 */
public class ProductDaoInfo implements ProductDao {
    private final static Map<Integer, Product> productsBase = new ConcurrentHashMap<>();

    public ProductDaoInfo() {
        this.productsBase.put(1, new Product(1, "iphone 5", 6666));
        this.productsBase.put(2, new Product(2, "iphone 6", 16666));
        this.productsBase.put(3, new Product(3, "iphone 7", 26666));
    }


    @Override
    public Product selectById(int id) throws DaoSystemException, NoSuchEntityException {
        Product product;
        product = productsBase.get(id);
        if (product == null) {
            throw new NoSuchEntityException("No product by current id");
        }
        return product;
    }

    @Override
    public List<Product> selectAll() throws DaoSystemException {
        List<Product> products = new CopyOnWriteArrayList();
        if (productsBase == null)
            throw new DaoSystemException("Base empty");
        for (Integer key : productsBase.keySet()) {
            products.add(productsBase.get(key));
        }
        return products;

    }
}
