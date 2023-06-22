package FundamentalJava.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class SecureReading
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        File myfile=new File("E:\\PavithraCoreJava\\src\\main\\java\\FundamentalJava\\Files\\securefile.txt");

        FileInputStream fis=new FileInputStream(myfile);

        InflaterInputStream iis=new InflaterInputStream(fis);

        int size=fis.available();
        byte[] mybytevalue=new byte[size];

        iis.read(mybytevalue);

        String myobject=new String(mybytevalue);
        System.out.println("my secure file value is :/t"+myobject);

        iis.close();
        fis.close();

    }
}
