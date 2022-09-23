import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ScheduleClass {
    int array_size = 0;
    ServiceClass array[] = new ServiceClass[array_size];
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy : HH mm ss");

    // Adding component to schedule
    public void addBookToSchedule(ServiceClass service, LocalDateTime date_time){
        service.schedule_time = date_time;
        if (this.array_size !=0) {
            ServiceClass new_array[] = new ServiceClass[this.array_size + 1];
            for (int i = 0; i < this.array_size ; i++) {
                new_array[i] = this.array[i];
            }
            new_array[this.array_size] = service;
            this.array = new_array;
            this.array_size++;
        }else{
            this.array_size++;
            ServiceClass new_array[] = new ServiceClass[this.array_size];
            new_array[0] = service;
            this.array = new_array;
        }
    }

    // Show Schedule
    public void showSchedule(){
        System.out.println("                --Schedule--");
        for (int i = 0; i < this.array_size; i++){
            System.out.println("    Time:" + array[i].schedule_time.format(this.formatter));
            System.out.println("        Service Item:");
            this.array[i].showAll();
        }
    }
}
