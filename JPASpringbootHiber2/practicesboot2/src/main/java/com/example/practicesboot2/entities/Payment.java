package com.example.practicesboot2.entities;

import javax.persistence.*;


@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name="pmode",discriminatorType = DiscriminatorType.STRING)

@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Payment {

    @Id
    private  int id;
    private double amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
