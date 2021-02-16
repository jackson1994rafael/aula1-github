/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import entities.num.WorkerLevel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Jackson Antunes
 */
public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;
    
    private Department departamento;
    private List<HourContract> contract = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, double baseSalary,Department departamento) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departamento = departamento;
    }

    public Department getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Department departamento) {
        this.departamento = departamento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    public void addContract(HourContract contract){
        this.contract.add(contract);
    }
    public void removeContract(HourContract contract){
        this.contract.remove(contract);
    }
    public void incame(int year,int month){
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contract) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
        
    }
}
