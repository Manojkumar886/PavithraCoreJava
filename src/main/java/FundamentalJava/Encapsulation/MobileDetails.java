package FundamentalJava.Encapsulation;

public class MobileDetails
{
    String Username="Pavithra";
  private  String MobileName;
  private  String MobileMOdel;
  private  int Ram;
  private  double price;
  private String Customername;

    public String getMobileName() {
        return MobileName;
    }

    public void setMobileName(String mobileName) {
        MobileName = mobileName;
    }

    public String getMobileMOdel() {
        return MobileMOdel;
    }

    public void setMobileMOdel(String mobileMOdel) {
        MobileMOdel = mobileMOdel;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCustomername(String Customername)
  {
      this.Customername=Customername;
  }

  public String getCustomername()
  {
      return Customername;
  }



}
