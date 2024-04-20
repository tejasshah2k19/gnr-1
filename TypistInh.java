// public class TypistInh {
//     public static void main(String[] args) {
//         Regular r = new Regular();
//         r.input3();
//         r.display(); 
//     }    
// }


// class Staff{
//     String name;

//     void input1(){
//         name = "ram"; 
//     }
// }

// class Typist extends Staff{
//     int speed;
//     void input2(){
//         input1();
//         speed = 112;
//     }
// }

// class Regular extends Typist{
//     int salary;
//     void input3(){
//         input2();
//         salary = 10000;
//     }
//     void display(){
//         System.out.println("Name : "+name);
//         System.out.println("Speed : "+speed);
//         System.out.println("Salary : "+salary);
//     }   

// }



public class TypistInh {
    public static void main(String[] args) {
        Regular r = new Regular();
        r.input();
        r.display(); 
    }    
}


class Staff{
    String name;

    void input(){
        name = "ram"; 
    }
}

class Typist extends Staff{
    int speed;
    void input(){
        super.input();
        speed = 112;
    }
}

class Regular extends Typist{
    int salary;
    void input(){
        salary = 10000;
        super.input();
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Speed : "+speed);
        System.out.println("Salary : "+salary);
    }   

}