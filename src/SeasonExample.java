import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

import static java.lang.System.out;

public class SeasonExample {

    public enum Season {
        AUTUMN, SPRING, SUMMER, WINTER
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select any month");
        String month = br.readLine();
        Season season;
        switch (month.toLowerCase(Locale.ROOT)) {
            case "december":
            case "january":
            case "february":
                season = Season.WINTER;
                System.out.println(season);
                break;
            case "march":
            case "april":
            case "may":
                season = Season.SPRING;
                System.out.println(season);
                break;
            case "june":
            case "july":
            case "august":
                season = Season.SUMMER;
                System.out.println(season);
                break;
            case "September":
            case "October":
            case "November":
                season = Season.AUTUMN;
                System.out.println(season);
                break;
            default:
                System.out.println("No such the month");
        }
    }
}