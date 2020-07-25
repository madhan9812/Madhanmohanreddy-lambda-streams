package com.epam.Task_2;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	ArrayList<String> arrS = new ArrayList<String>();
    	System.out.println("Enter size of ArrayList:");
    	int n = sc.nextInt();
    	System.out.println("Enter List of Strings:");
    	for(int i=0;i<n;i++){
    	String x = sc.next();
    	arrS.add(x);
    	}
    	System.out.println("The strings starting with 'a' and of length 3 are :");
    	arrS.forEach(i -> { if( i.startsWith("a") && i.length()==3) System.out.println(i);});
    	sc.close();
    }
}
