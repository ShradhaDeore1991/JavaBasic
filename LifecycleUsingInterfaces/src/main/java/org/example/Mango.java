package org.example;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;


public class Mango implements InitializingBean,DisposableBean{
    private double prize;

    public Mango() {
    }

    public Mango(double prize) {
        this.prize = prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Mango{" +
                "prize=" + prize +
                '}';
    }

    @Override
    public void afterPropertiesSet() {
        //init
        System.out.println("Taking Mango :: init");
    }

    @Override
    public void destroy() {
        //destroy
        System.out.println("Going to put Mango inside the box :: destroy");
    }
}
