package design_patterns.adapter_task;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Long, Product> products = new HashMap<>();
        Product p1 = new Product(1, "p1", 100);
        Product p2 = new Product(2, "p2", 200);
        Product p3 = new Product(3, "p3", 300);
        products.put(p1.getId(), p1);
        products.put(p2.getId(), p2);
        products.put(p3.getId(), p3);

        IOldService oldService = new OldServiceImpl(products);
        ServiceAdapter adapter = new ServiceAdapter(oldService);
        ProductDetails pd = adapter.findProductById(2);
        System.out.println(pd);
    }
}
