// Duck.java
// Cooper Cross
// 2/25/2020

package chapter03practice;

import java.awt.*;

public class Duck {
    // data field
    private String name;
    private Color duckColor;
    private int size;

    // constructor
    public Duck(String nam, Color col, int siz) {
	name = nam;
	duckColor = col;
	size = siz;
    }

    // getters
    public String getName() {
	return name;
    }

    public Color getDuckColor() {
	return duckColor;
    }

    public int getSize() {
	return size;
    }

    // setters
    public void setName(String nam) {
	name = nam;

    }

    public void setDuckColor(Color duckColor) {
	this.duckColor = duckColor;

    }

    public void setName(int siz) {
	size = siz;

    }

}
