import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){
        String first_service_name = "test";
        int first_service_duration_in_minutes = 50;
        int first_service_price = 10000;

        System.out.println("First Service");

        //creating service
        ServiceClass first_service = new ServiceClass(first_service_name, first_service_duration_in_minutes, first_service_price);

        first_service.showAll();

        //creating schedule
        ScheduleClass schedule = new ScheduleClass();
        LocalDateTime now = LocalDateTime.now();
        schedule.addBookToSchedule(first_service, now);
        schedule.addBookToSchedule(first_service, now);
        schedule.showSchedule();

    }
}
