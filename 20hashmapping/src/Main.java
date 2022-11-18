import java.util.HashMap;

//HashMapping i anlamak için sözcükleri düşünebiliriz mesela bir ingilizce sözcük bizim için bir anahtar görevi görür ve biz ondan bir anlam çıkarırız
public class Main {

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<String, String>(); //biz bu çalışmada String, String çalıştık ama istersek String, int gibi de çalışabiliriz

        dictionary.put("Book", "Kitap"); //put ifadesi sözlüğe yeni kelimeler eklemek için burada book bizim için anahtar kitap ise o anahtarın value'sidir
        dictionary.put("Table", "Masa");
        dictionary.put("Sandalye", "Chair");

        System.out.println(dictionary);
    }
}
