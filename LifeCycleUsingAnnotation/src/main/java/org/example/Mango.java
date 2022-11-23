package org.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Mango {
    private double prize;

    public void setPrize(double prize) {
      //  System.out.println("Setting prize");
        this.prize = prize;
    }

    public Mango() {
    }

    public Mango(double prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Mango{" +
                "prize=" + prize +
                '}';
    }
    @PostConstruct
    public void start(){
        System.out.println("Starting method");
    }
    @PreDestroy
    public void end(){
        System.out.println("Ending method");
    }
}

