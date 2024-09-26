import java.util.Random;
public class MontyHall {
    public static void main(String[] args){
        int times = Integer.parseInt(args[0]);

        int noSwitchWins = 0;
        int SwitchWins = 0;

        int door;
        int prize;
        int openDoor;
        Random r = new Random();
        door = r.nextInt(3);
        prize = r.nextInt(3);
        openDoor = r.nextInt(3);

        while(openDoor == door){
            openDoor = r.nextInt(3);
        }

        for (int i = 1; i <= times; i++) {
            if (door == prize) {
                noSwitchWins++;
            }
        }
        for (int ii = 1; ii <= times; ii++){
            if (door == 0 && openDoor == 1){
                door = 2;
            }else if (door == 1 && openDoor == 0){
                door = 2;
            }else if (door == 2 && openDoor == 0){
                door = 1;
            }else if (door == 0 && openDoor == 2){
                door = 1;
            }else if (door == 1 && openDoor == 2){
                door = 0;
            }
            if(door == prize){
                SwitchWins++;
            }
        }
        System.out.println("Wins with changing: " + SwitchWins);
        System.out.println("Win percentage with change: " + SwitchWins/times*100 + "%");
        System.out.println("Wins without changing: " + noSwitchWins);
        System.out.println("Win percentage without change: " + noSwitchWins/times*100 + "%");
    }
}
