package edu.miu.cs489.entities;

import java.util.ArrayList;
import java.util.List;

public class Contact {

    private String firstName;
    private String lastName;
    private String company;

    private String jobTitle;
    private List<PhoneNumber> phoneNumbers;
    private List<EmailAddress> emailAddresses;

    public Contact(String firstName, String lastName, String company, String jobTitle, List<PhoneNumber> phoneNumbers,
                   List<EmailAddress> emailAddresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.phoneNumbers = phoneNumbers;
        this.emailAddresses = emailAddresses;
        this.jobTitle = jobTitle;
    }

    public Contact(String firstName, String lastName, String company, String jobTitle, PhoneNumber phoneNumber,
                   EmailAddress emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.phoneNumbers = new ArrayList<>();
        this.phoneNumbers.add(phoneNumber);
        this.emailAddresses = new ArrayList<>();
        this.emailAddresses.add(emailAddress);
        this.jobTitle = jobTitle;

    }

    public Contact(String firstName, String lastName, String company, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<EmailAddress> getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(List<EmailAddress> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
