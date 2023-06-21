package FundamentalJava.Collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class DemoHashset
{
    public static void main(String[] args)
    {
//        HashSet<Boolean> obj=new HashSet<Boolean>();
//        obj.add(true);
//        obj.add(false);
//        obj.add(false);
//        obj.add(true);
//        obj.add(false);

        TreeSet<Mobile> object=new TreeSet<Mobile>();
        Mobile mob1=new Mobile("Redmi NOte 12 Pro","Redmi",10004,'B');
        Mobile mob2=new Mobile("Realme-4","Oppo",28000,'V');
        Mobile mob3=new Mobile("Samsung Plus8","Samsung",12000,'A');
        Mobile mob4=new Mobile("Vivo V89","Vivo",30000,'D');

        object.add(mob1);
        object.add(mob2);
        object.add(mob4);
        object.add(mob3);
        Iterator it=object.iterator();
        while(it.hasNext())
        {
            System.out.println("My Object of mobile Details"+it.next());
        }

    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Mobile implements Comparable<Mobile>
{
    String MobileName;
    String MobileBrand;
    int MobilePrice;
    char MobileSector;

    @Override
    public int compareTo(Mobile o)
    {
        return this.MobileBrand.compareTo(o.MobileBrand);
    }
}