/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.expression;

import java.util.List;


/**
 *
 * @author Eduardo
 */
public class FunctionCallNode extends ExpressionNode{
    private String name;
    List<ExpressionNode> parameters;

    public FunctionCallNode(String name,List<ExpressionNode> parameters) {
        this.parameters = parameters;
        this.name = name;
    }

    public List<ExpressionNode> getParameters() {
        return parameters;
    }

    public void setParameters(List<ExpressionNode> parameters) {
        this.parameters = parameters;
    }
    
    //:(


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
        
        
    }


}
