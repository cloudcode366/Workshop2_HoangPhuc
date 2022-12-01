public class Triangle {
    private double width=0.0;
    private double height = 0.0;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Triangle() {
    }

    @Override
    public String toString() {
        return "Triangle width:"+getWidth()+" height:"+getHeight();
    }
}
