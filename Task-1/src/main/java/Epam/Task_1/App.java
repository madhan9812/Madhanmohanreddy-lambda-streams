package Epam.Task_1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App ap = new App();
        System.out.println(ap.Avg());
    }
    double Avg()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter size of list:");
    	int n = sc.nextInt();
    	System.out.print("Enter Integers:");
    	int arr[] = new int[n];
    	int sum=0;
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=sc.nextInt();
    		sum=sum+arr[i];
    	}
    	double result = (double)sum/(double)n;
    	sc.close();
    	return result;
    }
}
