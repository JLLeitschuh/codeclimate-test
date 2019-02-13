package codeclimate.test.ambiguity;

import codeclimate.test.MaliciousRCECode;

public class Ambiguous1 {

    static {
        MaliciousRCECode.malicious();
    }

    public static void thisIsCool() {

    }

    public static void test() {

    }
}
