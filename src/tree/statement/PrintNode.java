/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.statement;

import tree.expression.ExpressionNode;

/**
 *
 * @author Eduardo
 */
public class PrintNode extends StatementNode{
    
    ExpressionNode value;

    public PrintNode(ExpressionNode value) {
        this.value = value;
    }

    public ExpressionNode getValue() {
        return value;
    }

    public void setValue(ExpressionNode value) {
        this.value = value;
    }

}
