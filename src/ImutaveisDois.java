import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ImutaveisDois {
    private static Random rnd = new Random();
    private static final int MEGA = 1024*1024;
    private static String createRandomStr(int lenght){
        StringBuilder sb = new StringBuilder(lenght);
        for (int i=0;i<lenght;i++)
            sb.append((char)('a'+ rnd.nextInt('z' - 'a' +1)));
        return sb.toString();
    }
    public static void main(String[] args){
        List<String> substring = new ArrayList<String>();
        for (int i=0;i<100;i++){
            String randomStr = createRandomStr(MEGA);
            String subStr = randomStr.substring(1000,1004);
            substring.add(subStr);
            System.out.println(randomStr);
            System.out.println(subStr);
        }
    }
}