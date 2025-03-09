package ClassAndObjects.model;

public class Product {
    private Integer id;
    private String code;
    private String name;
    private Double price;
    private Integer qty;
    //
    public void setProductInfo(Integer pID,
                               String pCode,
                               String pName,
                               Double pPrice,
                               Integer pQty){
        id = pID;
        code = pCode;
        name = pName;
        price = pPrice;
        qty = pQty;
    }
    public void getProductInfo(){
        System.out.println("Product ID: " + id);
        System.out.println("Product code: " + code);
        System.out.println("Product name: " + name);
        System.out.println("Product price: " + price);
        System.out.println("Product qty: " + qty);
        System.out.println();
    }
}
