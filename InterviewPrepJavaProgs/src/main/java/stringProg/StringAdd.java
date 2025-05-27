package stringProg;

public class StringAdd {
    public static void main(String[] args) {
        String str="he";
        System.out.println(str);
       str= str+"llo";
        System.out.println(str);
        StringBuilder sb= new StringBuilder("abcdefgh");
        sb.delete(2,3);
        System.out.println(sb.reverse());
        StringBuffer sb1= new StringBuffer(str);
        System.out.println(sb1.reverse());
    }
}
