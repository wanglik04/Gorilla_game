import java.sql.SQLException;

public class Game extends Banana{

    private final User user;
    private final Gorilla user_gorilla;
    private final Gorilla enemy_gorilla;
    private final Maps map;


    Game(User user, Maps map){
        this.user = user;
        this.map = map;
        this.user_gorilla = new Gorilla(1,2);
        this.enemy_gorilla = new Gorilla();
    }

    private static void saveRecord(User user){
        user.setScore(100);
    }

    public static void main(String[] args){

        try {
            int id = Integer.parseInt(args[0]);
            //login
            User user = new User(id);
            //Select map
            Maps map = new Maps();
            //start game
            Game game = new Game(user,map);
            //generate map
            Maps.generateMap(game.map);
            //playing
            game.throwBanana(20.5,game.user_gorilla,game.enemy_gorilla,game);
            //save your score after played
            saveRecord(game.user);


        } catch (NumberFormatException | SQLException e) {
            e.printStackTrace();
        }

    }

}
