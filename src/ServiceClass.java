import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ServiceClass {
    String name;
    int duration_in_minutes;
    int price;
    LocalDateTime schedule_time;

    //Конструктор класса где мы присваеваем значения
    public ServiceClass(String name, int duration_in_minutes ,int price) {
        this.name = name;
        this.duration_in_minutes = duration_in_minutes;
        this.price = price;
        System.out.println("Constructor was succesfull");
    }
    // Name Getter
    public String getName() {
        return name;
    }

    // Name Setter
    public void setName(String newName) {
        this.name = newName;
    }

    // Duration Getter
    public int getDurationInMinutes() {
        return duration_in_minutes;
    }

    // Duration Setter
    public void setDurationInMinutes(int duration_in_minutes) {
        this.duration_in_minutes = duration_in_minutes;
    }
    // Price Getter
    public int getPrice() {
        return price;
    }

    // Price Setter
    public void setPrice(int price) {
        this.price = price;
    }
    public void showAll(){
        System.out.println("Service name : " + this.name);
        int duration_hour = this.duration_in_minutes / 60;
        if (duration_hour >= 1 ){
            int duration_minutes = duration_in_minutes - (duration_hour * 60);
            System.out.println("Hours : " + duration_hour + " Minutes : " + duration_minutes);
        }else{
            System.out.println("Minutes : " + this.duration_in_minutes);
        }
        System.out.println("Price : " + this.price);
    }
}
