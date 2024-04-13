public class Student {
    String name;
    int maths;
    int sci;
    int eng;

    static  int collegCode; 


    // logic
    void assignValue() {
        name = "ram";
        maths = 90;
        sci = 80;
        eng = 70;
    }

    void printData(){
        System.out.println("Name : "+name);
        System.out.println("Maths : "+maths);
        System.out.println("Sci : "+sci);
        System.out.println("Eng : "+eng);
    }

    public static void main(String[] args) {
        //create instance of the Student class 

        Student s  = new Student(); 
        s.assignValue();
        s.printData();

        Student s2 = new Student(); 
        s2.assignValue(); 
        s2.printData(); 

        s2.name ="jack";

        s.printData(); // ram  
        s2.printData();//  jack 

    }
}

// rule-> when you have a public class then your file name must be same as
// public class name
// if we dont have any public class then you can give any name to your java file

// varibale -> its a data name ,which given by you , which can hold the value
// name is varibale , maths sci and eng are the variable
// what type of values can be hold by the variable ? data type

// data type -> what type of values can be hold by the variable

// type data type ?

// primitive -> 8 -> byte short char int long float double boolean
// non primitive -> * -> class , object , array , enum , interface
