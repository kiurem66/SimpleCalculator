package SimpleCalculator;

import java.util.ArrayList;
import java.util.Arrays;

public class Polynomial
{
    private ArrayList<String> oper;
    private ArrayList<Monomial> monomials;
    private String toString;
    
    public Polynomial(String polynomial)
    {
        oper = new ArrayList<>();
        monomials = new ArrayList<>();
        for(int i = 0; i < polynomial.length(); i++)
            if(polynomial.charAt(i) == '+' || polynomial.charAt(i) == '-')
                oper.add("" + polynomial.charAt(i));
        String[] tmp = polynomial.split("[+-]");
        for(String s : tmp)
            monomials.add(new Monomial(s));
        toString = polynomial;
    }
    
    public String toString()
    {
        return toString;
    }
    
    public double result()
    {
        double res = monomials.get(0).result();
        for(String s : oper)
        {
            if(s.equals("+"))
                res += monomials.get(oper.indexOf(s) + 1).result();
            else
                res -= monomials.get(oper.indexOf(s) + 1).result();
        }
        return res;
    }
}
