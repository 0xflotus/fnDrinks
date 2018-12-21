package com.example.fn;

public class HexFunction {

    public String handleRequest(String input) {
        return input != null ? Integer.toHexString(input.length()).toUpperCase() : "0";
    }

}