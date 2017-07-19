package chapter3.variantc.fraction.entity;

 

/**
 *
 * @author SLAVA
 */
public class Fraction {
    ComplexNumber m;//числитель
    ComplexNumber n;//знаменатель
    public Fraction(ComplexNumber m, ComplexNumber n)
    {
        this.m = m;
        this.n = n;
    }

    public Fraction() {
        
    }

    public ComplexNumber getM() {
        return m;
    }

    public void setM(ComplexNumber m) {
        this.m = m;
    }

    public ComplexNumber getN() {
        return n;
    }

    public void setN(ComplexNumber n) {
        this.n = n;
    }
    
     @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Дробь (");
        sb.append(this.m.toString());
        sb.append(", ").append(this.n.toString()+")");
        return sb.toString();
    }
}
