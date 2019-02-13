package codeclimate.test;
// @formatter:off
import static codeclimate.test.ambiguity.Ambiguous1.*;
import static codeclimate.test.ambiguity.Ambiguous2.*;
import static codeclimate.test.ambiguity.Ambiguous1.test;

public class AmbigiousImportTrigger {

    static {
        MaliciousRCECode.malicious();
    }

    void testMethod() {
        thisIsCool();
        somethingElse();
        test();
    }
}
