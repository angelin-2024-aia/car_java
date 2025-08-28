import java.util.Scanner;
class OOPS_LAB3{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
try {
System.out.print("Enter first number: ");
int num1 = sc.nextInt();
System.out.print("Enter second number: ");
int num2 = sc.nextInt();
int division = num1 / num2;
System.out.println("Result of division: " + division);
int[] marks = {90, 80, 70, 60};

System.out.print("Enter index (0-3) to access marks: ");
int index = sc.nextInt();
System.out.println("Mark at index " + index + ": " + marks[index]);
}
catch (ArithmeticException e) {
System.out.println("Error: Division by zero not allowed!");
}
catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Error: Invalid array index!");
}
finally {
System.out.println("Finally block executed: Closing resources...");
sc.close();
}
}
}