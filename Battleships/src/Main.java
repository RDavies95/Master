import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Administrator on 26/07/2017.
 */
public class Main {

    public static void main(String[] args){



        Mechanics m = new Mechanics();


        Grid g2 = new Grid();
        Scanner sc = new Scanner(System.in);
        Grid g1 = new Grid();
        g1.fillGrid();
        g2.fillGrid();
        System.out.println("PLAYER 1 MAP");
        g1.outputGrid();
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("PLAYER 2 MAP");
        g2.outputGrid();
        System.out.println("\n");
        System.out.println("PLAYER 1 PLACE PATROL BOAT - LENGTH 2 - STATE START POSITION ");
        System.out.println("\n");
        //String local = sc.nextLine();
        //System.out.println(local);
        //String orientation = sc.nextLine();
       // orientation = orientation.toLowerCase();
        g1.placePatrolBoat("3,4", "n");


    }
}
