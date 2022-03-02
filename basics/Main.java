import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //code from the lab that we want to print it from pluralize mothod
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(1);
        clock();
    }

    public static String pluralize(String word, int number){
        //two condition inside if by using || that main "or" like in lab requirement want.
        if (number == 0 || number > 1) {
            //if statement inside method not void must have return after condition and return after else.
            return word + "s";
        } else {
            return word;
        }
    }

    //the method has the n parameter to get a value from argument inside method call.
    public static void flipNHeads(int n){
        //this two variable has an initial count for number of flip coin and itr for number of iteration that happens complete the condition in while loop.
        double count = 0;
        int itr = 0;
        //while loop here compare n variable (that have a number of flip that we want to get flip of head) with count variable that will increase until it have the same value of n.
        while (n != count) {
            double flip = Math.random();
            itr ++;
            if (flip > 0.5) {
                System.out.println("heads");
                count ++;
            } else {
                System.out.println("tails");
                count = 0;
            }
        }
        System.out.println("It took " + itr + " flips to" + " flip " + n + " heads in a row.");
    }

    public static void clock() {
        LocalDateTime now = LocalDateTime.now();
        long lastSec = 0;
        while(true){
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            
            //From https://stackoverflow.com/questions/13121885/run-code-every-second-by-using-system-currenttimemillis.
            long sec = System.currentTimeMillis() / 1000;
            if (sec != lastSec) {
                System.out.println(time);
                lastSec = sec;
            }
        }
//        LocalDateTime now = LocalDateTime.now();
//        while (true) {
//                String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
//                int pastSecond = now.getSecond() -1;
//                    System.out.println(time);
//        }

    }
}

