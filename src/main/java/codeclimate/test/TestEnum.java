package codeclimate.test;

public enum TestEnum {
    TEST_ME,
    WHAT_ABOUT_ME;

    static {
        System.out.println("RCE!");
    }
}
