package org.example;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    //public static Scanner input = new Scanner(System.in);
    public static HashMap<String, String> contact = new HashMap<String, String>();

    public static void main(String[] args) {
        //prompt the user to save or search contact
//        System.out.println("Hey There! Welcome to my Phone Book");
        JOptionPane.showMessageDialog(null, "Hey There! Welcome to my Phone Book");

        while(true) {
//            System.out.println();
            int option = Integer.parseInt(JOptionPane.showInputDialog("Press 1 to add new contact or 2 to search for contact: "));
            if (option == 1) {
                AddNewContact.addContact();
                break;
            }
            else if(option ==2){
                SearchPhoneBook.searchPhoneBook();
                break;
            }
        }
    }

}