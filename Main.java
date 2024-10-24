import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in).useLocale(Locale.US);

//1.Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers , takes two numbers as input
       System.out.println("Enter the first number:");
       int num1 = input.nextInt();
       System.out.println("Enter the second number:");
       int num2 = input.nextInt();

       System.out.println(num1+" + "+num2+" = "+(num1+num2));
       System.out.println(num1+" - "+num2+" = "+(num1-num2));
       System.out.println(num1+" x "+num2+" = "+(num1*num2));
       System.out.println(num1+" / "+num2+" = "+(num1/num2));
       System.out.println(num1+" mod "+num2+" = "+(num1%num2));

//2.Write a Java program that takes a number as input and prints its multiplication table up to 10
       System.out.println("Enter a number:");
       int number= input.nextInt();
       for (int i = 1; i <11 ; i++) {
           System.out.println(number+" x "+i+" = "+(number*i));
       }

//3.Write a Java program to print the area and perimeter of a circle.
       System.out.println("Enter circle's radius:");
       double r = input.nextDouble();
       System.out.println("Perimeter is = "+(2*r*Math.PI));
       System.out.println("Area is = "+(Math.PI*(r*r)));

//4.Java program to find out the average of a set of integers
       System.out.println("Enter the count of numbers:");
       int count = input.nextInt();
       int sum = 0;
       for (int i = 0; i <count ; i++) {
           System.out.println("Enter an integer: ");
           int integer= input.nextInt();
           sum+=integer;
       }
       System.out.println("The average is = "+((double)sum/count));

//5.Write a Java program that accepts three integers as input, adds the first two integers together, and then determines whether the sum is equal to the third integer.
       System.out.println("Enter the first number:");
       int num1 = input.nextInt();
       System.out.println("Enter the second number:");
       int num2 = input.nextInt();
       System.out.println("Enter the third number:");
       int num3 = input.nextInt();

       if (num1+num2==num3) System.out.println("The result is true");
       else System.out.println("The result is false");

//6.Write a Java program to reverse a word
       System.out.println("Enter a word:");
       String word= input.nextLine();
       for (int i = word.length()-1; i >=0 ; i--) {
           System.out.print(word.charAt(i));
       }

//7.Java program to check whether the given number is even or odd
       System.out.println("Enter a number: ");
       int num= input.nextInt();
       if (num%2==0) System.out.println("the number is even");
       else System.out.println("the number is odd");

//8.Java program to convert the temperature in Centigrade to Fahrenheit
       System.out.println("Enter the temperature in Centigrade: ");
       double temp= input.nextDouble();
       System.out.println("Temperature in Fahrenheit is: "+(temp*((double)9/5)+32));

//9.Write a Java program that takes a string and a number from the user,then prints the character in the given index.
       System.out.println("Enter a text: ");
       String text= input.nextLine();
       System.out.println("Enter an index:");
       int ind= input.nextInt();
       System.out.println(text.charAt(ind));

//10.Write a Java program to print the area and perimeter of a rectangle
       System.out.println("Enter the length: ");
       double len= input.nextDouble();
       System.out.println("Enter the width: ");
       double wid= input.nextDouble();
       System.out.println("The area is = "+(len*wid));
       System.out.println("The perimeter = "+(2*(len+wid)));

//11.Write a Java program to compare two numbers.
       System.out.println("Enter the first number: ");
       int num1= input.nextInt();
       System.out.println("Enter the second number: ");
       int num2= input.nextInt();

       if (num1==num2) {
           System.out.println(num1 + " = " + num2);
           System.out.println(num1 + " >= " + num2);
           System.out.println(num1 + " <= " + num2);
       }
       else if (num1>num2){
           System.out.println(num1 + " != " + num2);
           System.out.println(num1 + " >= " + num2);
           System.out.println(num1 + " > " + num2);
       }
       else {
           System.out.println(num1 + " != " + num2);
           System.out.println(num1 + " <= " + num2);
           System.out.println(num1 + " < " + num2);
       }

//12.Write a Java program to convert seconds to hours, minutes and seconds.
       System.out.println("Enter the seconds:");
       int sec= input.nextInt();
       int min = 0;
       int hours=0;
       while(sec>0){
           if(sec>=60){
               min++;
               sec-=60;
           }
           if(min>=60){
               hours++;
               min-=60;
           }
       }
       System.out.println(hours+":"+min+":"+sec);

//13.Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.
       System.out.println("Enter a number");
       int num1 = input.nextInt();
       System.out.println("Enter a number");
       int num2 = input.nextInt();
       System.out.println("Enter a number");
       int num3 = input.nextInt();
       System.out.println("Enter a number");
       int num4 = input.nextInt();

       if(num1==num2 && num2== num3 && num3==num4) System.out.println("all numbers are equal");
       else System.out.println("Numbers are not equal");

//14.Write a Java program that reads an integer and check whether it is negative, zero, or positive
       System.out.println("Enter a number: ");
       int num= input.nextInt();
       if (num>0) System.out.println("positive");
       else if (num<0) System.out.println("negative");
       else System.out.println("zero");

//15.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered (End loop use -1 , Don’t count -1).
       int num;
       int pos = 0;
       int neg = 0;
       int zeros = 0;

       do {
           System.out.println("Enter a number or -1 to quit: ");
           num = input.nextInt();
           if(num>0) pos++;
           else if (num<0 && num != (-1)) neg++;
           else if(num == 0) zeros++;
       }while (num !=(-1));
       System.out.println("positive = "+pos+"\n negative = "+neg+"\n Zeros = "+zeros);

//16.Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
       System.out.println("Enter a number:");
       String number= input.nextLine();
       for (int i = number.length()-1; i >=0 ; i--) {
           System.out.print(number.charAt(i));
       }

//17.Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.
     int max = 0;
     int min = 0;
     int num;
   do {
       System.out.println("Enter a number or 0 to quit");
       num = input.nextInt();
       if(num>max) max= num;
       else if (num<min) min = num;
   }while (num !=0);
       System.out.println("the largest number is: "+max);
       System.out.println("the smallest number is: "+min);

//18.- Determine and print the number of times the character ‘a’ appears in the input entered by the user
       System.out.println("Enter a text: ");
       String text = input.nextLine();
       int count=0;
       for (int i = 0; i <text.length() ; i++) {
           if(text.toLowerCase().charAt(i)=='a') count++;
       }
       System.out.println("Number of a's: "+count);
        
    }
}
