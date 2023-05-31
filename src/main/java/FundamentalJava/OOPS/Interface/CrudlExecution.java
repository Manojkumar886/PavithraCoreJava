package FundamentalJava.OOPS.Interface;

public interface CrudlExecution
{
    public void Add();//No implemantation method
    public void Update();

    public static void main(String[] args)
    {
//        interface class does not create a object,untill you create a object cannot be working
        CrudlExecution exe= new CrudlExecution() {
            @Override
            public void Add() {
                System.out.println("Adding");
            }

            @Override
            public void Update() {
                System.out.println("Updating");
            }
        };
    }
}
