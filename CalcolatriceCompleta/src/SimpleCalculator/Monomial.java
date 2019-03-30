package SimpleCalculator;

import java.util.ArrayList;
import java.util.Arrays;

public class Monomial
{
    private ArrayList<String> values;
    private ArrayList<String> oper;
    String toString;

    public Monomial(String monomial)
    {
        oper = new ArrayList<>();
        for(int i = 0; i < monomial.length(); i++)
            if(monomial.charAt(i) == '/' || monomial.charAt(i) == 'x')
                oper.add("" + monomial.charAt(i));
        values = new ArrayList<String>(Arrays.asList(monomial.split("[x/]")));
        if(values.size() == 0)
            values.add(monomial);
        toString = monomial;
    }
    
    public String toString()
    {
        return toString;
    }
    
    public double result()
    {
        double result = 0;
        result = Double.valueOf(values.get(0));
        for(String s : oper)
        {
            if(s.equals("x"))
                result *= Double.valueOf(values.get(oper.indexOf(s) + 1));
            else
                result /= Double.valueOf(values.get(oper.indexOf(s) + 1));
        }
        return result;
    }
}