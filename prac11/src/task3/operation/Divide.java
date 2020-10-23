package task3.operation;

import task3.expression.TripleExpression;

public class Divide extends Operation {
    public Divide(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        return left / right;
    }

    protected double evaluate(double left, double right) {
        return left / right;
    }
}