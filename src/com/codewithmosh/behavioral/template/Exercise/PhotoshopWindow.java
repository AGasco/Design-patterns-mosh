package com.codewithmosh.behavioral.template.Exercise;

public class PhotoshopWindow extends Window{
    @Override
    protected void doBeforeClosing() {
        System.out.println("Doing stuff before closing Photoshop Window");
    }

    @Override
    protected void doAfterClosing() {
        System.out.println("Doing stuff after closing Photoshop Window");
    }
}
