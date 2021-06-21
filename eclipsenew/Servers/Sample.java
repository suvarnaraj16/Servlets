package com.suneratech;

import java.util.Scanner;
public class Sample
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	int k = sc.nextInt();
	int book[]= new int[k],sum=1,num=0;
	for(int i=0; i<k; i++)
	{
	    book[i] = sc.nextInt();
	   // System.out.print("Modulo is : "+book[i]%10);
	   
	    num = book[i]%10;
	  //  System.out.println("\tNum is : "+num);
	    sum = sum * num;
	}
	//System.out.println("Output sum is :"+sum);
	System.out.println(sum);
	}
}