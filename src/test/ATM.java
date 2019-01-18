
package test;

abstract class ATMprocess{

    abstract protected void inputCard();
    abstract protected void typePIN();
    abstract protected void typeAmount();
    
    private void bankStatus(){
        System.out.println("Accepted");
    }
    private void balanace(){
        System.out.println("Your account balance is 10 000");
    }
    private void withdraw(){
        System.out.println("You can now continue withdrawing...");
    }
    
    abstract protected void takeMoney();
    abstract protected void endTransaction();

    public void run(){
        this.inputCard();
        this.typePIN();
        this.typeAmount();
        this.bankStatus();
        this.balanace();
        this.withdraw();
        this.takeMoney();
        this.endTransaction();
       
    }
}


public class ATM extends ATMprocess {
    
    protected void inputCard(){
        System.out.println("Wprowadź kartę");
    }
    protected void typePIN(){
        System.out.println("Podaj swój kod PIN");
    }
    protected void typeAmount(){
        System.out.println("Podaj kwotę wypłaty");
    } 
    protected void takeMoney(){
        System.out.println("Pobierz pieniądze");
    }
    protected void endTransaction(){
        System.out.println("Dziękujemu.");
    }
}

class App3 {
    public static void main (String[] args){
        
    ATM atm = new ATM();
    atm.run();
    
    }
}