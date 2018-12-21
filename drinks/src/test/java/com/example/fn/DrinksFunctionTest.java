package com.example.fn;

import com.fnproject.fn.testing.*;
import org.junit.*;

import static org.junit.Assert.*;

public class DrinksFunctionTest {

    @Rule
    public final FnTestingRule testing = FnTestingRule.createDefault();

    @Test
    public void shouldReturnAlcoholPlusOne() {
        testing.givenEvent().withBody("{\"name\":\"Caipirinha\", \"alcohol\": 12}").enqueue();
        testing.thenRun(DrinksFunction.class, "handleRequest");

        FnResult result = testing.getOnlyResult();
        assertEquals("{\"alcohol\":13,\"name\":\"Caipirinha\"}", result.getBodyAsString());
    }

    @Test
    public void shouldReturnNoNameAndZeroAlc() {
        testing.givenEvent().withBody("{}").enqueue();
        testing.thenRun(DrinksFunction.class, "handleRequest");

        FnResult result = testing.getOnlyResult();
        assertEquals("{\"alcohol\":0,\"name\":\"<no name>\"}", result.getBodyAsString());
    }

}