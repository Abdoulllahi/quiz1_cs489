package edu.miu.cs489.entities;

public class PhoneNumber {

    private String phoneNumber;
    private Label label;

    public PhoneNumber(String phoneNumber, Label label) {
        this.phoneNumber = phoneNumber;
        this.label = label;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }
}
