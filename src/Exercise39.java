public class Exercise39 {

    /*39.1
    public static void stars(int amount) {
        System.out.print("*");
    }

    private static void printStars(int amount) {
        int i = 0;
        while (i <= amount) {
            stars(amount);
            i = i+1;
        }
    }

    public static void main(String[] args) {
        printStars(5);
        System.out.println();
        printStars(3);
        System.out.println();
        printStars(9);
    }
    */

    /*39.2
    public static void stars(int amount) {
        System.out.print("*");
    }

    private static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            stars(amount);
            i = i+1;
        }
    }

    public static void printSquare(int sideSize) {
        int i = 0;
        while (i < sideSize) {
            printStars(sideSize);
            System.out.println();
            i = i+1;
        }

    }

    public static void main(String[] args) {
        printSquare(4);

    }

     */

    /*39.3
    public static void stars(int amount) {
        System.out.print("*");
    }

    private static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            stars(amount);
            i = i+1;
        }
    }

    public static void printRectangle(int width, int height) {
        int i = 0;
        while (i < height) {
            printStars(width);
            System.out.println();
            i = i+1;
        }

    }

    public static void main(String[] args) {
        printRectangle(17,3);

    }
    */

    //39.4
    public static void stars(int amount) {
        System.out.print("*");
    }

    private static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            stars(amount);
            i = i+1;
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printStars(i);
            System.out.println();
            i = i+1;
        }

    }

    public static void main(String[] args) {
        printTriangle(4);
    }


}





