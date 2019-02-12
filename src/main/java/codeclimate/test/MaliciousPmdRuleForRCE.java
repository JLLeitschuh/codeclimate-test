package codeclimate.test;

import net.sourceforge.pmd.lang.java.ast.ASTWhileStatement;
import net.sourceforge.pmd.lang.java.rule.AbstractJavaRule;

public class MaliciousPmdRuleForRCE extends AbstractJavaRule {

    @Override
    public Object visit(ASTWhileStatement node, Object data) {
        System.out.println("RCE!");
        System.err.println("RCE!");
        return super.visit(node,data);
    }
}
