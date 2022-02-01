import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    private String name;
    private int id;
    private int score;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    User(int id) throws SQLException {
        this.id = id;
        this.score = getScoreById(id);
        this.name = getNameById(id);
    }

    public int getScoreById(int id) throws SQLException {
        ResultSet result = DriverManager.getConnection(name).createStatement().executeQuery(
                "SELECT id,name FROM users");
        return result.getInt("score");
    }

    public String getNameById(int id) throws SQLException {
        ResultSet result = DriverManager.getConnection(name).createStatement().executeQuery(
                "SELECT id,name FROM users");
        return result.getString("name");
    }


}
