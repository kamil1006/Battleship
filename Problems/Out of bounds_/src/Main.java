import java.util.*;

class FixingStringIndexOutOfBoundsException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int index = scanner.nextInt();
        try {
            if (string != null) {
                if (index > 0 || index <= string.length())
                    System.out.println(string.charAt(index));
                else
                    System.out.println("Out of bounds!");
            } else
                System.out.println("Out of bounds!");

        } catch (Exception e) {
            System.out.println("Out of bounds!");
        }

    }
}