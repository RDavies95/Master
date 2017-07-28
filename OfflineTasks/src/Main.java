/**
 * Created by Administrator on 27/07/2017.
 */
public class Main {

    public static void main(String[] args){

     Tasks t = new Tasks();


    //Task 1
     String input = "rhys";
     String output = t.Task1(input);
     System.out.println(output);

     //Task 2
      input = "breadjambread";
      output =  t.Task2(input);
      System.out.println(output);

      //Task 3
       boolean qw;
      int a = 1;
      int b = 2;
      int c = 3;
     qw =  t.Task3(a,b,c);
      System.out.println(qw);

        //Task 4
        input = "Hello";
        int mn = 2;
        output =  t.Task4(input, mn);
        System.out.println(output);

        //task 5
        boolean wq;
        input = "Helly";
        wq =  t.Task5(input);
        System.out.println(wq);

        //task 6
        input = "yyzzza";
        output =  t.Task6(input);
        System.out.println(output);

        //Task 7
        int fib = 5;
        int outputnum;
        outputnum =  t.Task7(fib);
        System.out.println(outputnum);



    }

}
