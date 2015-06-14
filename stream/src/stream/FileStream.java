package stream;

import java.io.*;

/**
 * Created by lzy on 2015/6/14.
 */
public class FileStream {
    public static void main(String[] args) throws IOException {
        String filname = "a.txt";
        String filname1 = "b.txt";
        FileOutputStream fout = new FileOutputStream(filname);
        fout.write(-1);
        fout.close();

        FileInputStream fin = new FileInputStream(filname);
        int i;
        while ((i = fin.read()) != -1)
            System.out.print(" " + i);
        fin.close();
        copy(filname, filname1);
    }

    public static void copy(String filename1, String filename2) {
        try {
            FileInputStream fin = new FileInputStream(filename1);
            FileOutputStream fout = new FileOutputStream(filename2);
            byte buffer[] = new byte[512];
            int count = 0;
            while ((count = fin.read(buffer)) != -1)
                fout.write(buffer, 0, count);
            fin.close();
            fout.close();

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
