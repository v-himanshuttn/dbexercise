package com.example.springbootjpa2.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Salary {

//    Component Mapping

    @Column(name = "bounussalary")
    private Double bonusSalary;

    @Column(name = "taxamount")
    private Double taxAmount;

    @Column(name = "specialallowancesalary")
    private Double specialAllowanceSalary;

    public Double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(Double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Double getSpecialAllowanceSalary() {
        return specialAllowanceSalary;
    }

    public void setSpecialAllowanceSalary(Double specialAllowanceSalary) {
        this.specialAllowanceSalary = specialAllowanceSalary;
    }
}
