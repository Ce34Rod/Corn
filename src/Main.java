import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Seed firstSeed = new Seed("corn seed", false, false, false, 0);
        System.out.println(firstSeed.getStatus(firstSeed));
        player.getInventory().add(firstSeed);
        System.out.println(player.toString());
        LaunchPage launchPage = new LaunchPage();


    }
}