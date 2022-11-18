import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    /*int [] numbers = new int[] {1, 2, 3}; //normalde bu şekilde array oluşturuyoruz
        numbers = new int[4]; //bunu dediğimiz an yeni bir array oluşturur ama eleman atamaz yukardaki array ise uçar.
        System.out.println(numbers[0]);*/

        ArrayList numbers = new ArrayList();

        numbers.add(1);
        numbers.add(10);
        numbers.add("Ankara"); //obje olarak eklendiği için string integer class da eklesek sıkıntı çıkarmaz

        System.out.println(numbers.size()); //.size array boyutunu ekrana basar
        System.out.println(numbers.get(2)); //array in ikinci elemanını ekrana basar
        numbers.set(2,100); //ikinci elemanı 100 ile değiştir demek
        System.out.println(numbers.get(2));
        numbers.remove(0); //sıfırıncı index i kaldır demek yani liste 10 ve Ankara ya dönüşüyor
        System.out.println(numbers);

        System.out.println("");

        for (Object i : numbers){
            System.out.println(i);
        }
    }
}
