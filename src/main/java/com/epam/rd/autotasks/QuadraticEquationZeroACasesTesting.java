package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@RunWith(Parameterized.class)
public class QuadraticEquationZeroACasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    private double a;
    private double b;
    private double c;

    public QuadraticEquationZeroACasesTesting(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0.0, 4.0, 3.0},
                {0, -10, 8},
                {-0.0, 6, 3.0},
                {-0.000, -11, -6.0},
        });
    }

    @Test
    public void testZeroACase() {
        try {
            quadraticEquation.solve(a, b, c);
            fail("'a' can not be assigned to: 0");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        } catch (Exception e) {
            throw new AssertionError("Unexpected exception");
        }
    }


}