package FundamentalJava.Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class Securewriting
{
    public static void main(String[] args) throws IOException
    {
        File myfile=new File("E:\\PavithraCoreJava\\src\\main\\java\\FundamentalJava\\Files\\securefile.txt");
//        myfile.createNewFile();

        FileOutputStream fos=new FileOutputStream(myfile);

        DeflaterOutputStream dos=new DeflaterOutputStream(fos);

        Scanner scan=new Scanner(System.in);

        System.out.println("which content you written in your file");
        String mycontent=scan.nextLine();

        dos.write(mycontent.getBytes());

        dos.close();
        fos.close();

    }
}
