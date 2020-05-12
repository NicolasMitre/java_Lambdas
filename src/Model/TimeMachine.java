package Model;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class TimeMachine {
    private LocalDateTime timeM;

    public TimeMachine(){
        timeM = LocalDateTime.now();
    }

    public void setTime(){
        Supplier<LocalDateTime> supplier = LocalDateTime::now;
        timeM = supplier.get();
    }
    public void setTime(Supplier<LocalDateTime> supplier){

        timeM = supplier.get();
    }

    public LocalDateTime getTimeM() {
        return timeM;
    }

}
