package org.example;

import javax.swing.*;
import java.util.Locale;
import java.util.Map;

public class SearchPhoneBook {
    //to search for contacts
    public static void searchPhoneBook() {
//        System.out.println();
//        System.out.print("press 1 to search by Name or 2 to search by Number: ");
//        int option = Main.input.nextInt();
        int option = 0;
        while ((option != 1) || (option != 2) ) {
            option = Integer.parseInt(JOptionPane.showInputDialog("press 1 to search by Name or 2 to search by Number: "));
            if(option == 1){
                searchByName();
                break;
            } else if (option == 2) {
                searchByNumber();
                break;
            }

        }
    }

    //to search by name
    public static void searchByName() {
//        System.out.print("Please Enter Contact Name: ");
//        String name = Main.input.next().toLowerCase();
        String name = JOptionPane.showInputDialog("Please Enter Contact Name: ").toLowerCase();
        if(Main.contact.containsKey(name)){
            for(Map.Entry names: Main.contact.entrySet()){
                if(names.getKey().equals(name)){
//                    System.out.println();
//                    System.out.println("Name: " + names.getKey());
//                    System.out.println("Number: " + names.getValue());
                    JOptionPane.showMessageDialog(null, "Name: "+ (String) names.getKey() + "\n" +
                            "Number: " + (String) names.getValue());
                }
            }
        }
        else{
//            System.out.println("Name not found!");
            JOptionPane.showMessageDialog(null, name + " not found!");
        }
        AddNewContact.addSearchExit();
    }

    //to search by number
    public static void searchByNumber() {
//        System.out.print("Please Enter Contact Phone Number: ");
//        String number = Main.input.next().toLowerCase();
        String number = JOptionPane.showInputDialog("Please Enter Contact Phone Number: ");
        if(Main.contact.containsValue(number)){
            for(Map.Entry numbers: Main.contact.entrySet()){
                if(numbers.getValue().equals(number)){
//                    System.out.println();
//                    System.out.println("Name: " + numbers.getKey());
//                    System.out.println("Number: " + numbers.getValue());
                    JOptionPane.showMessageDialog(null, "Name: "+ (String) numbers.getKey() + "\n" +
                            "Number: " + (String) numbers.getValue());
                }
            }
        }
        else{
//            System.out.println("Number not found!");
            JOptionPane.showMessageDialog(null, number + " not found!");
        }
        AddNewContact.addSearchExit();
    }
}
