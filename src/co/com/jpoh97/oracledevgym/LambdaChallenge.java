package co.com.jpoh97.oracledevgym;

public class LambdaChallenge {

    public static void main(String... doYourBest) {
        String vitoCorleoneShoot = useRevolver(() -> "BAMM!!");

        String michaelCorleoneShoot = useShotgun(() -> {
            return "POHHHH!!!";
        });

        System.out.println(vitoCorleoneShoot +
                michaelCorleoneShoot);

        // BAMM!!POHHHH!!!
    }

    private static String useRevolver(Revolver revolver) {
        return revolver.shoot();
    }

    static String useShotgun(Shotgun shotgun) {
        return shotgun.shoot();
    }

    private interface Revolver {
        String shoot();
    }

    public interface Shotgun {
        String shoot();

        default String reload() {
            return "Reloading...";
        }
    }

}