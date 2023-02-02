abstract class BankingTransactions {

    abstract protected void bankWithdrawalApproveCheck();
    abstract protected void accountBallanceCheck();
    abstract protected void bankWithdrawalApprovedInfo();

    private void cardInput() {
        System.out.println("Please enter your card");
    }
    private void pinCode() {
        System.out.println("Enter your 4-digits PIN number ****");
    }
    private void withdrawalAmount() {
        System.out.println("Enter withdrawal amount");
    }
    private void withdrawingProcess() {
        System.out.println("Withdrawing cash");
    }
    private void endingQuote() {
        System.out.println("Thank you for choosing our Bank");
    }

    public void startAtmProgram () {
        this.cardInput();
        this.pinCode();
        this.withdrawalAmount();
        this.bankWithdrawalApproveCheck();
        this.accountBallanceCheck();
        this.bankWithdrawalApprovedInfo();
        this.withdrawingProcess();
        this.endingQuote();
    }
}


class Transactions extends BankingTransactions {

    protected void bankWithdrawalApproveCheck() {
        System.out.println("Receiving withdrawal request");
    }
    protected void accountBallanceCheck() {
        System.out.println("Checking account ballance");
    }
    protected void bankWithdrawalApprovedInfo() {
        System.out.println("Confirmation of approved withdrawal request");
    }
}

class Application {
    public static void main(String[] args) {
        Transactions transactions = new Transactions();
        transactions.startAtmProgram();
    }
}
