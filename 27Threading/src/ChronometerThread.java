public class ChronometerThread implements Runnable { // burası direk kronometreyi yönettiğimiz thread olacak. Bunu thread güdümlü olması için Runnable implement ediyor olması lazım.

    private Thread thread;
    private String threadName; // birden fazla thread olacağından java nın bu thread lerin farklı olduğunu anlaması için String type da bir threadName tanımladık.

    public ChronometerThread(String threadName){ //burada bir constructor tanımladık.
        this.threadName = threadName; //yukardaki threadName alnına göndereceğim constructor e gönderilen threadName olarak setlenecek.
        System.out.println("Creating: "+ threadName);
    }

    @Override
    public void run() { //run methodunu yukarda Runnable implement ettikten sonra implement ettik. burada run metodu bizim thread in kendisidir. bu thread in devreye girdiğini anlatmak için bunu yazdık
        System.out.println("Running: " + threadName);

        try
        {
            for (int i = 1; i <= 10; i++){
            System.out.println(threadName + " : " + i);
            Thread.sleep(1000); //kronometrenin hızlı yazmaması 1 saniye aralıklarla yazması için. ayrıca burada bir checed exception olacağından işlemi try catch içerisine aldım.
        }
        }catch (InterruptedException exception){
            System.out.println("Thread broke" + threadName);
        }
        System.out.println("Thread finished: " + threadName);
    }

    public void start(){ //bu blok her zaman standarttır thread'i başlatmak için.
        System.out.println("Thread object is creating");
        if (thread == null){ //eğer thread boş ise
            thread = new Thread(this, threadName); //bir thread i çalıştırmak için onu new lemek lazım. bu noktada iki değer ister, thread nesnesine konu olan class yani this ek olarak bide isim ister oda threadName.
            thread.start();
        }
    }
}
