package exam;

import java.util.*;

/**
 * Created by lzy on 2015/6/23.
 */
public class Go {
    private  int x = 100;
    public static void main(String[] args) {
        Go s = new Go();
        s.x++;
        Go s2 = new Go();
        s2.x++;
        s = new Go();
        s.x++;
//        Go.x--;
        System.out.println(s2.x);
    }


}
