/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment4;

/**
 *
 * @author DELL
 */
public class TeachingAssistant implements Staff{
    private double salary;
    private int yearsofwork;

    @Override
    public double getSalary() {
        return salary;
                
    }

    @Override
    public int getYearOfWork() {
        return yearsofwork;

    }

    @Override
    public void setSalary(double salary) {
       this.salary = salary;
    }

    @Override
    public void setYearsOfWork(int yearsofwork) {
       this.yearsofwork = yearsofwork;
    }
    
}
