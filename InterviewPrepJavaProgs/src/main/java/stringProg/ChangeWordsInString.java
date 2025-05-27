package stringProg;

public class ChangeWordsInString {
    public static void main(String[] args) {
        String str="A quick brown fox jumped";
        String[] words= str.split(" ");

        String temp = words[1];
        words[1] = words[4];
        words[4] = temp;

       String str2 =String.join(" ",words);
        System.out.println(str2.toUpperCase());
        System.out.println(str.equals(str2));





    }
}
