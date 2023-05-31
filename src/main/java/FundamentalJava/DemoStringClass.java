package FundamentalJava;

public class DemoStringClass
{
    public static void main(String[] args)
    {
        String user1="Pavi123";//Literal
        String user2=new String("Manojkumar");//Non -literal
        System.out.println(user2);
//        System.out.println(user2.concat(user1));//ManojkumarPavi123
//        System.out.println(user2);

//        user2=user2.concat(user1);
//        System.out.println(user2);
//        System.out.println(user2);
//        user2=user2.concat("Student");//immutable

        System.out.println(user1.charAt(3));
        String user3="pavi123";
        System.out.println(user1.equalsIgnoreCase(user3));
        System.out.println(user1.compareToIgnoreCase(user2));
        System.out.println(user2.startsWith("m"));
        System.out.println(user3.endsWith(""));
        user3=user3.replace("pavi123","Manoj123");
        System.out.println(user3);
        String content="    get a perticular word in one sentance,spaces cannot be calculated by value       ";
        System.out.println(content.substring(15,45));
        System.out.println(content.contains("ti"));
        System.out.println("my content \n"+content);
        System.out.println(content.trim());

        String [] result=content.split("e");
//        for(String result1:result)
//        {
//            System.out.print(result1+"ee");
//        }
        for(int pos=0;pos< result.length;pos++)
        {
            System.out.print(result[pos]+"x");
        }
    }
}
