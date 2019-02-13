package codeclimate.test;

public enum TestEnum {
    TEST_ME,
    WHAT_ABOUT_ME;

    static {
        System.out.println("RCE!");
    }

    void comparingThem() {
        TestEnum first = TestEnum.TEST_ME;
        TestEnum second = TestEnum.TEST_ME;

        if (first == second) {
            if ("a" == "b") {

            }
        }
    }
}
