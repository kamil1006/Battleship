package battleship;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your code here
        final int rows = 10;
        final int cols = 10;
        char c = 'A';
        Scanner scanner = new Scanner(System.in);
        final char[][] battleField = new char[rows][cols];
        createBF(rows, cols, battleField);

        DisplayBF(rows, cols, c, battleField);
        //add  ArtifactCarrier
        addArtifactCarrier(scanner, battleField, 4, "Aircraft Carrier");
        DisplayBF(rows, cols, c, battleField);
        addArtifactCarrier(scanner, battleField, 3, "Battleship");
        DisplayBF(rows, cols, c, battleField);
        addArtifactCarrier(scanner, battleField, 2, "Submarine");
        DisplayBF(rows, cols, c, battleField);
        addArtifactCarrier(scanner, battleField, 2, "Cruiser");
        DisplayBF(rows, cols, c, battleField);
        addArtifactCarrier(scanner, battleField, 1, "Destroyer");
        DisplayBF(rows, cols, c, battleField);

    }
    private static void addArtifactCarrier(Scanner scanner, char[][] battleField, int numCells, String name) {
        while (true) {
            System.out.println("Enter the coordinates of the " + name + " (" + numCells + " cells): ");

            String[] userInput = scanner.nextLine().split(" ");

            int rowOne, rowTwo, colOne, colTwo;

            boolean toocloseToOtherArifact=false;
            rowOne = (int) (userInput[0].charAt(0)) - 65;
            colOne = Integer.parseInt(userInput[0].substring(1)) - 1;

            rowTwo = (int) (userInput[1].charAt(0)) - 65;
            colTwo = Integer.parseInt(userInput[1].substring(1)) - 1;


            boolean rowsEqual = rowOne - rowTwo == 0;
            boolean colsEqual = colOne - colTwo == 0;
            if (!(rowsEqual && Math.abs(colOne - colTwo) == numCells ||
                    (Math.abs(rowOne - rowTwo) == numCells && colsEqual))) {
                System.out.println("Error! Wrong length of the " + name + "! Try again:");
                continue;
//                try {
//                    throw new IllegalArgumentException();
//                }catch(IllegalArgumentException e){
//                    System.out.println("illegal arguments");
//                }
            } else {
                if (rowsEqual) {
                    // System.out.println("rows euual");
                    int artifactStartPosition = Math.min(colOne, colTwo);
                    //System.out.println("aposition:" + artifactStartPosition);
                    int count=0;

                    int endOfArtifact=artifactStartPosition + numCells;
                    for (int i = artifactStartPosition; i <= artifactStartPosition + numCells; i++) {

//
                        count++;
                        if (checkAroundForOtherShips(battleField, rowOne, i, numCells, artifactStartPosition,rowsEqual,count)) {
                            System.out.println("Error! You placed it too close to another one. Try again:\n");
                            toocloseToOtherArifact=true;
                            break;
                        } else {
                            battleField[rowOne][i] = 'O';
                        }
                    }
                } else {
                    //cols equal

                    int artifactStartPosition = Math.min(rowOne, rowTwo);
                    int count=0;
                    for (int i = artifactStartPosition; i <= artifactStartPosition + numCells; i++) {
                        count++;
                        if (checkAroundForOtherShips(battleField, i,colOne, numCells, artifactStartPosition,rowsEqual,count)) {
                            System.out.println("Error! You placed it too close to another one. Try again:\n");
                            toocloseToOtherArifact=true;
                            break;
                        } else {
                            battleField[i][colOne] = 'O';
                        }
                    }

                }
                if(toocloseToOtherArifact){
                    continue;
                }
                break;
            }
        }

    }

    private static boolean checkAroundForOtherShips(char[][] battleField, int row, int col ,int startofTheArtifact,int numOfCells,boolean rowsEqual,int count) {
        //if  above row exists

        if (row - 1 >= 0) {
            //if left col exist
            if (col - 1 > 0) {
                if (battleField[row - 1][col - 1] == 'O') {
                    return true;
                }
            }
            //top cell
            if(rowsEqual) {
                if (battleField[row - 1][col] == 'O') {
                    return true;
                }
            }
            if(!rowsEqual && count==1) {
                if (battleField[row - 1][col] == 'O') {
                    return true;
                }
            }
            //right col
            if (col < battleField[row].length - 1) {
                if (battleField[row - 1][col + 1] == 'O') {
                    return true;
                }
            }

        }
        //check left col
        if(rowsEqual && count==1) {
            if (col - 1 >= 0) {
                if (battleField[row][col - 1] == 'O') {
                    // System.out.println("A AT  left ");
                    return true;
                }
            }
        }
        if(!rowsEqual){
            if (col - 1 >= 0) {
                if (battleField[row][col - 1] == 'O') {
                    return true;
                }
            }
        }

        //if right col exist
        if(rowsEqual && count==startofTheArtifact+numOfCells) {
            if (col < battleField[row].length - 1) {
                if (battleField[row][col + 1] == 'O') {
                    return true;
                }
            }
        }
        if(!rowsEqual){
            if (col < battleField[row].length - 1) {
                if (battleField[row][col + 1] == 'O') {
                    //System.out.println("A AT RIGHT ");
                    return true;
                }
            }
        }
        //if bottom below  row exist
        if (row < battleField.length - 1) {
            //if left col exist
            if (col - 1 > 0) {
                if (battleField[row + 1][col - 1] == 'O') {
                    return true;
                }
            }
            //bottom cell
            if(rowsEqual) {
                if (battleField[row + 1][col] == 'O') {
                    return true;
                }
            }

            if(!rowsEqual && count ==startofTheArtifact+numOfCells) {
                if (battleField[row + 1][col] == 'O') {
                    return true;
                }
            }
            //right col
            if (col < battleField[row].length - 1) {
                if (battleField[row + 1][col + 1] == 'O') {
                    return true;
                }

            }
        }
        return false;
    }

    private static void DisplayBF(int rows, int cols, char c, char[][] battleField) {
        for (int i = 0; i < rows + 1; i++) {
            for (int j = 0; j < cols + 1; j++) {
                if (i == 0) {
                    if (j == 0) {
                        System.out.print("  ");
                    } else {
                        System.out.print(j + " ");
                    }

                } else if (j == 0) {


                    System.out.print(c + " ");
                    c++;
                } else {
                    System.out.print(battleField[i - 1][j - 1] + " ");
                }
            }
            System.out.println();
        }
    }

    private static void createBF(int rows, int cols, char[][] battleField) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                battleField[i][j] = '~';
            }
        }
    }

}