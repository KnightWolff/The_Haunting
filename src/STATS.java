public class STATS {
    private static int lvl = 0;
    private static int numZoms = 3;
    private static int numSkels = 1;


    public static int getNumZoms() {
        return numZoms;
    }

    public static void setNumZoms(int numZoms) {
        STATS.numZoms = numZoms;
    }

    public static int getNumSkels() {
        return numSkels;
    }

    public static void setNumSkels(int numSkels) {
        STATS.numSkels = numSkels;
    }

    public static int getLvl() {
        return lvl;
    }

    public static void setLvl(int lvl) {
        STATS.lvl = lvl;
    }
}
