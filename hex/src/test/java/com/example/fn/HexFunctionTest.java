package com.example.fn;

import com.fnproject.fn.testing.*;
import org.junit.*;

import static org.junit.Assert.*;

public class HexFunctionTest {

    @Rule
    public final FnTestingRule testing = FnTestingRule.createDefault();

    @Test
    public void shouldReturnF() {
        testing.givenEvent().withBody("TestTestTestTes").enqueue();
        testing.thenRun(HexFunction.class, "handleRequest");

        FnResult result = testing.getOnlyResult();
        assertEquals("F", result.getBodyAsString());
    }

    @Test
    public void shouldReturnZero() {
        testing.givenEvent().enqueue();
        testing.thenRun(HexFunction.class, "handleRequest");

        FnResult result = testing.getOnlyResult();
        assertEquals("0", result.getBodyAsString());
    }

}