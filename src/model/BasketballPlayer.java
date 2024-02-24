package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;


public class BasketballPlayer {

    private int jersey;

    private String name;

    private int points;

    private String team;

    private static ObservableList<BasketballPlayer> allPlayers = FXCollections.observableArrayList();

    public BasketballPlayer(int jersey, String name, int points, String team) {
        this.jersey = jersey;
        this.name = name;
        this.points = points;
        this.team = team;
    }

    static {
        init();
    }

    private static void init(){
        if (allPlayers.size()== 0){





            allPlayers.add(new BasketballPlayer(11,"Yao Ming", 1234, "Rockets"));
            allPlayers.add(new BasketballPlayer(22,"Clyde Drexler", 1000, "Rockets"));
            allPlayers.add(new BasketballPlayer(34,"Hakeem Olajuwon", 2, "Rockets"));
            allPlayers.add(new BasketballPlayer(45,"Rudy Tomjanovich", 450, "Rockets"));

            allPlayers.add(new BasketballPlayer(8,"Kobe Bryant", 867, "Lakers"));
            allPlayers.add(new BasketballPlayer(13,"Wilt Chamberlin", 1541, "Lakers"));
            allPlayers.add(new BasketballPlayer(34,"Shaquille O'Neal", 45, "Lakers"));
            allPlayers.add(new BasketballPlayer(32,"Magic Johnson", 9786, "Lakers"));


            allPlayers.add(new BasketballPlayer(33,"Patrick Ewing", 1236, "Knicks"));
            allPlayers.add(new BasketballPlayer(34,"Charles Oakley", 7896, "Knicks"));
            allPlayers.add(new BasketballPlayer(3,"John Starks", 836, "Knicks"));
            allPlayers.add(new BasketballPlayer(15,"Dick Mcguire", 71, "Knicks"));

            allPlayers.add(new BasketballPlayer(23,"Michael Jordan", 1234560, "Bulls"));
            allPlayers.add(new BasketballPlayer(91,"Denis Rodman", 382, "Bulls"));
            allPlayers.add(new BasketballPlayer(33,"Scotty Pippin", 12, "Bulls"));
            allPlayers.add(new BasketballPlayer(4,"Jerry Sloan", 829, "Bulls"));





        }
    }

    public static ObservableList<BasketballPlayer> getAllPlayers() {
        return allPlayers;
    }

    public static void setAllPlayers(ObservableList<BasketballPlayer> allPlayers) {
        BasketballPlayer.allPlayers = allPlayers;
    }

    public int getJersey() {
        return jersey;
    }

    public void setJersey(int jersey) {
        this.jersey = jersey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
