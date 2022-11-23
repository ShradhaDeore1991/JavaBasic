package org.example;

import java.util.List;

public class Subject {
    private int phy;
    private int chem;
    private int math;

    public Subject() {
    }

    public Subject (int phy, int chem, int math) {
        this.phy = phy;
        this.chem = chem;
        this.math = math;
    }

    public void setPhy(int phy) {
        this.phy = phy;
    }

    public void setChem(int chem) {
        this.chem = chem;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "phy=" + phy +
                ", chem=" + chem +
                ", math=" + math +
                '}';
    }
}
