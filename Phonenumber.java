/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roger
 */
import java.util.Scanner;
public class Phonenumber
{
    static String  numeral = "";
    static String choice = "";
    static Boolean numeralTest = false;
    static Boolean choiceTest = false;  
    public static void main(String[]args)
    {
      inputNumber();   
    }
    public static void inputNumber()
    {
        
   
       do
       {
       System.out.println("Please enter the please enter the phone number");
       Scanner sc = new Scanner(System.in);
       numeral = sc.nextLine();
       
     // System.out.println("The number is "+numeral);
       String tennis = ""; 
              for (int x = 0;x < numeral.length();x++)
              {
                  
                  
                  char alpha =  numeral.charAt(x);  
                 
                  Boolean flag = Character.isDigit(alpha);
                  // test if character is a digit
                // System.out.println(alpha); 
                 if (flag == true)
                 {
                     
                 // System.out.println("This is a digit"); 
                  String dd =Character.toString(alpha);
                  // Every digit is added to string tennis
                 //  System.out.println("This is dd "+dd);
                    
                    tennis = tennis + dd;
                    
                 // prints out final number string
                 // System.out.println("This is tennis "+tennis); 
                 }
                 else
                 {
                  // System.out.println("This is a not a number");  
                 }
                 
                }    //for loop
               
                if (tennis.length() > 9 && tennis.length() < 12)
                {
                    if(tennis.length() == 11 && tennis.charAt(0)=='1')
                    {
                    // System.out.println("The number begins with 1"); 
                     tennis = tennis.substring(1);
                    }
                
                String a = tennis.substring(0, 3);
                String b = tennis.substring(3, 6);
                String c = tennis.substring(6);
                String d = "("+a+")"+b+"-"+c;
                
                            do
                            {
                            choiceTest = false;
                            System.out.println("Is this your number? enter y for yes and n for no. "+d);  
                             choice = sc.nextLine().toLowerCase();
                            // System.out.println("Choice is "+choice); 
                             
                                    switch (choice)
                                    {
                                        case "y":
                                     
                                    // System.out.println("You choice is y ");
                                     System.out.println("Thanks for entering your number ");
                                     numeralTest = true;
                                     choiceTest = true;
                                     break;
                                        case "n":


                                   //     System.out.println("You choice is n ");  
                                       numeralTest = false;  
                                       choiceTest = true;
                                       break;
                                     //if (choice != "1" && choice != "2")
                                        default:

                                          System.out.println("invalid entry ");
                                             System.out.println("please enter either y for YES or n for NO");
                                             numeralTest = false;
                                        //     System.out.println("ChoiceTest is "+choiceTest);
                                             break;

                                       }// case loop
                            }
                while (choiceTest == false);
                
               }
                else
                {
                   System.out.println("Invalid Number please reenter"); 
                }
              
      
      
       }// while loop
       while (numeralTest == false);
       
       
       
   
   
}
}
