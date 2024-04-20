class SciCac extends Calc{
    //
    void add(int p){
        System.out.println(p+p);
    }
}
public class Calc {

    void add(int a,int b){
        System.out.println(a+b);
    }

    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

    void add(float a,int b){
        System.out.println(a+b);
    }

    void add(int x,float y){
        System.out.println(x+y);
    }



    public static void main(String[] args) {
        Calc c = new Calc();
        c.add(32, 11);

    }
}
