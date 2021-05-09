package alicja.examples.w3examples;

import java.util.Scanner;

public class BasicPart1 {


    public static void main(String[] args){
//1
        System.out.println("Hello\nALicja Kalisz");

//2
    int x =74;
    int y= 36;
    int sum=x+y;
        System.out.println(sum);
//3
     int a=50;
     int b=3;
     int sum1a=a/b;
        System.out.println(sum1a);
     float sum1 =(float) a/(float)b;
        System.out.println(sum1);
//4
        System.out.println(-5+8*6);
        System.out.println((55+9)%9);
        System.out.println(20+-3*5/8);
        System.out.println(5+15/3*2-8%3);

//6
        int n1=125;
        int n2=24;
        int sumOfaddition=n1+n2;
        int sumOfsubtraction=n1-n2;
        int resultOfmultiplication=n1*n2;
        int remainer=n1%n2;

        System.out.println(sumOfaddition);
        System.out.println(resultOfmultiplication);
        System.out.println(sumOfsubtraction);
        System.out.println(remainer);

  //7

        Scanner scanner=new Scanner(System.in);
        System.out.println("Give number: ");
        int input=scanner.nextInt();
        int i =0;
        int sum3=0;
        for(i=1; i<11; i=i+1 ){
            sum3=input*i;
            System.out.println(input + "x" + i + "=" + sum3 );
        }


   //8





    }
}
