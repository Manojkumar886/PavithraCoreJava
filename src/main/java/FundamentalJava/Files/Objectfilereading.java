package FundamentalJava.Files;

import java.io.*;

public class Objectfilereading
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File myfile=new File("E:\\PavithraCoreJava\\src\\main\\java\\FundamentalJava\\Files\\objectofbusfile.pdf");
        FileInputStream fis=new FileInputStream(myfile);
        ObjectInputStream ois=new ObjectInputStream(fis);

//        float floatvari=5.6f;
//        int obj=(int)floatvari;
        Bus temp=(Bus)ois.readObject();
        System.out.println(temp);
        System.out.println("my bus details"+"\n mybusmodel"+temp.BusModel+"\n my bus cost"+temp.BusCost+"\n my bus type"+temp.BusType+"\n my bus coount :"+ temp.BusSeatcount);
        ois.close();
        fis.close();
    }
}


