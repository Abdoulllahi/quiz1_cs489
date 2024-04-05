package edu.miu.cs489.entities;

public class EmailAddress {

    private String email;
    private Label label;

    public EmailAddress(String email, Label label) {
        this.email = email;
        this.label = label;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }
}
