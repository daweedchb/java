package task4.parser;

import task4.exceptions.FormatParserException;
import task4.expression.TripleExpression;

public interface Parser {
    TripleExpression parse(String expression) throws FormatParserException;
}