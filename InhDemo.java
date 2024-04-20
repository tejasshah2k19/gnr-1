public class InhDemo {
    public static void main(String[] args) {
        C c = new C();
        c.sub(); 
        c.add();
    }
}

class A{
    void add(){
        System.out.println("add");
    }
}
//inheritance -> is the process using that 
    //object of a class can access property of another class 
     
class B extends A{
     
    void sub(){
        System.out.println("sub");
    }
}


class C extends B{
    //add()
    //sub() 
}