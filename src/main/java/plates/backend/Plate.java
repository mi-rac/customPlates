package plates.backend;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Plate implements java.io.Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int plateid;
    private String registrationNumber;
    private boolean sold;
    private double price;

    public Plate(String registrationNumber, boolean sold, double price)
    {
        this.registrationNumber = registrationNumber;
        this.sold = sold;
        this.price = price;
    }

    public Plate() {

    }

    @Override
    public String toString() {
        return "Plate{" +
                "plateid=" + plateid +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", sold=" + sold +
                ", price=" + price +
                '}';
    }

    public int getPlateid() {
        return plateid;
    }

    public void setPlateid(int plateid) {
        this.plateid = plateid;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
