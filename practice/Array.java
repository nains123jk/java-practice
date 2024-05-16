package practice;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Endeavour");
        cars.add("Fortuner");
        cars.add("XUV700");
        cars.add("Thar");
        cars.add("Scorpio");
        System.out.println(cars.get(0));
        System.out.println(cars.set(1,"RollsRoyal"));
    }

}