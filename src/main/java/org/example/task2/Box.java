package org.example.task2;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setField(length, width, height);
    }

    public double getVolume() {
        return length * width * height;
    }

    public double getLateralSurfaceArea() {
        return 2 * length * height + 2 * width * height;
    }

    public double getSurfaceArea() {
        return 2 * length * width + 2 * height * length + 2 * width * height;
    }
    private void setField(double l, double w, double h) {
        if(w<=0|| l<=0||h<=0)
        {
            System.out.println("Invalid field");
        }
        else {
            length = l;
            width = w;
            height = h;
        }
    }
}