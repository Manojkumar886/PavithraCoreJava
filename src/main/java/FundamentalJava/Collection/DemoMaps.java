package FundamentalJava.Collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class DemoMaps
{
    public static void main(String[] args)
    {
//        Hashtable<String,Integer> obj=new Hashtable<String,Integer>();
//
//        obj.put("Pavithra",22);
//        obj.put("Manojkumar",22);
//        obj.put("Jasmine",22);
//        obj.put("Rohini",31);
//        obj.put("Mohanavel",22);
//        obj.put("Tamlarasan",23);
//        System.out.println(obj);
//        System.out.println(obj.entrySet());
//
//        for(Map.Entry newobj: obj.entrySet())
//        {
//            System.out.println("my key class :"+ newobj.getKey()+"\t my value class :"+newobj.getValue());
//        }

        TreeMap<String,LaptopDetails> obj=new TreeMap<String,LaptopDetails>();

        LaptopDetails detail1=new LaptopDetails("Hp-8090A2",8,48000.0,"silver");
        LaptopDetails detail2=new LaptopDetails("Hp-90B7",2,48000.0,"Black");
        LaptopDetails detail3=new LaptopDetails("Lenov-YUbV6798",4,48000.0,"Blue");
        LaptopDetails detail4=new LaptopDetails("Dell0990-JK",12,48000.0,"Pink");
        LaptopDetails detail5=new LaptopDetails("Apple Pad-123122KMASAPPLE",8,48000.0,"Sandal");


        obj.put("Pavithra",detail4);
        obj.put("Kavitharasi",detail2);
        obj.put("Keerthi",detail1);
        obj.put("Lishimitha",detail2);
        obj.put("Haripriya",detail5);
        obj.put("PriyaDharsini",detail3);
//        System.out.println(obj);

        for(Map.Entry newobj:obj.entrySet())
        {
            System.out.println("cutomer name is :"+newobj.getKey()+"\n Product details is :"+newobj.getValue());
        }
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class LaptopDetails implements Comparable<LaptopDetails>
{
    String LaptopName;
    int LaptopRam;
    double LaptopCost;
    String LaptopColor;

    @Override
    public int compareTo(LaptopDetails o) {
        return this.LaptopName.compareTo(o.LaptopName);
    }
}
