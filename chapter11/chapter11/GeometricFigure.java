package chapter11;

public abstract class GeometricFigure {
    protected int height;
    protected int width;
    protected String figType;
    protected int area;

    public int getHeight() {
	return height;
    }

    public void setHeight(int height) {
	this.height = height;
    }

    public int getWidth() {
	return width;
    }

    public void setWidth(int width) {
	this.width = width;
    }

    public String getFigType() {
	return figType;
    }

    public void setFigType(String figType) {
	this.figType = figType;
    }

    public int getArea() {
	return area;
    }

    public abstract void setArea();
}
