package com.epam.Task_3;
import java.util.*;
interface Task{
	ArrayList<String> generateArrayList(); 
}
class Palindrome implements Task
{
public ArrayList<String> generateArrayList(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter List Size :");
    int n = sc.nextInt();
    System.out.println("Enter List of Strings");
    ArrayList<String> stringArray = new ArrayList<>();
    for (int i=0;i<n;i++){
        String str= sc.next();
	String reverse = new StringBuffer(str).reverse().toString();
	if (str.equals(reverse))
        stringArray.add(str);
    }
    return stringArray;
}
}
public class App{
    public static void main(String args[]){
	Palindrome pal = new Palindrome();
	ArrayList<String> as = new ArrayList<String>();
	as = pal.generateArrayList();
	System.out.println("The list of Palindromes is :");
	for(int i=0;i<as.size();i++)
	System.out.println(as.get(i));
    }
}