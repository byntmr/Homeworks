package hw3;

import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {

        String[][] schedule = new String[7][2];

        Scanner s=new Scanner(System.in);

        schedule[0][0] = "Sunday";
        schedule[0][1] = "\nFall into existential spiral.\n";

        schedule[1][0] = "Monday";
        schedule[1][1] = "\nGo to work;" + "\nGo to courses.\n";

        schedule[2][0] = "Tuesday";
        schedule[2][1] = "\nGo to work;" + "\nFeed the cat.\n";

        schedule[3][0] = "Wednesday";
        schedule[3][1] = "\nGo to work;" + "\nGo to courses;" + "\nBuy cat food.\n";

        schedule[4][0] = "Thursday";
        schedule[4][1] = "\nGo to work;" + "\nHave a serious conversation with the cat about the increase in cat food price.\n";

        schedule[5][0] = "Friday";
        schedule[5][1] = "\nGo to work;" + "\nGo to courses.\n";

        schedule[6][0] = "Saturday";
        schedule[6][1] = "\nGo to work;" + "\nFind out that cat couldn't live anymore understanding how burdenous his life is " +
                "\nfor others and shot himself right into the hypothalamus;" + "\nClean up the mess;" + "\nFind a new cat.\n";


        while(true) {
            System.out.println("Please, input the day of the week:\n");
            String str = s.nextLine().strip();

            if(schedule[0][0].compareToIgnoreCase(str) == 0) {
                System.out.printf("Your tasks for %s:\n %s \n", schedule[0][0], schedule[0][1]);
                continue;
            }
            if (schedule[1][0].compareToIgnoreCase(str) == 0) {
                System.out.printf("Your tasks for %s:\n %s \n", schedule[1][0], schedule[1][1]);
                continue;
            }
            if (schedule[2][0].compareToIgnoreCase(str) == 0) {
                System.out.printf("Your tasks for %s:\n %s \n", schedule[2][0], schedule[2][1]);
                continue;
            }
            if (schedule[3][0].compareToIgnoreCase(str) == 0){
                System.out.printf("Your tasks for %s:\n %s \n", schedule[3][0], schedule[3][1]);
                continue;
            }
            if(schedule[4][0].compareToIgnoreCase(str) == 0) {
                System.out.printf("Your tasks for %s:\n %s \n", schedule[4][0], schedule[4][1]);
                continue;
            }
            if(schedule[5][0].compareToIgnoreCase(str) == 0) {
                System.out.printf("Your tasks for %s:\n %s \n", schedule[5][0], schedule[5][1]);
                continue;
            }
            if(schedule[6][0].compareToIgnoreCase(str) == 0) {
                System.out.printf("Your tasks for %s: %s \n", schedule[6][0], schedule[6][1]);
                continue;
            }
            if("exit".compareToIgnoreCase(str) == 0) break;

            else System.out.println("Sorry, I don't understand you, please try again.\n");

        }
    }
}