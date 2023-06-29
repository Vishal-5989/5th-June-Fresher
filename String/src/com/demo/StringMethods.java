package com.demo;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethods {

    public static void getIndex(){
        System.out.println("** charAt():-return particular character at given index **");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String ");
        String firstString=sc.nextLine();

        System.out.println("Enter Any position to find String ");
        String input=sc.nextLine();
        System.out.println("Character at third position is :"+firstString.charAt(Integer.parseInt(input)));
    }
    public static void CompareTO(){   // serch on google
        System.out.println("** compareTO():-return particular character at given index **");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String ");
        String firstString=sc.nextLine();
        System.out.println("Enter 2st String ");
        String secondString=sc.nextLine();
        System.out.println("Compare the two string: "+firstString.compareTo(secondString));
    }
    public static void Combine(){
        System.out.println("** concat():-combine two string **");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String ");
        String firstString=sc.nextLine();
        System.out.println("Enter 2st String ");
        String secondString=sc.nextLine();

        System.out.println("concatenate function:"+firstString.concat(secondString));
    }
    public static void Equals(){

        System.out.println("** Equals:-check content **");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String ");
        String firstString=sc.nextLine();
        System.out.println("Enter 2st String ");
        String secondString=sc.nextLine();
        System.out.println("equals method:"+firstString.equals(secondString));
    }

    public static void EqualsIgnoreCase(){

        System.out.println("** equalsIgnoreCase() :- doesn't check case sensitivity **");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String ");
        String firstString=sc.nextLine();
        System.out.println("Enter 2st String ");
        String secondString=sc.nextLine();
        System.out.println("equalsIgnoreCase method:"+firstString.equalsIgnoreCase(secondString));
    }

    public static void LastIndexOf(){

        System.out.println("** lastIndexOf() :- method returns the index (position) of the last occurrence of a specified value in a string **");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String ");
        String firstString=sc.nextLine();
        System.out.println("Enter any letter From String ");
        String input=sc.nextLine();
        System.out.println("last index of :"+firstString.lastIndexOf(input));

    }

    public static void Replace(){

        System.out.println("** replace() :- replace old character with new **");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String ");
        String firstString=sc.nextLine();

      //  System.out.println("Enter 1st String ");

        System.out.println("replace:"+firstString.replace("y","X"));
    }

    public static void ReplaceAll(){

        System.out.println("** ReplaceAll() :- replace all old character with new **");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String ");
        String firstString=sc.nextLine();

        System.out.println("Replace All: "+firstString.replaceAll("a","M"));

    }
    public static void Split(){

        System.out.println("** Split() :- split the string **");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String ");
        String firstString=sc.nextLine();


        System.out.println(Arrays.toString(firstString.split("\\s")));

    }

    public static void Substring(){
        System.out.println("** Substring() :- method extracts characters, between two indices (positions), from a string, and returns the substring **");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String ");
        String firstString=sc.nextLine();
        System.out.println("SubString:"+firstString.substring(1,4));

    }
    public static void charArray(){

        System.out.println("** CharArray():-  is an instance method of the String class. It returns a new character array based on the current string object **");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String ");
        String firstString=sc.nextLine();


        System.out.println("toCharArray:"+firstString.toCharArray());

    }

    public static void ToLowerCase(){

        System.out.println("** ToLowerCase() :- Method returns the value of the string converted to lower case **");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  String ");
        String firstString=sc.nextLine();

        System.out.println("Lower Case: "+firstString.toLowerCase());

    }

    public static void Strip(){

        System.out.println("** Strip() :- strip() is an instance method that returns a string whose value is the string with all leading and trailing white spaces removed **");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  String ");
        String firstString=sc.nextLine();

        System.out.println("Strip: "+firstString.strip());

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Choice=0;
        do{
            System.out.println("** Well-Come To String Methods **");
            System.out.println("Press 1 for getIndex()");
            System.out.println("Press 2 for Compare()");
            System.out.println("Press 3 for Combine()");
            System.out.println("Press 4 for Equals()");
            System.out.println("Press 5 for EqualsIgnoreCase()");
            System.out.println("Press 6 for LastIndexOf()");
            System.out.println("Press 7 for Replace()");
            System.out.println("Press 8 for ReplaceAll()");
            System.out.println("Press 9 for Split()");
            System.out.println("Press 10 for Substring()");
            System.out.println("Press 11 for charArray()");
            System.out.println("Press 12 for ToLowerCase()");
            System.out.println("Press 13 for Strip()");

            System.out.println("Enter Your Choice ");
            Choice = sc.nextInt();

            switch(Choice) {
                case 1:
                    StringMethods.getIndex();
                    break;
                case 2:
                    StringMethods.CompareTO();
                    break;
                case 3:
                    StringMethods.Combine();
                    break;
                case 4:
                    StringMethods.Equals();
                    break;
                case 5:
                    StringMethods.EqualsIgnoreCase();
                    break;
                case 6:
                    StringMethods.LastIndexOf();
                    break;
                case 7:
                    StringMethods.Replace();
                    break;
                case 8:
                    StringMethods.ReplaceAll();
                    break;
                case 9:
                    StringMethods.Split();
                    break;
                case 10:
                    StringMethods.Substring();
                    break;
                case 11:
                    StringMethods.charArray();
                    break;
                case 12:
                    StringMethods.ToLowerCase();
                    break;
                case 13:
                    StringMethods.Strip();
                    break;
                default:
                    System.out.println("Sorry You Enter Wrong Input ");
                    break;
            }

        }while(Choice!=13);


    }
}