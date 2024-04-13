public class Employee {
    String name; //null 
    int salary; // 0
    char gender; // \0 '\u0000' null character 
    byte taxAmount; //0
    short gstAmount; //0
    long totalTax;//0 
    float discountPercentage;//0.0 
    double totalDiscountPercentage;//0.0 
    boolean accountLocked; //false 
    

    void printValues(){
        System.out.println(name);
        System.out.println(salary);
        System.out.println(gender);
        System.out.println(taxAmount);
        System.out.println(gstAmount);
        System.out.println(totalTax);
        System.out.println(discountPercentage);
        System.out.println(totalDiscountPercentage);
        System.out.println(accountLocked);
    }

    Employee(){
        name = "jack";
    }

    
    Employee(String data){
        name = data;
    }
    public static void main(String[] args) {
        
            Employee e = new Employee();
            e.printValues();
            //assig the values - default values 
            //constructor -> 
            //is a special method which must have same name as class name and it must not return anything
            //it is used to initialize instance variable 

            //we dont have to call constructor manually 
            //constructor will call when we create instance. 

            //implicit constructor -> java 
                //no argument 
            //explicit constructor -> user 
                //no argument
                //parameterized 

            Employee x1 = new Employee("rock");
            x1.printValues();
        }
}
