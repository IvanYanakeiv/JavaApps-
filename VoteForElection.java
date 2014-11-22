
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ivan
 */
public class VoteForElection {

    public static void main(String args[]) {

        int broiGlasopodavateli = 15;

        int VoteForGerb = 0;
        int VoteForBSP = 0;
        int VoteForDPS = 0;
        int VoteForBBC = 0;
        int VoteForRB = 0;
        int WrongVotes = 0;

        Scanner input = new Scanner(System.in);

        int counter = 0;
        System.out.print("Please enter the number for who vote \n"
                + "1 - gerb\n"
                + "2 - bsb\n"
                + "3 - dps\n"
                + "4 - bbc\n"
                + "5 - rb\n------------------------------\n");
        
        while (counter < broiGlasopodavateli) {

            int glas = input.nextInt();

            switch (glas) {

                case 1:
                    VoteForGerb++;
                    break;
                case 2:
                    VoteForBSP++;
                    break;
                case 3:
                    VoteForDPS++;
                    break;
                case 4:
                    VoteForBBC++;
                    break;
                case 5:
                    VoteForRB++;
                    break;
                default:
                    WrongVotes++;

            }

            counter++;

        }
        System.out.println("\n------------------------------\n"
                + "Vote for GERB" + VoteForGerb);
        System.out.println("Vote for BSP" + VoteForBSP);
        System.out.println("Vote for DPS" + VoteForDPS);
        System.out.println("Vote for BBC" + VoteForBBC);
        System.out.println("Vote for RB" + VoteForRB);
        System.out.println("Wrong Votes " + WrongVotes);

    }
}
