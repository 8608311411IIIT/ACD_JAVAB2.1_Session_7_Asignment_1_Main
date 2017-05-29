//a simple program to convert an int variable to String using an inbuilt function of String class.
import java.util.*;
public class String1{

     public static void main(String []args){
           int number;
           String s;
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter any number");
           number=sc.nextInt();//takes number as input which u want to convert into string
           s=String.valueOf(number);//valueOf() method defined in String class converts integer to string format
           System.out.println("The string is "+ s);//prints the string value corresponding to int value
           
     }
}
