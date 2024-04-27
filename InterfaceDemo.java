public class InterfaceDemo {
    public static void main(String[] args) {
        Car c = new Dzire(); 
        c.start();
        c.stop();
        c.run(); 
    }
}

//default->public and abstract 
interface Car{
    void start();
    abstract void stop();
    public abstract void run(); 
}

class Dzire implements Car{
    public void start(){

    }
    public void stop(){

    }
    public void run(){

    }

} 