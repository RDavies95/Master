import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 26/07/2017.
 */
public class Grid {

    public int numberOfRows = 12;
    public int numberOfColumns = 12;

    String[][] gridMap = new String[numberOfRows][numberOfColumns];

    HashMap<String, String> map = new HashMap<String, String>();


    public void fillGrid()
    {
        for(int i = 0; i < numberOfRows; i++)
        {
            for(int j = 0; j < numberOfColumns; j++)
            {
                map.put(convertToCord(j,i), " G ");
            }
            System.out.println();
        }
    }

    public String convertToCord(int x, int y)
    {
        String h = Integer.toString(x);
        String k = Integer.toString(y);
        String input = h + "," + k;
        return input;
    }


    public void outputGrid()
    {
        for(int i = 0; i < numberOfRows; i++)
    {
        for(int j = 0; j < numberOfColumns; j++)
        {
                System.out.print(map.get(convertToCord(j,i)));

        }
        System.out.println();
    }
}


    public void placePatrolBoat(String location, String orientation)
    {
        map.put(location, " S ");
        String s ="";
        if(orientation.equals("n"))
        {
            Character c = location.charAt(0);
            Character c1 = location.charAt(2);

            String ty = c.toString();
            String yt = c1.toString();

            int i = Integer.parseInt(ty);
            int j = Integer.parseInt(yt);
            int newj = j - 1;

            String newlocal = Integer.toString(newj) + "," + Integer.toString(i);
            map.put(newlocal, " S ");
        }
        else if(orientation.equals("e"))
        {

        }
        else if(orientation.equals("s"))
        {

        }
        else if(orientation.equals("w"))
        {

        }

        outputGrid();
    }


}
