public class Gamestates {

    public static boolean MENU = false;
    public static boolean PLAY1 = true;
    public static boolean PLAY2 = false;
    public static boolean DEAD = false;
    public static boolean WIN = false;

    public static boolean isMENU() {
        return MENU;
    }

    public static void setMENU(boolean MENU) {
        Gamestates.MENU = MENU;
    }

    public static boolean isPLAY1() {
        return PLAY1;
    }

    public static void setPLAY1(boolean PLAY1) {
        Gamestates.PLAY1 = PLAY1;
    }

    public static boolean isPLAY2() {
        return PLAY2;
    }

    public static void setPLAY2(boolean PLAY2) {
        Gamestates.PLAY2 = PLAY2;
    }

    public static boolean isDEAD() {
        return DEAD;
    }

    public static void setDEAD(boolean DEAD) {
        Gamestates.DEAD = DEAD;
    }

    public static boolean isWIN() {
        return WIN;
    }

    public static void setWIN(boolean WIN) {
        Gamestates.WIN = WIN;
    }
}
