package com.badnotes.demo.ws;

/**
 * Created by jun.wan on 14-3-13.
 */
public class TestImpl implements ITest {
    @Override
    public String say(String name) {
        return name + " sya: Hello World!";
    }
}
