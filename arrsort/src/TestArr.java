import com.sun.deploy.util.ArrayUtil;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
public class TestArr {
    public static void main(String[] args) {


        String[] d1 = new String[]{"1", "2", "3"};
        String[] d2 = new String[]{"2", "3","4"};
        String[] result = ArrayUtils.addAll(d1, d2);
    }
}