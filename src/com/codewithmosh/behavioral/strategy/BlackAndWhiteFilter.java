package com.codewithmosh.behavioral.strategy;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public String apply() {
        return "Applying b&w filter";
    }
}
