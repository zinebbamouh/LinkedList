import java.util.*;
public class CellPhone implements Cloneable {
    private long serialNum;
    private String brand;
    private int year;
    private double price;

//Parameterized constructor:
    public CellPhone(long sn, String b, int y, double p) {
        this.serialNum = sn;
        this.brand = b;
        this.year = y;
        this.price = p;
    }

//Copy contructor:
    public CellPhone(CellPhone cellObj, long value) {
        this.brand = cellObj.brand;
        this.year = cellObj.year;
        this.price = cellObj.price;
        this.serialNum = value;
    }

//Getter method for all the variables:
    public long getSerialNum() {
        return this.serialNum;
    }
    public String getBrand() {
        return this.brand;
    }
    public int getYear() {
        return this.year;
    }
    public double getPrice() {
        return this.price;
    }

//Setter method for all the variables:
    public void setSerialNum(long sn) {
        this.serialNum = sn;
    }
    public void setBrand(String b) {
        this.brand = b;
    }
    public void setYear(int y) {
        this.year = y;
    }
    public void setPrice(double p) {
        this.price = p;
    }

//Clone() method implemented with Cloneable interface:
    public CellPhone clone() {
        Scanner input = null;
        try {
            System.out.println("Enter a new serial number");
            input = new Scanner(System.in);
            long newSn = input.nextLong();
            CellPhone c = (CellPhone)super.clone();
            c.serialNum = newSn;
            return c;
        }
        catch(CloneNotSupportedException e) {
            System.out.println("Cannot clone CellPhone");
            return null;
        }
        finally {
            if(input != null) {
                input.close();
            }
        }
    }

//toString method:
    public String toString() {
        return "[Brand: " + this.brand + ", Price: " + this.price + ", Year: " + this.year + ", Serial Number: " + this.serialNum + "]";
    }

//equal method:
    public boolean equal(Object o) {
        if((this == null) || (o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        CellPhone cp = (CellPhone)o;
        return (this.brand == cp.brand ||
                this.year == cp.year ||
                this.price == cp.price);
    }
}
