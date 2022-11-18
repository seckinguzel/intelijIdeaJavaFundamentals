public class Main {

    public static void main(String[] args) {

        Product product = new Product();

        product.setName("Macbook Pro");
        product.setDescription("Apple Laptop");
        product.setId(1253241);
        product.setPrice(2000);
        product.setStockAmount(27);

        ProductManager productManager = new ProductManager();

        productManager.Add(product);

        System.out.println(product.getName());
        System.out.println(product.getDescription());
        System.out.println(product.getId());
        System.out.println(product.getPrice());
        System.out.println(product.getStockAmount());

    }
}
