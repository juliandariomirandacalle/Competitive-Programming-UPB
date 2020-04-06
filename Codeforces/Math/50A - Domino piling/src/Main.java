import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String test = input.nextLine();

        String[] parts = test.split(" ");

        String part1 = parts[0];
        String part2 = parts[1];
        int intpart1 = Integer.parseInt(part1);
        int intpart2 = Integer.parseInt(part2);

        int board = intpart1*intpart2;
        int domino = 2;

        int output = board/domino;

        System.out.println(output);

    }

}