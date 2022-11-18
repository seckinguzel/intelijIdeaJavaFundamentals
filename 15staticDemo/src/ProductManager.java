//ProductManager ürünü ekleyen nesnemiz
public class ProductManager {
    public void add(Product product){
        if(ProductValidator.isValid(product)) { //statik olduğundan ProductValidator ü new lememiz gerekmedi. İlk kullanıcı nesneyi oluşturdu sonra her çağırmada aynı nesne kullanıldı.
            System.out.println("Product added!"); //ürün eklendiğini farzediyorum
        }
        else{
            System.out.println("Product hasn't been added because product informations are not valid!");
        }
    }
}
