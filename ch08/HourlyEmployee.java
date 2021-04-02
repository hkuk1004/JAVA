package ch08;
public class HourlyEmployee extends Employee{
	private int hoursWorked;
	private int moneyPerHour;
	public HourlyEmployee(int hoursWorked, int moneyPerHour) {
		this.hoursWorked = hoursWorked; this.moneyPerHour = moneyPerHour;		
	}
	public int getHoursWorked() {	return hoursWorked;	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getMoneyPerHour() {	return moneyPerHour;	}
	public void setMoneyPerHour(int moneyPerHour) {
		this.moneyPerHour = moneyPerHour;
	}
	@Override
	int computePay() {
		return hoursWorked * moneyPerHour;
	}
}