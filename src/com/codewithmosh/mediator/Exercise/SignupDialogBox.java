package com.codewithmosh.mediator.Exercise;

public class SignupDialogBox extends DialogBox{
    private TextBox usernameTextBox = new TextBox(this);
    private TextBox passwordTextBox = new TextBox(this);
    private CheckBox checkBox = new CheckBox(this);
    private Button submitButton = new Button(this);

    public void simulateUserInteraction(){
       usernameTextBox.setContent("Antonio");
        passwordTextBox.setContent("123456");
        System.out.println(toString());
        checkBox.setChecked(true);
        System.out.println(toString());
    }

    public String toString(){
        return "Username: " + usernameTextBox.getContent() + "\n" +
               "Password: " + passwordTextBox.getContent() + "\n" +
               "CheckBox: " + checkBox.isChecked() + "\n" +
               "Button: " + submitButton.isEnabled();
    }

    @Override
    public void changed(UIControl control) {
        if (control != submitButton){
            var username = usernameTextBox.getContent();
            var password = passwordTextBox.getContent();

            var usernameEmpty = username == null || username.isEmpty();
            var passwordEmpty = password == null || password.isEmpty();
            var isCheckBoxTicked = checkBox.isChecked();

            var enableButton = !usernameEmpty && !passwordEmpty && isCheckBoxTicked;
            submitButton.setEnabled(enableButton);
        }
        }
    }

