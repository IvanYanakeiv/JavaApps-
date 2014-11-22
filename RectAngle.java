/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan
 */
public class RectAngle {

    private double width;
    private double length;

    public RectAngle() {
        setLength(10);
        setWidth(10);
    }

    public RectAngle(double width, double length) {
        setLength(length);
        setWidth(width);

    }
    
    public RectAngle(RectAngle another){
        setLength(another.getLenght());
        setWidth(another.getWidth());
    }

    public void setWidth(double dWidth) {
        if (dWidth > 0) {
            width = dWidth;
        }

    }

    public void setLength(double dLength) {
        if (dLength > 0) {
            length = dLength;
        }

    }

    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return length;

    }

    public double calculateArea() {
        double area = width * length;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = (width * 2) + (length * 2);
        return perimeter;
    }
}
