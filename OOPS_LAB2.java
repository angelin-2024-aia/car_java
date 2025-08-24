import java.util.Scanner;

class Sport {
    String sport;

    void sportName(String sport) {
        System.out.println("Sport: " + sport);
    }
}

class Player extends Sport {
    String player;

    void playerInfo(String player) {
        System.out.println("Player: " + player);
    }
}

public class OOPS_LAB2 {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- Single Inheritance ----");
        System.out.print("Enter Sport Name: ");
        String sport = sc.nextLine();

        System.out.print("Enter Player Name: ");
        String player = sc.nextLine();

        Player p = new Player();
        p.sportName(sport);
        p.playerInfo(player);

        sc.close();
    }
}
