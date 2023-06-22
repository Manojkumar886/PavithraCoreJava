package FundamentalJava.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Filereading
{
    public static void main(String[] args) throws IOException
    {
        File myfile=new File("E:\\PavithraCoreJava\\src\\main\\java\\FundamentalJava\\Files\\Basicfile.doc");
        FileInputStream fis=new FileInputStream(myfile);

        int msize=fis.available();

        byte[] obj=new byte[msize];

        fis.read(obj);

        String myvalue=new String(obj);

        System.out.println("my file content is :"+myvalue);

        fis.close();
    }
}
