package FundamentalJava.OOPS.MultiLevelInheritance;

public class EngineerStudent extends MedicalStduent
{
public void Engineeringstudent()
{
    System.out.println("Engineer\t -raduates with an Engineering Technology degree are often called “technologists,” while students who complete two-year engineering technology programs are called “technicians.”");
}

    public static void main(String[] args) {
        EngineerStudent BE=new EngineerStudent();
        BE.Student();
        BE.Engineeringstudent();
        BE.medicalstudent();
    }

}
