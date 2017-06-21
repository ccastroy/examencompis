package general;

import tree.statement.StatementNode;
import types.IntegerType;
import types.Type;
import values.IntegerValue;
import values.Value;

import java.util.Hashtable;

/**
 * Created by mac on 11/19/14.
 */
public class SymbolsTable
{

    private static SymbolsTable instance;

    private SymbolsTable()
    {

    }

    public static SymbolsTable getInstance()
    {
        if(instance==null)
            instance = new SymbolsTable();
        return instance;
    }



    public void declareVariable(String name,Type type) throws Exception {

    }

    public Type getVariableType(String name) throws Exception {
         return null;
    }

    public void declareFunction(String name,Function functionInfo) throws Exception {

    }


}
