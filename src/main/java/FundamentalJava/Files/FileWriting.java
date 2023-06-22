package FundamentalJava.Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting
{
    public static void main(String[] args) throws IOException
    {
        File myfile=new File("E:\\PavithraCoreJava\\src\\main\\java\\FundamentalJava\\Files\\Basicfile.doc");
//        myfile.createNewFile();
//
//        System.out.println(myfile.getName()+" has been created");
        FileOutputStream fos=new FileOutputStream(myfile);

        Scanner scan=new Scanner(System.in);

        System.out.println("which content you written in your file");
        String mycontent=scan.nextLine();

        fos.write(mycontent.getBytes());
        fos.close();
    }
}
