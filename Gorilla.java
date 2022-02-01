public class Gorilla {
    private double position_x;
    private double position_y;
    private int health_point;

    public void setPosition_x(double position_x) {
        this.position_x = position_x;
    }

    public void setPosition_y(double position_y) {
        this.position_y = position_y;
    }

    public void setHealth_point(int health_point) {
        this.health_point = health_point;
    }

    public double getPosition_x() {
        return position_x;
    }

    public double getPosition_y() {
        return position_y;
    }

    public int getHealth_point() {
        return health_point;
    }

    //specify location
    Gorilla(double x, double y){
        this.position_x = x;
        this.position_y = y;
        this.health_point = 100;
    }

    // Overload
    //default location
    Gorilla(){
        this.position_x = 10;
        this.position_y = 10;
        this.health_point = 100;
    }
}
