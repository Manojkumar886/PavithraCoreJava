package FundamentalJava.ConsoleApplication;

import java.util.Arrays;
import java.util.Scanner;

public class CreditCardExecution implements ZealousCreditcardMethods
{
    ZealousCreditCard []card=new ZealousCreditCard[3];//Array Declaration(datatype [] arrayname=new datatype(classname);

    public CreditCardExecution()
    {
        card[0]=new ZealousCreditCard("Pavithra",4500.34f,89796756566l,'S',2323,45000);
        card[1]=new ZealousCreditCard("Manojkumar",4000.23f,23456786676l,'M',8989,9000);
        card[2]=new ZealousCreditCard("annamalai",90000.3f,65687689767879l,'A',456775,156000);
    }
    static
    {
        System.out.println("welcome to Zealous CreditBank");
    }

    public static void main(String[] args)
    {
        CreditCardExecution credit=new CreditCardExecution();

        do
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("1.Add\n2.List\n3.Update\n4.Search\n5.Sort\n6.Delete");
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

    @Override
    public String AddCreditcardCustomerDetails(ZealousCreditCard creditdetails)
    {
        Scanner scan=new Scanner(System.in);

      try
      {
          for(int index=0;index<card.length;index++)
          {
              if(card[index]==null)
              {
                  card[index]=creditdetails;
                  return creditdetails.getCardUsername()+"has been added succesfully";
              }
          }
          throw new ZealousException();
      }
      catch(ZealousException ze)
      {
          System.out.println(ze+"\n memory size is 3 already full....you deleted one value if you are added a new value ");
          for(ZealousCreditCard card1:card)
          {
              System.out.println(card1.getCardUsername());
          }
          System.out.println("which value you want deleted in your memory");
          DeleteCreditcardCustomerDetails(scan.next());
          AddCreditcardCustomerDetails(creditdetails);
      }
        return creditdetails.getCardUsername()+" has been added successfully";
    }

    @Override
    public void ListallCreditcardCustomerDetails()
    {
        for(ZealousCreditCard credit1:card)
        {
            System.out.println(credit1);
        }
    }

    @Override
    public String UpdateCreditcardCustomerDetails(String Cardusername)
    {
        Scanner scan=new Scanner(System.in);
        for(int index=0;index< card.length;index++)
        {
            if(card[index].getCardUsername().equalsIgnoreCase(Cardusername))
            {
                System.out.println(card[index]+"\n which one field you are edit");
                String field=scan.next();
               if(field.equalsIgnoreCase("cardusername"))
               {
                   System.out.println("please tell us new username");
                   String username=scan.next();
                   card[index].setCardUsername(username);

               } else if (field.equalsIgnoreCase("cardpin"))
               {
                   System.out.println("please tell us change pin no");
                   int pin=scan.nextInt();
                   card[index].setCardPin(pin);
                   System.out.println("pin number updated");
               }
            }
        }
        return null;
    }

    @Override
    public long SearchCreditcardCustomerDetails(long Cardnumber)
    {
        for(int i=0;i<card.length;i++)
        {
            if(card[i].getCardNumber()==Cardnumber)
            {
                System.out.println(Cardnumber+" in this card number position founded at"+i);
                break;
            }
        }
        return Cardnumber;
    }

    @Override
    public String DeleteCreditcardCustomerDetails(String Cardusername)
    {
        for(int i=0;i< card.length;i++)
        {
            if(card[i].getCardUsername().equalsIgnoreCase(Cardusername))
            {
                card[i]=null;
                System.out.println(Cardusername+"your value is deleted successfully");
                break;
            }
        }
        return Cardusername+"has not deleted ";
    }
}
