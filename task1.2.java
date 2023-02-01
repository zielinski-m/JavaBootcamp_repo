interface Atm {

    void deposit();
    void withdrawal();
    default void bankSignalConnection(String status){
        System.out.println("Connection status: " + status);
    }
    static String atmClosed() {
        return "Sorry, Out of service";
    }
}

class ATMImpl implements Atm {

    public void deposit() {
        System.out.println("Select a deposit amount ");
    }
    public void withdrawal() {
        System.out.println("Select a payout amount");
    }
}

class Application {
    public static void main(String[] args) {
        ATMImpl atm = new ATMImpl();
        atm.deposit();
        atm.withdrawal();
        atm.bankSignalConnection("Average");
        System.out.println(Atm.atmClosed());  
        };
}