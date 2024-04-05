package edu.miu.cs489;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.miu.cs489.entities.Contact;
import edu.miu.cs489.entities.EmailAddress;
import edu.miu.cs489.entities.Label;
import edu.miu.cs489.entities.PhoneNumber;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<EmailAddress> emailAddresses = new ArrayList<>();
        EmailAddress emailAddress1 = new EmailAddress("dave.sang@gmail.com", Label.HOME);
        EmailAddress emailAddress2 = new EmailAddress("dsanger@argos.com", Label.WORK);
        EmailAddress emailAddress3 = new EmailAddress("ali@bmi.com", Label.WORK);

        List<PhoneNumber> phoneNumbers = new ArrayList<>();
        PhoneNumber phoneNumber1 = new PhoneNumber("240-133-0011", Label.HOME);
        PhoneNumber phoneNumber2 = new PhoneNumber("240-112-0123", Label.MOBILE);
        PhoneNumber phoneNumber3 = new PhoneNumber("412-116-9988", Label.WORK);

        emailAddresses.add(emailAddress1);
        emailAddresses.add(emailAddress2);

        phoneNumbers.add(phoneNumber1);
        phoneNumbers.add(phoneNumber2);

        Contact contact1 = new Contact("David", "Sanger", "Argos LLC", "Sales Manager",
                phoneNumbers, emailAddresses);
        Contact contact2 = new Contact("Carlos", "Jimenez", "Zappos", "Director");
        Contact contact3 = new Contact("Ali", "Gafar", "BMI Services", "HR Manager",
                phoneNumber3, emailAddress3);

        List<Contact> contacts = new ArrayList<>();
        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);

        printContactsJSON(contacts);


     }

     public static void printContactsJSON(List<Contact> contacts) {

        contacts.sort((Comparator.comparing(Contact::getLastName)));
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(contacts);
         System.out.println(json);
     }
}
