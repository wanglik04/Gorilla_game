public class Buildings {
    private double height;
    private double width;
    private int color;  // color id

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setColour(int color) {
        this.color = color;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public int getColor() {
        return this.color;
    }

    Buildings(double height, double width, int color){
        this.height = height;
        this.width = width;
        this.color = color;
    }
}
