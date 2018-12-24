package com.example.fn;

import static java.lang.Integer.toHexString;

public class HexFunction {

    public String handleRequest(String input) {
        return input != null ? toHexString(input.length()).toUpperCase() : "0";
    }

}
