public class Banana {
    private double height;
    private double width;
    private double weight;
    private int color;
    private int speed;

    public void setHeight(double height){
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setColor(int color){
        this.color = color;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getWeight() {
        return weight;
    }

    public int getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    //default
    Banana(){
        this.height = 1;
        this.width = 1;
        this.weight = 1;
        this.color = 1001; //Suppose it represents yellow
        this.speed = 10;
    }

    public void throwBanana(double angle, Gorilla user_gorilla, Gorilla enemy_gorilla, Banana banana){
        if (hit(angle,user_gorilla,enemy_gorilla,banana)){
            enemy_gorilla.setHealth_point(enemy_gorilla.getHealth_point()-1);
            if (enemy_gorilla.getHealth_point()==0){
                System.out.println("Winner winner, chicken dinner!");
            }
        }
        // AI hit
        if (hit(angle,enemy_gorilla,user_gorilla,banana)){
            user_gorilla.setHealth_point(user_gorilla.getHealth_point()-1);
            if (user_gorilla.getHealth_point()==0){
                System.out.println("you lose!");
            }
        }
    }


    public Boolean hit(double angle, Gorilla user_gorilla,
                       Gorilla enemy_gorilla, Banana banana){
        // Calculate
        // Return True if hit enemy gorilla, False if missed
        return Boolean.TRUE;
    }

}
