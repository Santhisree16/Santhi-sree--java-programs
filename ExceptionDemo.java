//ExceptionDemo.java
import java.util.*;
class exceptionDemo{
public static void main(String[] args){
Scanner sin=new Scanner(System.in);
System.out.println("enter a,b");
int a=sin.nextInt();
int b=sin.nextInt();
try{
int c=a/b;
System.out.println("division:"+c);
}
catch(ArithmeticException e){
System.out.println("Exception handled in catch block:"+e);
}
}
}