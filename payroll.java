package payroll;

public class payroll {
private String name;
private int idNumber ;
private double payRate, hoursWorkexd;
public payroll(String n, int i) {
	super();
	this.name = n;
	this.idNumber = i;
}
public String getName() {
	return name;
}
public void setName(String n) {
	this.name = n;
}
public int getIdNumber() {
	return idNumber;
}
public void setIdNumber(int i) {
	this.idNumber = i;
}
public double getPayRate() {
	return payRate;
}
public void setPayRate(double p) {
	this.payRate = p;
}
public double getHoursWorkexd() {
	return hoursWorkexd;
}
public void setHoursWorkexd(double h) {
	this.hoursWorkexd = h;
}


}
