
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jotas
 */
public class UserInterface {

    private Scanner sc;
    private Statistic statistics;

    public UserInterface() {
        this.sc = new Scanner(System.in);;
        this.statistics = new Statistic();
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");

        while (sc.hasNextLine()) {
            int input = Integer.valueOf(sc.nextLine());

            if (input == -1) {
                break;
            }
            if (input <= 100 && input >= 0) {
                statistics.addPoint(input);
            }
        }
        System.out.println("Point average (all): " + statistics.average());
        System.out.println("Point average (passing): " + statistics.averagePassing());
        System.out.println("Pass percentage: "+statistics.passPercentage());
        statistics.gradeDistribution();

    }

}
