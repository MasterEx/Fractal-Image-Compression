package lib.core;

import java.io.Serializable;

/**
 * A point representing a location in (x, y) coordinate space, specified in short 
 * precision.
 * 
 * @see http://download.oracle.com/javase/1.4.2/docs/api/java/awt/Point.html
 */
public class Point implements Serializable{
    public short x;
    public short y;
    
    public Point() {
        x = 0;
        y = 0;
    }
    
    public Point(int x,int y) {
        this.x = (short) x;
        this.y = (short) y;
    }
    
    public Point(java.awt.Point p) {
        this.x = (short) p.x;
        this.y = (short) p.y;
    }
    
    public Point getLocation() {
        return this;
    }
    
    public double getX() {
        return (double)x;
    }
    
    public double getY() {
        return (double)y;
    }
    
    public void setLocation(java.awt.Point p) {
        this.x = (short) p.x;
        this.y = (short) p.y;
    }
    
    public void setLocation(int x,int y) {
        this.x = (short) x;
        this.y = (short) y;
    }
    
    public void setLocation(double x,double y) {
        this.x = (short) x;
        this.y = (short) y;
    }
    
    @Override
    public String toString() {
        return "("+x+","+y+")";
    }
}
