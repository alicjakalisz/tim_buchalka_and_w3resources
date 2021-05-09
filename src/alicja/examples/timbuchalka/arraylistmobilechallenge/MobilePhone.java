package alicja.examples.timbuchalka.arraylistmobilechallenge;


import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    //attributes:
    private ArrayList<Contact> contacts;

    //constructor:
    public MobilePhone() {
        this.contacts = new ArrayList<>();
    }

    // first method
    public static void printMenu(){
        System.out.println("1.Print List of Contacts");
        System.out.println("2.Add new contact");
        System.out.println("3.Update existing contact");
        System.out.println("4.Remove contact");
        System.out.println("5.Search/find a contact");
        System.out.println("6. Quit");

    }
    // second method
    public  boolean chooseMenu(){
        int choice=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Choose an option from the menu: ");
        printMenu();
        boolean hasInt=scanner.hasNextInt();
        //dd\n --> if hasInt is a string first you clear the scanner (one operation as will clear the whole string)
        while(!hasInt){// if hasInt is false (contains string, not int) then it enters to the loop), you need to clear scanner first
            scanner.nextLine();
            System.out.println("You need to type down the number. Choose once again");
            hasInt=scanner.hasNextInt();// you ask again and check if int
        }   //45\n --> first store 45  and n| you clear
        choice=scanner.nextInt();//if above hasInt was actually an integer, first you store this in variable and next you clear scanner
        scanner.nextLine();
        switch(choice){
            case 1:
                printListOfContacts();
                break;
            case 2:
                addNewContact();
                break;
            case 3:
                updateExistingContact();
                break;
            case 4:
                removeContact();
                break;
            case 5:
                searchContact();
                break;
            default:
                System.out.println("Quits the program");
                return false;

        }
        System.out.println();
        return true;
    }
    //3rd Method
    private  void printListOfContacts(){
        System.out.println("List of contacts: ");
        for (int i = 0; i <contacts.size(); i++) {
            System.out.println(contacts.get(i));

        }

    }
    //4h Method
    private   void addNewContact(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Add new contact name: ");
        String newContact=scanner.nextLine();
        System.out.print("Telephone: ");
        String phone=scanner.nextLine();
        Contact a= new Contact(newContact.trim(),phone);
        contacts.add(a);
    }
    //5th Method
    private   void updateExistingContact(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Give me the name of the contact you want to update: ");
        String oldName=scanner.nextLine();
        boolean exists=false;
        int index=0;
        for (int i = 0; i <contacts.size() ; i++) {
            if (contacts.get(i).getName().equals(oldName.trim())) {
                exists=true;
                index=i;
                break;
            }

        }
        if(!exists){
            System.out.println("this name does not exist.");
        }
        else{
            System.out.print("Add new contact name: ");
            String newContact=scanner.nextLine();
            System.out.print("telephone: ");
            String phone=scanner.nextLine();
            Contact a= new Contact(newContact.trim(),phone);
            contacts.set(index, a);
        }


    }

    private   void removeContact(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Give me the name of the contact you want to update: ");
        String oldName=scanner.nextLine();
        boolean exists=false;
        int index=0;
        for (int i = 0; i <contacts.size() ; i++) {
            if (contacts.get(i).getName().equals(oldName.trim())) {
                exists=true;
                index=i;
                break;
            }

        }
        if(!exists){
            System.out.println("this name does not exist.");
        }
        else{
            System.out.print("Are you sure you want to delete this contact?(Y/N)");
            String yesOrNo=scanner.nextLine();
            boolean isCorrect=false;
            while(!isCorrect){
                if (!yesOrNo.toLowerCase().equals("y") || !yesOrNo.toLowerCase().equals("n")){
                    System.out.println("Please insert Y or N");
                    System.out.print("Are you sure you want to delete this contact?(Y/N)");
                    yesOrNo=scanner.nextLine();
                }
                else{
                    isCorrect=true;
                }
            }
            if(yesOrNo.toLowerCase().equals("y")){
                contacts.remove(index);
            }

        }
    }
    private  void searchContact(){
        System.out.println("Give name: ");
        Scanner scanner= new Scanner((System.in));
        String searchedName=scanner.nextLine();
        boolean found=false;
        for (int i = 0; i <contacts.size() ; i++) {
            if(contacts.get(i).getName().toLowerCase().equals(searchedName.trim().toLowerCase())){
                System.out.println("Phone number for "+searchedName+ " is: "+ contacts.get(i).getPhoneNo());
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("There are no records for this name");
        }


    }

}
