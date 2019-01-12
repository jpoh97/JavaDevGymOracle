package co.com.jpoh97.oracledevgym;

/*
Unlike if-then and if-then-else statements, the switch statement can have a number of possible execution paths.
A switch works with the byte, short,  char, and int primitive data types.
It also works with enumerated types, the String class, and a few special classes that wrap certain primitive types:
Character, Byte, Short, and Integer (discussed in Numbers and Strings).
 */
public class SwitchCaseChallenge {

    public static void main(String... doYourBest) {
        int formulaNumber = 50;

        // Print MnNeH

        // version 1
        String heisenbergFormula = "";

        switch (formulaNumber) {

            case 30:
                heisenbergFormula += "Zn";
                break;
            case 50:
                heisenbergFormula += "Mn";
            case 10:
                heisenbergFormula += "Ne";
            case 5:
                heisenbergFormula += "H";
                break;
            default:
                heisenbergFormula += "He";
        }

        System.out.println(heisenbergFormula);

        // version 2
        heisenbergFormula = "";

        switch (formulaNumber) {
            case 30:
                heisenbergFormula += "Zn";
                break;
            case 10:
                heisenbergFormula += "O";
            case 50:
                heisenbergFormula += "Mn";
            case 5:
                heisenbergFormula += "Ne";
            default:
                heisenbergFormula += "H";
        }

        System.out.println(heisenbergFormula);

        // version 3
        heisenbergFormula = "";

        switch (formulaNumber) {
            case 30:
                heisenbergFormula += "Zn";
                break;
            case 10:
                heisenbergFormula += "O";
            case 50:
                heisenbergFormula += "Mn";
            case 5:
                heisenbergFormula += "Ne";
            default:
                heisenbergFormula += "H";
        }

        System.out.println(heisenbergFormula);
    }

}