package com.example.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringMakerTest {

    @Test
    public void make() {
        StringMaker sm = new StringMaker();

        String result = sm.make();

        assertEquals("String", result);
    }
}