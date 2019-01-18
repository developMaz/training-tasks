package test;

interface Employee {
 
	double calculateSalary();
 
}
 
class FixedSalaryEmployee implements Employee {
 
	private double salary;
 
	public FixedSalaryEmployee(double salary) {
		this.salary = salary;
	}
 
	public double calculateSalary() {
		return this.salary;
	}
 
}
 
class HourlySalaryEmployee implements Employee {
 
	private double hours;
	private double hourlyPay;
 
	public HourlySalaryEmployee(double hours, double hourlyPay) {
		this.hours = hours;
		this.hourlyPay = hourlyPay;
	}
 
	public double calculateSalary() {
		return this.hourlyPay * this.hours;
	}
 
}

class ByItemSalaryEmployee implements Employee{
    
    private int items;
    private double payByItem;
    
    public ByItemSalaryEmployee(int items, double payByItem){
        this.items = items;
        this.payByItem = payByItem;
    }
    
    public double calculateSalary() {
        return (double)this.items * this.payByItem;
    }
}

class FixedSalaryWithBonus implements Employee {
    
    private double salary;
    private double bonus;
    
    public FixedSalaryWithBonus(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }
    
    public double calculateSalary() {
        return this.salary + (this.salary * this.bonus);
    }
}
 
abstract class SalaryPayout {
 
	private Employee employee;
 
	public SalaryPayout(Employee employee) {
		this.employee = employee;
	}
 
	protected abstract void payout();
 
	public void processPayout() {
		System.out.println("Creating payout for: " + this.employee.calculateSalary() + " PLN");
		this.payout();
		System.out.println("Payout has been completed!");
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

class App4 {
    public static void main (String[] args){
        
        FixedSalaryEmployee employee1 = new FixedSalaryEmployee(2000);
        HourlySalaryEmployee employee2 = new HourlySalaryEmployee(40, 19);
        ByItemSalaryEmployee employee3 = new ByItemSalaryEmployee(5, 10);
        FixedSalaryWithBonus employee4 = new FixedSalaryWithBonus(2000, 0.2);

        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee4);
        processor.processPayout();
    
    }
}
