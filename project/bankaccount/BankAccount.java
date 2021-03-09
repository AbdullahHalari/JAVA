package bankaccount;

import java.util.Scanner;

public class BankAccount {
        
    public static void main(String[] args) {
        String name;
        int phone;
        float balance;
        int choice,ch;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("######################################################");
        System.out.println("\n\tWELCOME TO ROYAL BANK OF SCOTLAND");
        System.out.println("\n######################################################");
        System.out.println("########Login########");
        System.out.println("To create your account:\nEnter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your phone No:");
        phone = Integer.parseInt(sc.nextLine());
        Account acc1 = new Account(name, phone);
        acc1.types();        
        }
    }