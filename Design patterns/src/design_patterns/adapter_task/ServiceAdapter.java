package design_patterns.adapter_task;

public class ServiceAdapter implements INewService {
    private IOldService oldService;

    public ServiceAdapter(IOldService oldService) {
        this.oldService = oldService;
    }

    @Override
    public ProductDetails findProductById(long id) {
        Product product = oldService.getProductById(id);
        if (product != null)
            return new ProductDetails(product.getName(), product.getPrice());
        return null;
    }
}
