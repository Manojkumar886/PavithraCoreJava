package FundamentalJava.Files;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

public class ObjectFile
{
    public static void main(String[] args) throws IOException
    {
        File myfile=new File("E:\\PavithraCoreJava\\src\\main\\java\\FundamentalJava\\Files\\objectofbusfile.pdf");

//        myfile.createNewFile();

        FileOutputStream fos=new FileOutputStream(myfile);

        ObjectOutputStream oos=new ObjectOutputStream(fos);

        Bus busmodel1=new Bus("Privatebus","Volvo",54,10000000.9f);

        oos.writeObject(busmodel1);

        oos.close();
        fos.close();

    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Bus implements Serializable
{
    String BusType;
    String BusModel;
    int BusSeatcount;
    float BusCost;
}