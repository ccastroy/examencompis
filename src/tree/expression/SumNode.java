/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.expression;

import types.FloatType;
import types.IntegerType;
import types.StringType;
import types.Type;
import values.*;

import java.util.StringTokenizer;

/**
 *
 * @author Eduardo
 */
public class SumNode extends BinaryOperatorNode{

    public SumNode(ExpressionNode raito, ExpressionNode leftou) {
        super(raito, leftou);
    }

}
