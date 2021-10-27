package com.bridgelabzAddress;
import java.util.*;
public class AddressBook {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
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
        System.out.println(employeno);
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(address);
        System.out.println(state);
        System.out.println(city);
        System.out.println(zip);
        System.out.println(email);
        System.out.println(phno);

    }
}
