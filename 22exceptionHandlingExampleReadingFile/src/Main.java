import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException { //throws FileNotFoundException hatasını illaki koymamız gerekki try catch içine alacağız yada onu başkası kullanacaksa try catch içine alması gerektiğini bilsin. FileNotFoundException hatası dosyayı bulabilecek mi hatasıdır. Aşağıda ikinci metodla devam edildiğinden buradaki throws dan sonra FileNotFoundException uçurduk.
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\seckin.guzel\\Documents\\22exceptionHandlingExampleReadingFile\\src\\numbers.txt"));
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        finally {
            reader.close();
        }
    }
}
