public class PolymorphicDemo {
    public static void main(String[] args) {
        P obj = new Q();//polymorphic object 
        obj.add();
        obj.mul();
         
    }
}

class P{
    void add(){
        System.out.println("p::add");
    }
    void mul(){

    }
}
class Q extends P{

    void add(){
        System.out.println("q::add");
    }
    void sub(){

    }
}

        //List 
//ArrayList //Vector 
