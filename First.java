import java.util.Scanner;
//java -> io , lang , util , nio , applet , net ,  
//Date -> sql , util 

//package -> 
//class -> pacakge import -> if that class is belongs to other package 
//we dont require import if we are in same package 


class First{

    String name="Ram"; 

    void getName(){
        System.out.println("Enter name");
        Scanner scr = new Scanner(System.in);//console 
    }
    void printName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
    
        //classname objname = new classname(); 
        First obj = new First(); 
        //using dot operator obj can acccess class property 
        System.out.println(obj.name);//variable 
        obj.printName();//method 
    }
}

//pure object -> class X 

//class -> name -> reserve word  , int float if 
                // -> First Letter must not be Digit   
                // -> you can use only  upper and lower letter ,  digit,  underscore _ and dollar $ in class name 



//convention -> 
    //class -> first lette capital , second word - first char capital 
                // Employee 
                // EmployeeSalary 
                // Killer 
                // TestKiller 
                 
//class -> blue print -> structure -> logical entity -> group -> general 
// object -> real -> physical entity  -> member -> special 



//Bank 
//Customer 
//Mr Mithil 
//Laptop 
//Mango 
//TheDhirajSir 
//Mouse
//Projector
//TV 
//Car 
//Balleno 
//Men
//Women
//Bottle
//WaterBottle
//LemonWaterBottle 

// class -> two properties ->
    // varibale + method 
//object -> access property of class 

//image , varchar(255)  -> bcz we will store path of the image not entire image into database 




//class contains two properties -> 
        //method 
        //variable 

    //to create a class we have to use class keyword 
    