package chapter3.variantc.fraction.main;

import chapter3.variantc.fraction.action.ActionWithFraction;
import chapter3.variantc.fraction.action.InputData;
import chapter3.variantc.fraction.action.OutputData;
import chapter3.variantc.fraction.entity.Fraction;
import chapter3.variantc.fraction.entity.Triangle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Fraction> arrayFractions = InputData.generationFractions();
        System.out.println("Массив дробей:");
        OutputData.outputFractions(arrayFractions);
        
        List<Fraction> changeFactions = ActionWithFraction.changesElementsWithEvenIndex(arrayFractions);
        System.out.println("Массив дробей после изменения каждого элемента массива с четным индексом"
                + " путем добавления следующего за ним элемента:");
        OutputData.outputFractions(arrayFractions);
        
    }
    
}
