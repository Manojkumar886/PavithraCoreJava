package FundamentalJava.ConsoleApplication;

public interface ZealousCreditcardMethods
{
    public String AddCreditcardCustomerDetails(ZealousCreditCard creditdetails);

    public void ListallCreditcardCustomerDetails();

    public String UpdateCreditcardCustomerDetails(String Cardusername);

    public long SearchCreditcardCustomerDetails(long Cardnumber);

    public String DeleteCreditcardCustomerDetails(String Cardusername);


}
