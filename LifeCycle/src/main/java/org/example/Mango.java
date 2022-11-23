package org.example;

public class Mango {
    private double prize;

    public void setPrize(double prize) {
       System.out.println("Setting prize");
        this.prize = prize;
    }

    public Mango() {
    }

    @Override
    public String toString() {
        return "Mango{" +
                "prize=" + prize +
                '}';
    }
    //Lifecycle methods

    //initialization method
    public void hi(){
        System.out.println("Inside init method : hi,how are you....");
    }

    //destroy method
    public void bye(){
        System.out.println("Inside destroy method : bye bye");
    }
}
