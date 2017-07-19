package chapter3.variantc.fraction.entity;

import java.util.Random;

/**
 *
 * @author SLAVA
 */
public class ComplexNumber {
    
    private double x; //действительная часть
    private double y; //мнимая часть

    public ComplexNumber() {
    }

    
    public ComplexNumber(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(x);
        sb.append(" + ").append(y);
        sb.append("i");
        return sb.toString();
    }
}
