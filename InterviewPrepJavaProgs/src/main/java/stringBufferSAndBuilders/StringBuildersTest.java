package stringBufferSAndBuilders;

public class StringBuildersTest {
    public static void main(String[] args) {
       StringBuilder sb= new StringBuilder();
       for(int i=0;i<100;i++){
           sb.append(i);
       }
        System.out.print(sb.toString());
    }

}
