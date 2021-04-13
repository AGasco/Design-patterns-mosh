package com.codewithmosh.structural.decorator.Solution;

public class Artefact implements AbstractArtefact {
    private String name;

    public Artefact(String name) {
        this.name = name;
    }

    @Override
    public String render() {
        return name;
    }
}
