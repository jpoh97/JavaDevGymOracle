package co.com.jpoh97.oracledevgym;

public class FlowControlChallenge {

    public static void main(String... doYourBest) {

        // Must print 345truetrue

        // version 1

        boolean isBarneyAlcoholic = true;
        boolean isHomerFat = true;
        String result = "";

        if (isHomerFat = false | (isBarneyAlcoholic = false)) {
            result += "1";
        }
        if (isHomerFat || isBarneyAlcoholic) {
            result += "2";
        }
        if (!isHomerFat && !isBarneyAlcoholic) {
            result += "3";
        }
        if ((isHomerFat = true) & (isBarneyAlcoholic = true)) {
            result += "4";
        }
        if (isHomerFat || (isBarneyAlcoholic = false)) {
            result += "5";
        }

        System.out.println(result + isHomerFat + isBarneyAlcoholic);

        // version 2

        isBarneyAlcoholic = true;
        isHomerFat = true;
        result = "";

        if (!(isHomerFat = true) || !(isBarneyAlcoholic = false)) {
            result += "3";
        }
        if ((isHomerFat = true) & (isBarneyAlcoholic = true)) {
            result += "4";
        }
        if ((isBarneyAlcoholic = !false) || isHomerFat) {
            result += "5";
        }

        System.out.println(result + isHomerFat + isBarneyAlcoholic);

        // version 3

        isBarneyAlcoholic = true;
        isHomerFat = true;
        result = "";
        if (!(isHomerFat = true) || !(isBarneyAlcoholic = !false)) {
            result += "2";
        }
        if ((isHomerFat = true) & !(isBarneyAlcoholic = !isBarneyAlcoholic)) {
            result += "3";
        }
        if ((isBarneyAlcoholic = !isBarneyAlcoholic) && isHomerFat) {
            result += "4";
        }
        if ((isBarneyAlcoholic = !false) | isHomerFat) {
            result += "5";
        }

        System.out.println(result + isHomerFat + isBarneyAlcoholic);
    }
}
