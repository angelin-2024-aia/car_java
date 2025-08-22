class Sport {
    void sportName() {
        System.out.println("Sport: Cricket");
    }
}

class Player extends Sport {
    void playerInfo() {
        System.out.println("Player: Virat Kohli");
    }
}

public class OOPS_LAB2 {
    public static void main(String[] args) {
        System.out.println("---- Single Inheritance ----");
        Player p = new Player();
        p.sportName();
        p.playerInfo(); //
    }
}
