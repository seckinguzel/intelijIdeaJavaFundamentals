//ProductValidator nesnesi şu anlama gelir; bir ürünü kaydederken güncellerken ürünün kurallara uygun olup olmadığını bulmak için kullanırız
public class ProductValidator {
    public static boolean isValid(Product product){//ilk bunu çağıran kullanıcı bu nesneyi oluşturuyor sonradan bütün kullanıcılar aynı nesneyi kullanıyor demek statik yapı
        if(product.price > 0 && !product.name.isEmpty()){ //biz buradaki koşulda diyoruzki bizim bu ürünü kaydetmemiz için 0 dan büyük olması ve ismininde boş olmaması gerekli
            return true;
        }
        else{
            return false;
        }
    }
}
