package org.example;
import javax.swing.JOptionPane;
public class AddNewContact {
    //collects name and phone number from user
    public static void addContact() {
//        System.out.println();
//        System.out.println("Enter and and Phone number");
//        System.out.println("Number must start with 0 and must be eleven digits!");
//        System.out.print("Name: ");
        String name = JOptionPane.showInputDialog("Enter name and Phone number \nName: ");
       // String name = Main.input.next().toLowerCase();
        String number = checkNum();
//        System.out.println("Contact Saved");
        JOptionPane.showMessageDialog(null,"Contact Saved");

        Main.contact.put(name, number);
        addSearchExit();

    }

    //check if the user input number in the right format
    public static String checkNum() {
        String number;
        while(true){
//            System.out.print("Enter Valid Phone-Number: ");
//            number = Main.input.next();
            number = JOptionPane.showInputDialog("Enter Valid Phone-Number \nNumber must start with 0 and must be eleven digits! \nNumber: ");
            if(number.length() == 11 && number.matches("\\d+") && number.startsWith("0")){
                break;
            }
        }
        return number;
    }



    //to add more contact
    public static void addSearchExit() {
//        System.out.println();
//        System.out.println("Enter 1 to add more Contact");
//        System.out.println("Enter 2 to search contact");
//        System.out.println("Enter 3 to exit");
//        System.out.print("Enter 1, 2 or 3: ");

//        int select = Main.input.nextInt();
        int select = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 to add more Contact \nEnter 2 to search contact " +
                "\nEnter 3 to exit \nEnter 1, 2 or 3: "));
        if(select == 1){
            addContact();
        }
        else if(select == 2){
            SearchPhoneBook.searchPhoneBook();
        }
        else{
//            System.out.println("Thank You!");
            JOptionPane.showMessageDialog(null, "Thank you!");
        }
    }

}
