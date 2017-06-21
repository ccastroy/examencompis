/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.expression;

import types.BooleanType;
import types.FloatType;
import types.IntegerType;
import types.Type;
import values.Value;

/**
 *
 * @author Eduardo
 */
public class EqualsNode extends LogicalOperatorNode{

    public EqualsNode(ExpressionNode raito, ExpressionNode leftou) {
        super(raito, leftou);
    }

}
