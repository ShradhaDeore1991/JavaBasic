package oops;

import oops.interface2.Vegitables;

interface Fruit{
    int hasAPeel(int x);
}

interface Vegetable{
    int hasARoot(int x,int y);
}
class Tomato implements Fruit, Vegetable {
    @Override
    public int hasAPeel(int x) {
        return x*x;
    }

    @Override
    public int hasARoot(int x, int y) {
        return x*y;
    }
}
public class Solution {
    public static void main(String[] args) {
        Tomato t = new Tomato();
        System.out.println(t.hasAPeel(6));
        System.out.println(t.hasARoot(6,8));
    }
}
