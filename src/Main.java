import Interface.INumber;
import Model.TimeMachine;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.IOException;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        /*INumber<Integer> namber = ( n,  m) -> n/m;
        System.out.println(namber.module(10,2));
        TimeMachine timeMachine = new TimeMachine();
        System.out.println(timeMachine.getTimeM());
        BiFunction<String,String,Integer> elBi = (word1,word2) -> word1.length()+word2.length();
        System.out.println(elBi.apply("Hola","Mundo"));*/
        Function<String,Integer> largoString = (s)-> {
            if(s.length() > 1){
                return s.length();
            }else{
                try {
                    throw new IOException();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

            System.out.println(largoString.apply("pepepe"));


        BiConsumer<Integer,String> biConsumer = (k,v) ->  {
            if(v.length() > 10){
                System.out.println("Key : "+ k + "|| Value : "+v);
            }else{
                System.out.println("Otra Cosa Mariposa");
            }
        };
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Pepito");
        map.put(2,"TutanKamonka");
        map.put(3,"Martin");
        map.put(4,"Michael Jordan");
        map.forEach(biConsumer);

        TimeMachine timeMachine = new TimeMachine();
        timeMachine.setTime(LocalDateTime::now);
        System.out.println(timeMachine.getTimeM());
    }
}
