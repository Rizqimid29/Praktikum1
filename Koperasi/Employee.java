package Koperasi;

import java.text.DecimalFormat;

public class Employee implements IPayable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee() {

    }
    public Employee(String name, int registrationNumber, int salaryPerMonth, Invoice[] invoices) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }
    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public int getRegistrationNumber() {
        return registrationNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSalaryPerMonth(int salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }
    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }
    public void setInvoices(Invoice[] invoices) {
        this.invoices = invoices;
    }
    public Invoice[] getInvoices() {
        return invoices;
    }
    public double getPayableAmount() {
        double total = 0.0;
        if (invoices != null) {
            for (Invoice invoice : invoices) {
                total += invoice.getPayableAmount();
            }
        }
        return total;
    }
    public double gajiSisa() {
        return salaryPerMonth - getPayableAmount();
    }
    public String toString() {
        DecimalFormat gaji = new DecimalFormat("#,###");
        String formattedGaji = gaji.format(getSalaryPerMonth());
        return "Nama\t\t\t: " + getName() + "\nRegistration Num\t: " + getRegistrationNumber() + "\nGaji Awal\t\t: Rp " + formattedGaji;
    }
}
