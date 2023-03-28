package ca.ace.myapp;
import ca.ace.myapp.service.*;

public class MyApp{
  public static void main(String[] args){
    if(args.length!=2){
      System.out.println("You must provide 2 arguments.");
      System.exit(0);
    }
    
     MyService service = new MyService();
     double a = Double.parseDouble(args[0]);
     double b = Double.parseDouble(args[1]);
     double result = service.compute(a,b);
     System.out.println(String.format("Sum of %s and %s is %s",a,b,result));
  } 
}