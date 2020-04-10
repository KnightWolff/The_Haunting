public class STATS {
    private static int lvl;
    private static int numZoms;
    private static int numSkels;


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

    public static void updateLevel(){
        switch(lvl){
            case 1:
                setNumSkels(1);
                setNumZoms(3);
                break;

            case 2:
                setNumSkels(2);
                setNumZoms(5);
                break;
        }
    }
}
