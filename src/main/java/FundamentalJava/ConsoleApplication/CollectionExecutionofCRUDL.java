package FundamentalJava.ConsoleApplication;

import java.util.*;

public class CollectionExecutionofCRUDL implements ZealousCreditcardMethods,Runnable
{
    List<ZealousCreditCard> creditCards=new ArrayList<ZealousCreditCard>();


    public CollectionExecutionofCRUDL()
    {
        ZealousCreditCard cardetails1=new ZealousCreditCard("Karthika",2000.2f,90878977677987l,'C',9090,56700);
        creditCards.add(new ZealousCreditCard("Pavithra",4500.32f,27878378387l,'A',8189,410000));
        creditCards.add(new ZealousCreditCard("Vasanth",1500.22f,999992676387l,'V',23989,30000));
        creditCards.add(new ZealousCreditCard("Vishali",4500.32f,27878378387l,'S',2389,30000));
        creditCards.add(cardetails1);
    }

    @Override
    public String AddCreditcardCustomerDetails(ZealousCreditCard creditdetails)
    {
        creditCards.add(creditdetails);
        return creditdetails.getCardUsername()+"has been added succesfully";
    }

    @Override
    public void ListallCreditcardCustomerDetails()
    {
        Iterator<ZealousCreditCard> it=creditCards.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());;
        }
    }

    @Override
    public String UpdateCreditcardCustomerDetails(String Cardusername)
    {
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<creditCards.size();i++)
        {
            if(creditCards.get(i).getCardUsername().equalsIgnoreCase(Cardusername))
            {
                System.out.println(creditCards.get(i));
                System.out.println("which field you want update");
                String field=scan.next();
                switch (field)
                {
                    case "Cardusername":
                        System.out.println("you are choose cardusername ,please tell us new username");
                        String newname= scan.next();
                        creditCards.get(i).setCardUsername(newname);
                        break;

                        default:
                            System.out.println("your field name is not matching");
                }
            }
        }
        return Cardusername+" has been updated successfully";
    }

    @Override
    public long SearchCreditcardCustomerDetails(long Cardnumber) {
        return 0;
    }

    @Override
    public String DeleteCreditcardCustomerDetails(String Cardusername)
    {
        for(int i=0;i<creditCards.size();i++)
        {
            if(creditCards.get(i).getCardUsername().equalsIgnoreCase(Cardusername))
            {
                creditCards.remove(creditCards.get(i));
                System.out.println(Cardusername+" has been deleted successfully");
            }
        }
        return Cardusername;
    }

    public void Sorting( )
    {
        Collections.sort(creditCards);
    }
    synchronized public void run()
    {
        System.out.println("welcome to ZealousCreditCard Bank"+Thread.currentThread().getName());
        CollectionExecutionofCRUDL credit=new CollectionExecutionofCRUDL();
        do
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("1.Add\n2.List\n3.Update\n4.Search\n5.Sort\n6.Delete\n7.Exit");
            int Usage=scan.nextInt();
            switch (Usage)
            {
                case 1:
                    System.out.println("Please add new customer details -credit bank"+"\nusername\tautopay\tNumber\tPin\tLimit");
                    ZealousCreditCard cus1=new ZealousCreditCard(scan.next(),scan.nextFloat(),scan.nextLong(),'S',scan.nextInt(), scan.nextInt());
                    System.out.println(credit.AddCreditcardCustomerDetails(cus1));
                    credit.ListallCreditcardCustomerDetails();
                    break;
                case 2:
                    System.out.println("List all -zealous bank credit card details");
                    credit.ListallCreditcardCustomerDetails();
                    break;
                case 3:
                    System.out.println("which username you want update");
                    String username= scan.next();
                    credit.UpdateCreditcardCustomerDetails(username);
                    break;
                case 4:
                    System.out.println("which card number you are checking");
                    long cardnumber=scan.nextLong();
                    credit.SearchCreditcardCustomerDetails(cardnumber);
                    break;
                case 5:
                    System.out.println("your values is sorted");
                    credit.Sorting();
                    break;
                case 6:
                    System.out.println("which value you want delete in my object");
                    String username1= scan.next();
                    credit.DeleteCreditcardCustomerDetails(username1);
                    break;


                default: return;
            }
        }
        while (true);
    }

}
