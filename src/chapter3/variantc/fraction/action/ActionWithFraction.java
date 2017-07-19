package chapter3.variantc.fraction.action;
import chapter3.variantc.fraction.entity.ComplexNumber;
import chapter3.variantc.fraction.entity.Fraction;
import java.util.List;
/**
 *
 * @author Sukhocheva Maryana
 */
public class ActionWithFraction {
    
    public ActionWithFraction() {
    }
    
    //Changes each element of an array with an even index by adding the element following it
    public static List<Fraction> changesElementsWithEvenIndex(List<Fraction> arrayFraction){
    
    try {
    int size = arrayFraction.size();
    if (size!=0) {
        for(int i = 1; i < size; i += 2) {
            if (i!=size-1) {
                Fraction temp = AdditionOfFractions(arrayFraction.get(i), arrayFraction.get(i+1));
                arrayFraction.get(i).setM(temp.getM());
                arrayFraction.get(i).setN(temp.getN());
            }
        }
    }
    } catch (Exception e) {
        System.err.println("Error while editing array elements");
    }
    
        return arrayFraction;
    } 

    
    public static Fraction AdditionOfFractions(Fraction fraction1, Fraction fraction2)
    {
        Fraction fraction3 = new Fraction();
        ComplexNumber multNum1 = ActionWithComplexNumber.MultiplicationOfComplexNumbers(fraction1.getM(), fraction2.getN());
        ComplexNumber multNum2 = ActionWithComplexNumber.MultiplicationOfComplexNumbers(fraction2.getM(), fraction1.getN());
        
        fraction3.setM(ActionWithComplexNumber.AdditionOfComplexNumbers(multNum1, multNum2));
        fraction3.setN(ActionWithComplexNumber.MultiplicationOfComplexNumbers(fraction1.getN(), fraction2.getN()));
        return fraction3;
    }
  
 
}
