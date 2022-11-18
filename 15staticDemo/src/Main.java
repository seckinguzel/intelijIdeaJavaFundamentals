public class Main {

    public static void main(String[] args) {
	    ProductManager manager = new ProductManager();
        Product product = new Product();

        product.price = 1100;
        product.name = "Macbook Pro";

        manager.add(product);
    }
}
