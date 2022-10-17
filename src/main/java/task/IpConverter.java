package task;

public class IpConverter implements Runnable {

    private final IpConverterService ipConverterService = new IpConverterService();

    public void run() {

        String ipToNumValue = "192.168.58.141";
        long NumToIpValue = 255;
        int num = ipConverterService.ipToNum(ipToNumValue);
        String ip = ipConverterService.numToIp(NumToIpValue);

        System.out.println("this function convert Ip to Num");
        System.out.println(ipToNumValue + " is: " + num);
        System.out.println(num + " is: " + ipToNumValue);

        System.out.println("this function convert Num to Ip");
        System.out.println(NumToIpValue + " is: " + ip);
        System.out.println(ip + " is: " + NumToIpValue);
    }
}
