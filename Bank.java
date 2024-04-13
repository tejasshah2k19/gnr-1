public class Bank {
    
    String name,userName,password; 
    int balance; 

   final static String BRANCE_CODE = "BR12345"; //

    void widATM(int amt){
        balance = balance - amt; 
    }

    void payViaUPI(int amt){
        balance = balance - amt;
    }

    
    void recViaUPI(int amt){
        balance = balance + amt;
    }

    void depositViaATM(int amt){
        balance = balance + amt; 
    }

    void debitcardWid(int amt){
        balance = balance - amt; 
    }

    public static void main(String[] args) {
        Bank nupurObj = new Bank(); //name un pwd balance 
        nupurObj.name = "Nupur"; 
        nupurObj.balance = 20000; 
        nupurObj.userName ="npThakkar";
        nupurObj.password = "12345";


        nupurObj.debitcardWid(1000);
        nupurObj.widATM(5000);

        System.out.println(nupurObj.balance);

        // nupurObj.branchCode = "XYZ";

        
    }


}
