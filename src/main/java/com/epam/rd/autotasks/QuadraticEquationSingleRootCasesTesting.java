package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationSingleRootCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    private double a;
    private double b;
    private double c;

    private double expected;


    public QuadraticEquationSingleRootCasesTesting(double a, double b, double c, double expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1.0, 4.0, 4.0, -2},  // First set of parameters: a = 1.0, b = 1.0, c = 1.0
                {0.25, -3.0, 9.0, 6},  // Second set of parameters: a = 1.0, b = 2.0, c = 3.0
                {-5.0, 10, -5.0, 1}, // third
                {0.5, 6.0, 18.0, -6}, // fourth
        });
    }

    @Test
    public void testSingleRootCase() {
        assertEquals(String.valueOf(expected), quadraticEquation.solve(a, b, c));
    }
}