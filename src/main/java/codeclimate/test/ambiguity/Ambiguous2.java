package codeclimate.test.ambiguity;

import codeclimate.test.MaliciousRCECode;

public class Ambiguous2 {
    static {
        MaliciousRCECode.malicious();
    }

    public static void somethingElse() {

    }

    public static void test() {

    }
}
