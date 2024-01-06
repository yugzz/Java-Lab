import java.util.Scanner;
public class Polymorphism 
{
 public void compare(String s1, String s2)
 {
 if(s1.compareTo(s2) == 0)
 {
 System.out.println("The 2 strings are same");
 }
 else
 {
 System.out.println("The 2 strings are not same");
 }
 }
 public void compare(String s1, String s2, int n)
 {
 int flag = 0;
 for(int i=0; i<n; i++)
 {
 if(s1.charAt(i) != s2.charAt(i))
 {
 flag = 1;
 }
 }
 if (flag == 0)
 {
 System.out.println("The 2 strings are same upto "+n+"characters");
 }
 else
 {
 System.out.println("The 2 strings are not same upto "+n+"characters"); 
 }
 }
 public static void main(String[] args) 
 {
 Scanner scanner = new Scanner(System.in);
 Polymorphism obj1 = new Polymorphism();
 System.out.print("Enter the first string: ");
 String s1 = scanner.nextLine();
 System.out.print("Enter the second string: ");
 String s2 = scanner.nextLine();
 obj1.compare(s1,s2);
 System.out.print("Enter the number of characters to compare: ");
 int n = scanner.nextInt();
 obj1.compare(s1,s2,n);
 
 scanner.close();
 }
}
