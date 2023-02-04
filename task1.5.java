interface Employee {
    double calculateSalary();
}

class ContractWorker implements Employee {
    private double amountOfProducts;
    private double salary;
    
    public ContractWorker(double amountOfProducts, double salary) {
        this.amountOfProducts = amountOfProducts;
        this.salary = salary;
    }
    public double calculateSalary() {
        return this.amountOfProducts * this.salary;
    }
}

class BasicSalarywithbonus implements Employee {
    private double basicSalary;


    public double validateBonus(double bonus) {
        if (bonus > 2) {
            return basicSalary + (0.2 * basicSalary);
        } else {
            return basicSalary;
        }
    }

    public BasicSalarywithbonus(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public double calculateSalary() {
        return this.validateBonus(3);
    }
}

abstract class SalaryPayout {
    private Employee employee;
    public SalaryPayout(Employee employee) {
        this.employee = employee;
    }
    protected abstract void payout();
    public void processPayout() {
        System.out.println("payout for worker: " + this.employee.calculateSalary() + "PLN");
        this.payout();
        System.out.println("Payout has been completed");
    }
}
class SalaryPayoutProcessor extends SalaryPayout {
    public SalaryPayoutProcessor(Employee employee) {
        super(employee);
    }
    protected void payout() {
        System.out.println("Sending money to employee");
    }
}

class App {
    public static void main(String[] args) {
        // ContractWorker contractWorker = new ContractWorker(5, 1200);
        BasicSalarywithbonus basicWorker = new BasicSalarywithbonus(2000);
        SalaryPayoutProcessor payProcessor = new SalaryPayoutProcessor(basicWorker);
        payProcessor.processPayout();
    }
}