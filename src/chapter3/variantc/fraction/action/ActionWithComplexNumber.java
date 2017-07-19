/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.variantc.fraction.action;

import chapter3.variantc.fraction.entity.ComplexNumber;

/**
 *
 * @author SLAVA
 */
public class ActionWithComplexNumber {

    public ActionWithComplexNumber() {
    }
    
    
    public static ComplexNumber MultiplicationOfComplexNumbers(ComplexNumber number1, ComplexNumber number2)
    {
        ComplexNumber number3 = new ComplexNumber();
        number3.setX(number1.getX() * number2.getX() - number1.getY() * number2.getY());
        number3.setY(number1.getX() * number2.getY() + number1.getY() * number2.getX());
              
        return number3;
    }
    
    public static ComplexNumber AdditionOfComplexNumbers(ComplexNumber number1, ComplexNumber number2)
    {
        ComplexNumber number3 = new ComplexNumber();
        number3.setX(number1.getX() + number2.getX());
        number3.setY(number1.getY() + number2.getY());
              
        return number3;
    }
}
