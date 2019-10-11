package xyz;

import java.io.*;

public class FileDemo implements Serializable {

    int a, b;

    public void storeint(int x, int y) {
        a = x;
        b = y;
    }

    public static void main(String[] args) {
        try {

            FileDemo f=new FileDemo();
            f.storeint(2,3);
            FileOutputStream fout=new FileOutputStream("prabhu.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);

            out.writeObject(f);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

