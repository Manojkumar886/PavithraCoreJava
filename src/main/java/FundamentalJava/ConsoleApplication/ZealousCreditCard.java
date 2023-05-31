package FundamentalJava.ConsoleApplication;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//getter,setter,tostring
@NoArgsConstructor//Default constructor
@AllArgsConstructor//Parameterized Constructor
public class ZealousCreditCard
{
    private String CardUsername;
    private float CardAutopay;
    private long CardNumber;
    private char CardType;
    private int CardPin;
    private int CardLimit;

}
