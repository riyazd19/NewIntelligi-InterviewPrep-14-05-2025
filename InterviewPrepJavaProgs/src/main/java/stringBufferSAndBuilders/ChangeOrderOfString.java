package stringBufferSAndBuilders;

public class ChangeOrderOfString {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("A quick brown fox jumper over");
        System.out.println("original string: - "+sb);
        System.out.println(sb.charAt(2));
        char temp= sb.charAt(1);


    }
}
