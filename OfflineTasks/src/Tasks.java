import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 27/07/2017.
 */
public class Tasks {

    public String Task1(String input)
    {

        String output = "";
        for(int i = 0; i < input.length(); i++)
        {
            Character c = input.charAt(i);
            String s = c.toString();
            String word = s + s;
            output = output + word;
        }


        return output;
    }

    public String Task2(String input)
    {
        String[] outputP = input.split(Pattern.quote("bread"));
        String output = outputP[1];

        return output;
    }

    public boolean Task3(int a, int b, int c)
    {
        boolean qw = false;

        int ans = b - a;
        int ans2 = c - b;
        String s = Integer.toString(ans);
        String s2 = Integer.toString(ans2);

        if(s.equals(s2))
        {
            qw = true;
        }
        return qw;
    }

    public String Task4(String input, int num)
    {
       String firsthalf = input.substring(0, num);
      String secondhalf = input.substring(input.length() - num, input.length());
        String output = firsthalf + secondhalf;
        return output;
    }

    public boolean Task5(String input)
    {
        boolean qw = false;

        String secondhalf = input.substring(input.length() - 2, input.length());
        String target = "ly";

        if(secondhalf.equals(target))
        {
            qw = true;
        }
        return qw;
    }

    public String Task6(String input)
    {
        ArrayList<String> ar = new ArrayList<String>();
       for(int i = 0; i < input.length(); i++)
       {
           Character c = input.charAt(i);
           String s = c.toString();


           if(ar.contains(s)){

           }
           else
           {
               ar.add(s);
           }
       }

       String output = "";
        for(int u = 0; u < ar.size(); u++)
        {
            output = output + ar.get(u);
        }

        return output;
    }

    public int Task7(int input)
    {
        int prevalue = 0;
        int curvalue = 0;
        int nextvalue = 0;
        for(int i = 1; i < input; i ++)
        {
            if(curvalue == 0)
            curvalue = curvalue + i;
            else
            {
                nextvalue = curvalue + prevalue;
            }
            prevalue = curvalue;
            curvalue = nextvalue;

            //make next value the current value
            //make previous value the current value
            //return value

        }






        return input;
    }






}
