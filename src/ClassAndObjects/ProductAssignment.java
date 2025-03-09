package ClassAndObjects;

import ClassAndObjects.model.Product;
public class ProductAssignment {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setProductInfo(1234, "A", "Cola", 0.5, 1);
        Product product2 = new Product();
        product2.setProductInfo(1235, "A", "Pepsi", 0.5, 1);
        product1.getProductInfo();
        product2.getProductInfo();
    }
}
