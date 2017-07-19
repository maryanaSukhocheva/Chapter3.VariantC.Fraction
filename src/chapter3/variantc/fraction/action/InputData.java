package chapter3.variantc.fraction.action;

import chapter3.variantc.fraction.entity.ComplexNumber;
import chapter3.variantc.fraction.entity.Fraction;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sukhocheva Maryana
 */
public class InputData {
   // addes N random fractions to list
    public static List<Fraction> generationRandomNFractions(int k) {
        List<Fraction> arrayOfFractions = new ArrayList<>();
        
        Random x1 = new Random();
        Random x2 = new Random();
        Random y1 = new Random();
        Random y2 = new Random();
        int i = 0;
        while (i < k) {
            ComplexNumber m = new ComplexNumber(x1.nextDouble(), y1.nextDouble());
            ComplexNumber n = new ComplexNumber(x2.nextDouble(), y2.nextDouble());
            
            try {
                Fraction temp = new Fraction(m,n);
                i++;
                arrayOfFractions.add(temp);
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return arrayOfFractions;
    }
    
    public static  List<Fraction> generationFractions(){
        List<Fraction> arrayOfFractions = new ArrayList<>();
       // Дробь №1
        try {
        Fraction fraction1 = new Fraction();
        fraction1.setM((new ComplexNumber(0,2)));
        fraction1.setN((new ComplexNumber(-1,5)));
        
        if (fraction1 != null) {
                arrayOfFractions.add(fraction1);
            }
        // Дробь №2
        
        Fraction fraction2 = new Fraction();
        fraction2.setM((new ComplexNumber(61,-55)));
        fraction2.setN((new ComplexNumber(3,0)));
        
        if (fraction2 != null) {
                arrayOfFractions.add(fraction2);
            }
        // Дробь №3
        Fraction fraction3 = new Fraction();
        fraction3.setM((new ComplexNumber(48,3)));
        fraction3.setN((new ComplexNumber(0,0)));
        
        if (fraction3 != null) {
                arrayOfFractions.add(fraction3);
            }
        // Дробь №4
        Fraction fraction4 = new Fraction();
        fraction4.setM((new ComplexNumber(68,100)));
        fraction4.setN((new ComplexNumber(58,20)));
        
        if (fraction4 != null) {
                arrayOfFractions.add(fraction4);
            }
        // Дробь №5
         Fraction fraction5 = new Fraction();
        fraction5.setM((new ComplexNumber(85,0)));
        fraction5.setN((new ComplexNumber(3,0)));
        
        if (fraction5 != null) {
                arrayOfFractions.add(fraction5);
            }
        
    } catch (Exception e) {
            System.err.println("Failed to create array of fractions");
    }
        return arrayOfFractions;
    }
    
   
}
