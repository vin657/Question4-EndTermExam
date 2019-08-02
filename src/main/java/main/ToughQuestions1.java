package main;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;
public class ToughQuestions1 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the account number");
       int acc_no = Integer.parseInt(br.readLine());
       System.out.println("Enter the account holder name");
       String acc_name = br.readLine();
       System.out.println("Enter the type of account");
      String type = br.readLine();
       System.out.println("Enter the balance");
      int  bal = Integer.parseInt(br.readLine());
       Account a = new Account(acc_no,acc_name,type,bal);
       int choice;
      
	do
       {
       System.out.println("1. Credit Account \n2. Debit Account \n3. Display Account Details");
       System.out.println("Enter your choice");
       choice  = Integer.parseInt(br.readLine());
       switch(choice)
       {
           case 1: System.out.println("Enter the amount to be credited");
          int  credit = Integer.parseInt(br.readLine());
           a.credit(credit);
           break;
           case 2: System.out.println("Enter the amount to be debited");
          int  debit = Integer.parseInt(br.readLine());
           a.debit(debit);
           break;
           case 3:a.display();
           break;
       }
      }while(choice<4);
    }
}



class Account {
    private int accno;
    private int balance;
    private String accname;
    private String type;
    Account(int acc_no, String acc_name, String type, int bal) {
        this.accno = acc_no;
        this.balance = bal;
        this.accname = acc_name;
        this.type = type;
    }
    int credit(int credit) {
        return balance = balance + credit;
    }
    void display()
    {
       System.out.println("Account Details");
        System.out.println("Accont Number : "+accno);
        System.out.println("Accont Name : "+accname);
        System.out.println("Accout type :"+type);
        System.out.println("Accout Balance :"+balance);
        System.out.println();
    }
    int debit(Integer debit) {
         return balance = balance - debit;
    }
}