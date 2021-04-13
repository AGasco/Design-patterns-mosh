package com.codewithmosh.behavioral.mediator.Exercise;

public class CheckBox extends UIControl {
    private boolean isChecked;

    public CheckBox(DialogBox owner) {
        super(owner);
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
        owner.changed(this);
    }
}
