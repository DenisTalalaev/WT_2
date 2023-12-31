package dtalalaev.labs.laba1.formula;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FormulaTest {

    @Test
    void testCalculate_GeneralTest_1() {
        Formula formula = new Formula(1,1);
        try {
            formula.calculate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(Math.abs(formula.getResult() - 1.9134) < 0.0001, true);
    }

    @Test
    void testCalculate_GeneralTest_2() {
        Formula formula = new Formula(151,-151);
        try {
            formula.calculate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(Math.abs(formula.getResult() - 151.0065) < 0.0001, true);
    }

    @Test
    void testCalculate_GeneralTest_3() {
        Formula formula = new Formula(0,-0);
        try {
            formula.calculate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(Math.abs(formula.getResult() - 0.5) < 0.0001, true);
    }

    @Test
    void testCalculate_GeneralTest_4() {
        Formula formula = new Formula(0,3.1415926);
        try {
            formula.calculate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(Math.abs(formula.getResult() - 0.5) < 0.0001, true);
    }

    @Test
    void testCalculate_GeneralTest_5() {
        Formula formula = new Formula(Math.PI,Math.PI/2);
        try {
            formula.calculate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(Math.abs(formula.getResult() - 3.5502) < 0.0001, true);
    }
}