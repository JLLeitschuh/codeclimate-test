package codeclimate.test;

public class MaliciousRCECode {
    public static void malicious() {
        System.out.println("This is definitely malicious!");
        throw new AssertionError("Blow up!");
    }
}
