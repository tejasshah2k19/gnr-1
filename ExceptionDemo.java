import java.io.File;
import java.util.*;
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter 2 num");
        try{ 
            int a = scr.nextInt();
            int b = scr.nextInt();     
            int c = a/b; //object create throw 
            System.out.println("ans = "+c);
        }catch(ArithmeticException e){ // / by zero 
            System.out.println("Please do not enter ZERO");
        // }catch(InputMismatchException e){
        //     System.out.println("Please Enter Integers(whole numbers)");
        }catch(Exception e){
            System.out.println("Something Went Wrong PTA");   
            // e.printStackTrace();
            //sendMailToDev(e.printStackTrace());
            // System.out.println(e.getClass().getName());
        }finally{
            System.out.println("I am always Execute....");
        }
        System.out.println("THE END");   
        
        try{ 
            File f = new File("demo.txt");
         //   f.createNewFile();  //IOException ?
        }finally{
                //
        }
    }
}

//what is exception ? 


    //compile time -> syntax error -> ;  == variable import  -- java compiler 
    //run time      -> logic -> run -> crash ->

    //exception -> run time error 


    //exception handeling 

    //try catch finally 


        //code -> exception 

        //Throwable 


        //Exception => class 
    //ArrayIndexOut 
    //NullPointer
    //StringIn
    //FileNot
    //IOEx
    

    /*
     * 
     *                      Throwable 
     *              Error               Exception 
     *                                      XXXXXX 
     *                                      XXXXXX                  RuntimeException 
     *                                      IOException         ArithmeticException InputMismatchException 
     *
     * 
     *  direct extends Exception -> handle compulsory -> checked exception  
     *  indirect , extends RuntimeException -> unchecked exception 
     * 
     * 
     *  finally -> i will alwyas execute -> exception is there or not 
     *              -> clean  , deallocate , release , free 
     * 
     * 
     * 
     * custom exception -> 
     * 
     * 1) class extends Exception 
     * 2) constructor -> msg set ->error 
     * 
     * 
     */
    
