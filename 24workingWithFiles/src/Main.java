import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        createFile(); //main method u içerisinde createFile() metodunu çağırdık.
        getFileInfo(); //main method u içerisinde getFileInfo() metodunu çağırdık.
        readFile(); //main method u içerisinde readFile() metodunu çağırdık.
        writeFile(); //main method u içerisinde writeFile() metodunu çağırdık.
    }

    public static void createFile() {
        File file = new File("C:\\Users\\seckin.guzel\\Documents\\filesWorkingForJavaStudy\\students.txt");

        try {
            if (file.createNewFile()) { //yukardaki students.txt dosyasını oluşturuyor
                System.out.println("The file has been created.");
            } else {
                System.out.println("The file is already existed!"); //eğer dosya zaten varsa olduğuna dair ekrana mesaj basıyor.
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\Users\\seckin.guzel\\Documents\\filesWorkingForJavaStudy\\students.txt");

        if (file.exists()) {
            System.out.println("File name = " + file.getName());
            System.out.println("File path = " + file.getPath());
            System.out.println("Is the file writeable? " + file.canWrite());
            System.out.println("Is the file readable? " + file.canRead());
            System.out.println("File size = " + file.length());
        }
    }

    public static void readFile() {
        File file = new File("C:\\Users\\seckin.guzel\\Documents\\filesWorkingForJavaStudy\\students.txt");

        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) { //okunacak satır varsa okuyana kadar devam et demek.
                String line = reader.nextLine(); //okunan her bir datayı bir yere aktarmam gerekiyor bu yüzden bu şekilde bir tanımlama yaptım. nextLine ise yeni bir satıra geçmesini sağlıyor.
                System.out.println(line);
            }
            reader.close(); //bu dosyayı okuduktan sonra bellekten uçuruyor.
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\seckin.guzel\\Documents\\filesWorkingForJavaStudy\\students.txt")); //dosyamızın içine bir şeyler yazmak istiyorsak bu şekilde tanımlama yapıyoruz.
            writer.newLine(); //yeni bir satır oluşturur. eğer bunu yazmazsak var olan dosyamızı silip üzerine yazar.
            writer.write("Tuncay Güzel"); //yazmak istediğimiz şeyi yazdık.
            System.out.println("The file has been written."); //yazıldığına dair ekrana mesaj bastık.
            writer.close(); //dosyamızı yazdıktan sonra kapattık.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
