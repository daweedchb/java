package task3.operation;

import task3.expression.Expression;
import task3.expression.TripleExpression;

public abstract class Operation implements Expression {
    private final TripleExpression left;
    private final TripleExpression right;

    public Operation(TripleExpression left, TripleExpression right) {
        this.left = left;
        this.right = right;
    }

    protected abstract int evaluate(int left, int right);

    public int evaluate(int x, int y, int z) {
        return evaluate(left.evaluate(x, y, z), right.evaluate(x, y, z));
    }
}