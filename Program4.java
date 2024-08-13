//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)

import java.util.Scanner;

public class Program4{
    
public static void main(String []args){

int num1;
int num2;
int num3;
int num4;
int sum;
int average;
Scanner myNum =  new Scanner(System.in);

System.out.println("Enter a 3 digit number: ");

num1 = myNum.nextInt();

System.out.println("Enter a different 3 digit number: ");

num2 = myNum.nextInt();

System.out.println("Enter a different 3 digit number: ");

num3= myNum.nextInt();

System.out.println("Enter a different 3 digit number: ");

num4 = myNum.nextInt();

sum = num1 + num2 + num3 + num4;

System.out.println("The sum is: " + sum);

average = sum/4;

System.out.println("The average is:" + average);


}
    
    
}

//Paste console output below:
/*
Enter a 3 digit number: 
100
Enter a different 3 digit number: 
269
Enter a different 3 digit number: 
420
Enter a different 3 digit number: 
364
The sum is: 1153
The average is: 288

*/
