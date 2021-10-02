import java.util.Scanner;  
   
class LinearSearch
{ 

  public static void main(String args[])  
  {  
    int a, n, search, arr[];  
   
    Scanner in = new Scanner(System.in);  
    System.out.println("Enter number of elements");  
    n = in.nextInt();   
    arr = new int[n];  
   
    System.out.println("Enter " + n + " elements");  
   
    for (a = 0; a< n; a++)  
      arr[a] = in.nextInt();  
   
    System.out.println("Enter value to find");  
    search = in.nextInt();  
   
    for (a = 0; a < n; a++)  
    {  
      if (arr[a] == search)   
      {  
         System.out.println(search + " is present at location " + (a + 1) + ".");  
          break;  
      }  
   }  
   if (a == n)  
   {   
      System.out.println(search + " isn't present in array.");  
   }
  }  
}  