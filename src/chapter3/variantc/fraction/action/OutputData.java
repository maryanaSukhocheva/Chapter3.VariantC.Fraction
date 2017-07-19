package chapter3.variantc.fraction.action;

import chapter3.variantc.fraction.entity.Fraction;
import java.util.List;

/**
 *
 * @author Sukhocheva Maryana
 */
public class OutputData {
    //вывод массива дробей
    public static void outputFractions(List<Fraction> fractions) {
    for (Fraction fraction : fractions) {
            System.out.println(fraction.toString());
            System.out.println();
        }
    }
}
