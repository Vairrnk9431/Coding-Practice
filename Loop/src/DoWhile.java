public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Robo...");
        int i = 1;
       rajini: do {
            int j = 1;
       tamanna:     do {
                System.out.print("* ");
                j++;
                break tamanna;
            } while (j <= 1);
            System.out.println();
            i++;
            break rajini;
        } while (i <= 5);
    }
}
