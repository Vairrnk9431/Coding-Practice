import java.util.Scanner;

public class IndexofString {

    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuffer sb = new StringBuffer(str.length());
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
