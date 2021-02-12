package task4.operation.uncheked;

import task4.expression.TripleExpression;
import task4.operation.Operation;

public class Multiply extends Operation {
    public Multiply(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        return left * right;
    }

    protected double evaluate(double left, double right) {
        return left * right;
    }
}