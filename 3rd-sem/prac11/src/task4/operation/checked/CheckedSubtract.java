package task4.operation.checked;

import task4.exceptions.ArithmeticParserException;
import task4.expression.TripleExpression;
import task4.operation.BinaryOperation;

public class CheckedSubtract extends BinaryOperation {
    public CheckedSubtract(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        if (right > 0 ? left < Integer.MIN_VALUE + right
                : left > Integer.MAX_VALUE + right) {
            throw new ArithmeticParserException("Integer overflow");
        }
        return left - right;
    }
}