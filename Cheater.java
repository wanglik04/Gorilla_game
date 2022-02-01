import java.sql.SQLException;

public class Cheater extends Banana {
    private final User user;
    private final Gorilla user_gorilla;
    private final Gorilla enemy_gorilla;
    private final Maps map;

    public Cheater(User user, Maps map) {
        this.user = user;
        this.user_gorilla = new Gorilla(5,5);
        this.enemy_gorilla = new Gorilla();
        this.map = map;
    }

    private static void saveRecord(User user, int score){
        user.setScore(score);
    }

    // In cheater mode, user will always make a hit.
    @Override
    public void throwBanana(double angle, Gorilla user_gorilla, Gorilla enemy_gorilla, Banana banana){
        user_gorilla.setHealth_point(user_gorilla.getHealth_point()-1);
        if (enemy_gorilla.getHealth_point()==0){
            System.out.println("Winner winner, chicken dinner!");
        }else {
            if(super.hit(angle,user_gorilla,enemy_gorilla,banana)){
                user_gorilla.setHealth_point(user_gorilla.getHealth_point()-1);
            }
        }
    }

    public static void main(String[] args){

        try {
            int id = Integer.parseInt(args[0]);
            //login
            User user = new User(id);
            //Select map
            Maps map = new Maps();
            //start game
            Cheater cheater = new Cheater(user,map);
            //generate map
            Maps.generateMap(cheater.map);
            //playing
            cheater.throwBanana(20.5,cheater.user_gorilla,cheater.enemy_gorilla,cheater);
            //save your score after played
            int greedy_score = 300000;
            saveRecord(cheater.user,greedy_score);


        } catch (NumberFormatException | SQLException e) {
            e.printStackTrace();
        }

    }
}
