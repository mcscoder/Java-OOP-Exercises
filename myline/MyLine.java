package myline;

import mypoint.*;
// Done
public class MyLine {    
    private MyPoint begin;
    private MyPoint end;

    public MyLine (MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end   = end;
    }
    public MyLine (int beginX, int beginY, int endX, int endY) {
        begin = new MyPoint(beginX, beginY);
        end   = new MyPoint(endX, endY);
    }

    public String toString() {
        return String.format("MyLine[begin=(%s,%s),end=(%s,%s)]", 
            getBeginX(), getBeginY(), getEndX(), getEndY());
    }

    // getter
    public MyPoint getBegin() {
        return begin;
    }
    public int getBeginX() {
        return begin.getX();
    }
    public int getBeginY() {
        return begin.getY();
    }

    public MyPoint getEnd() {
        return end;
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }

    public int[] getBeginXY() {
        return new int[] {begin.getX(), begin.getY()};
    }
    public int[] getEndXY() {
        return new int[] {end.getX(), end.getY()};
    }
    
    public double getLength() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double getGradient() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.atan2(yDiff, xDiff);
    }
    
    // setter
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }
    public void setBeginX(int x) {
        begin.setX(x);
    }
    public void setBeginY(int y) {
        begin.setY(y);
    }
    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public void setEndX(int x) {
        end.setX(x);
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }
}