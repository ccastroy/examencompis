/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.statement;

import tree.expression.ExpressionNode;
import tree.expression.IdNode;
import values.Value;

/**
 *
 * @author Eduardo
 */
public class AssignNode extends StatementNode{
    
    ExpressionNode raitoVarue;
    
    IdNode leftouVarue;

    public AssignNode(ExpressionNode raitoVarue, IdNode leftouVarue) {
        this.raitoVarue = raitoVarue;
        this.leftouVarue = leftouVarue;
    }

    public ExpressionNode getRaitoVarue() {
        return raitoVarue;
    }

    public void setRaitoVarue(ExpressionNode raitoVarue) {
        this.raitoVarue = raitoVarue;
    }

    public IdNode getLeftouVarue() {
        return leftouVarue;
    }

    public void setLeftouVarue(IdNode leftouVarue) {
        this.leftouVarue = leftouVarue;
    }

}
