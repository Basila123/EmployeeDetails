package com.bridgelabzAddress;
import java.util.*;

public class AddressBook {
    public static void main (String[] args){
        Scanner s= new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        // create instance collection to insert data and use array list collection
        Collection<ContactPerson>collect=new ArrayList<ContactPerson>();
        int choice;
        //use do while concept to add choices.
        do{
            System.out.println("1.Insert");
            System.out.println("2.Display");
            System.out.println("3.Delete");
            System.out.println("4.Update");
            System.out.println("0.Exit");
            System.out.println("Enter your choice");
            choice=s.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter Employee Number");
                    int employeno= s1.nextInt();
                    System.out.println("enter Employees first name");
                    String firstname=s.next();
                    System.out.println("enter Employees last name");
                    String lastname=s.next();
                    System.out.println("enter Employees Address");
                    String address=s.next();
                    System.out.println("City");
                    String city=s.next();
                    System.out.println("enter State");
                    String state=s.next();
                    System.out.println("zip code");
                    String zip=s.next();
                    System.out.println("enter Employees email");
                    String email=s.next();
                    System.out.println("enter Employees phone number");
                    int phno= s1.nextInt();
                    //inserting the elements by calling constructor
                    collect.add(new ContactPerson(employeno,firstname,lastname,address,city,state,zip,
                            email,phno));
                    break;
                case 2:
                    System.out.println(collect);
                    break;
                case 3 :
                    boolean found=false;
                    System.out.println("Enter first name to update");
                    firstname=s.next();
                    System.out.println("_______________________________________________________>");
                    ListIterator<ContactPerson>li= ((ArrayList<ContactPerson>) collect).listIterator();//iterating using list iterator
                    while(li.hasNext()){
                        ContactPerson contact=li.next();
                        if(contact.getFirstname()==firstname){
                            System.out.println("Enter first name");
                            firstname=s.next();
                            System.out.println("Enter last name");
                            lastname=s.next();
                            System.out.println("Enter state");
                            state=s.next();
                            System.out.println("Enter zip");
                            zip=s.next();
                            System.out.println();
                            address=s.next();
                            System.out.println("Enter your city");
                            city=s.next();
                            System.out.println("Email");
                            email=s.next();
                            System.out.println("Enter your phone number");
                            phno=s1.nextInt();
                            System.out.println("Enter your employee number");
                            employeno=s1.nextInt();
                            li.set(new ContactPerson(employeno,firstname,lastname,address,city,state,zip,
                                    email,phno));
                            found=true;
                        }
                    }
                    if(!found){
                        System.out.println("Record Not Found");
                    }
                    else{
                        System.out.println("Record is updated Successfully------------!");
                    }
                    System.out.println("______________________________________");
                    break;
                case 4:
                     found=false;
                    System.out.println("Enter first name to deleted");
                    firstname=s.next();
                    System.out.println("_______________________________________________________>");
                    Iterator i=collect.iterator();
                    i=collect.iterator();
                    while(i.hasNext()){
                        ContactPerson contact= (ContactPerson) i.next();
                        if(contact.getFirstname()==firstname){
                            i.remove();
                            found=true;
                        }
                    }
                    if(!found){
                        System.out.println("Record Not Found");
                    }
                    else{
                        System.out.println("Record is deleted Successfully------------!");
                    }
                    System.out.println("______________________________________");
                    break;

            }





        }while(choice!=0);
    }
}
//only main class can be public
class ContactPerson{
    // declairing instance variables
    int employeeno;
    String firstname;
    String lastname;
    String address;
    String zip;
    String email;
    String state;
    String city;
    int phno;
    //constructor to initialize instance variables
    ContactPerson(int employeeno,String firstname,String lastname,
                  String address,String zip,String email,String city,String state,int phno){
        this.employeeno=employeeno;
        this.address=address;
        this.city=city;
        this.email=email;
        this.firstname=firstname;
        this.lastname=lastname;
        this.zip=zip;
        this.phno=phno;
        this.state=state;
    }
    //getter method to acces the details
    public int getEmployeeno(){
        return employeeno;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public String getAddress(){
        return address;
    }
    public String getZip(){
        return zip;
    }
    public String getEmail(){
        return email;
    }
    public String getCity(){
        return city;
    }
    public int getPhno(){
        return phno;
    }
    //override
    public String toString(){
        return employeeno+" "+ firstname+" "+lastname+" "+ city+" "+address+" "+ " "+ zip+" "+ email+" "+ phno;
    }
}