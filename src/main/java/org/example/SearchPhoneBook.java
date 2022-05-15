package org.example;

import java.util.Map;

public class SearchPhoneBook {
    //to search for contacts
    public static void searchPhoneBook() {
        System.out.println();
        System.out.print("press 1 to search by Name or 2 to search by Number: ");
        int option = Main.input.nextInt();
        while (true) {
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
        System.out.print("Please Enter Contact Name: ");
        String name = Main.input.next().toLowerCase();
        if(Main.contact.containsKey(name)){
            for(Map.Entry names: Main.contact.entrySet()){
                if(names.getKey().equals(name)){
                    System.out.println();
                    System.out.println("Name: " + names.getKey());
                    System.out.println("Number: " + names.getValue());
                }
            }
        }
        else{
            System.out.println("Name not found!");
        }
        AddNewContact.addSearchExit();
    }

    //to search by number
    public static void searchByNumber() {
        System.out.print("Please Enter Contact Phone Number: ");
        String number = Main.input.next().toLowerCase();
        if(Main.contact.containsValue(number)){
            for(Map.Entry numbers: Main.contact.entrySet()){
                if(numbers.getValue().equals(number)){
                    System.out.println();
                    System.out.println("Name: " + numbers.getKey());
                    System.out.println("Number: " + numbers.getValue());
                }
            }
        }
        else{
            System.out.println("Number not found!");
        }
        AddNewContact.addSearchExit();
    }
}
