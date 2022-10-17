import task.IpConverter;

public class Runner {
    public static void main(String[] args) {
        Thread myThread = new Thread(new IpConverter(),"Converter");
        myThread.start();
    }
}
