/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.Date;

/**
 *
 * @author Jackson Antunes
 */
public class HourContract {
    private Date data;
    private double valueHour;
    private int hours;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValueHour() {
        return valueHour;
    }

    public void setValueHour(double valueHour) {
        this.valueHour = valueHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public void totalValue(){
        return valueHour * hours;
    }
}
