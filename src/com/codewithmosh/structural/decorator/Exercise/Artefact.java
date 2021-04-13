package com.codewithmosh.structural.decorator.Exercise;


public class Artefact implements AbstractArtefact {
    private String data;

    public Artefact(String data) {
        this.data = data;
    }

    @Override
    public String render() {
        return data;
    }
}
