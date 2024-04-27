public class AbstractDemo {
    public static void main(String[] args) {
        // Delta d  = new Delta();
        Delta d  = new Alpha();
        d.sub();         
    }
}
//if your class is abstract , you can not create instance  of it. 
abstract class Delta{
    void add(){
        System.out.println("add from delta");
    }

    abstract void sub();
}

class Alpha extends Delta{
    void sub(){
        //
        add();
    }
}