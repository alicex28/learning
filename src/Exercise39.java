public class Exercise39 {

    public static void stars(int amount) {
        System.out.print("*");
    }

    // Exercise 39.1
    public static void printStars(int amount) {
        int i = 1;
        while (i <= amount) {
            stars(amount);
            i = i+1;
        }
    }

    // Exercise 39.2
    public static void printSquare(int sideSize) {
        int i = 0;
        while (i < sideSize) {
            printStars(sideSize);
            System.out.println();
            i = i+1;
        }

    }

    // Exercise 39.3
    private static void printRectangle(int width, int height) {
        int i = 0;
        while (i < height) {
            printStars(width);
            System.out.println();
            i = i+1;
        }

    }

    // Exercise 39.4
    private static void printTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printStars(i);
            System.out.println();
            i = i+1;
        }

    }

    public static void main(String[] args) {
        //printStars(0);
        //printSquare(4);
        //printRectangle(3, 5);
        //printTriangle(4);
    }

}





