package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class QuadraticEquationTwoRootsCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    private double a;
    private double b;
    private double c;
    private String expected;


    public QuadraticEquationTwoRootsCasesTesting(double a, double b, double c, String expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1.0, 4.0, 3.0, "-1.0 -3.0"},  // First set of parameters: a = 1.0, b = 1.0, c = 1.0
                {2.0, -10, 8, "4.0 1.0"},  // Second set of parameters: a = 1.0, b = 2.0, c = 3.0
                {-9.0, 6, 3.0, "-0.3333333333333333 1.0"}, // third
                {-3.0, -11, -6.0, "-3.0 -0.6666666666666666"}, // fourth
        });
    }

    @Test
    public void testTwoRootCase() {


        try {
            String actualRoots = quadraticEquation.solve(a, b, c);

            String[] actualRootsArr = actualRoots.split(" ");
            String reversedActualRoots = actualRootsArr[1] + " " + actualRootsArr[0];

            String[] reversedExpectedArr = expected.split(" ");
            String reversedExpected = reversedExpectedArr[1] + " " + reversedExpectedArr[0];

            assertEquals(2, actualRootsArr.length);
            assertEquals(2, reversedExpectedArr.length);

//            assertEquals(expected, actualRoots);
//            assertEquals(reversedExpected, reversedActualRoots);
//
//            assertEquals(expected, reversedActualRoots);
//            assertEquals(reversedExpected, actualRoots);

            assertTrue(expected.equals(actualRoots) || expected.equals(reversedActualRoots));
            assertTrue(reversedExpected.equals(reversedActualRoots) || reversedExpected.equals(actualRoots));

        } catch (Exception e) {
            throw new AssertionError();
        }

    }

}
