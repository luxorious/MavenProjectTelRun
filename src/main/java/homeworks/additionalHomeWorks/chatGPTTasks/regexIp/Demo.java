package homeworks.additionalHomeWorks.chatGPTTasks.regexIp;

public class Demo {
    public static void main(String[] args) {
        CheckIP checkIP = new CheckIP();

        System.out.println("1");
        System.out.println(checkIP.isValid("192.168.0.1"));
        System.out.println("2");
        System.out.println(checkIP.isValid("10.0.0.1"));
        System.out.println("3");
        System.out.println(checkIP.isValid("172.16.0.1"));
        System.out.println("4");
        System.out.println(checkIP.isValid("255.255.255.255"));
        System.out.println("5");
        System.out.println(checkIP.isValid("127.0.0.1"));
        System.out.println("6");
        System.out.println(checkIP.isValid("555.555.555.555"));
        System.out.println("7");
        System.out.println(checkIP.isValid("256.0.1.0"));
    }
}
