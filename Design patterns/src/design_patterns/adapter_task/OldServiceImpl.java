package design_patterns.adapter_task;

import java.util.HashMap;
import java.util.Map;

public class OldServiceImpl implements IOldService {
    private Map<Long, Product> productMap;

    public OldServiceImpl(Map<Long, Product> productMap) {
        this.productMap = productMap;
    }

    @Override
    public Product getProductById(long id) {
        return productMap.get(id);
    }
}
