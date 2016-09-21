package th.in.lordgift.oca.v8;

import jdk.internal.org.objectweb.asm.tree.InnerClassNode;

import java.time.*;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main {
    static {
        System.out.println("I'm static block");
    }

    {
        System.out.println("I'm block");
    }

    Main() {
        System.out.println("I'm comstructor");
    }

    public static void main(String[] args) {
        System.out.println("----- v8 -----");
        // write your code here
        String[] stringArray = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };

        Arrays.sort(stringArray, String::compareToIgnoreCase);

        Arrays.stream(stringArray).forEach(System.out::println);

        Date in = new Date();
        LocalDateTime ldt = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault());
        Date out = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(out);
        System.out.println(Instant.now().getNano());
        System.out.println("inst  "+Instant.now());
        System.out.println("local "+LocalDateTime.now());


        System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));
        System.out.println(LocalDate.of(2015, Month.APRIL, 1));
        System.out.println(LocalDate.of(2015, 3, 1));
        System.out.println(LocalDate.of(2015, 4, 1));
//        System.out.println(new LocalDate(2015, 3, 1));
//        System.out.println(new LocalDate(2015, 4, 1));

        System.out.println(LocalDate.now().until(LocalDate.of(2016, Month.JULY,17)));
        int $d = 1_1_1;
        System.out.println($d+1);
        int s = 022;
        System.out.println(s);
//        java.time.LocalDateTime?,
//                java.time.LocalDate?,
//                java.time.LocalTime?,
//                java.time.format.DateTimeFormatter?,
//                java.time.Period
        Obj obj = new Obj();
        obj = null;
        System.gc();

        byte b1 = 0b101;
        byte b2;
        System.out.println("---------");
        System.out.println(b1);

        boolean b = false;
        if(b=true) {

        }
        int i = 0;
        if((i=1)==(i=2)) {
            System.out.println("true");
        }

        int x=1, y=15;
        while (x<10) {
            y--;
            x++;
            System.out.println(x+", "+y);
        }

        x=1;
        do {
            System.out.println("x"+x++);
        } while (x<5);


        double dd = (50.3-20.6) /10;
        System.out.println(dd);

        StringBuilder ss = new StringBuilder().append("dd").insert(1,"bb");
        System.out.println(ss);


        Secret ms = new MySecret();
        ms.magic(2);

        Secret m = new Secret() {
            @Override
            public String magic(double d) {
                return null;
            }
        };

        Secret m0 = (e) -> "dd";
    }

}

class InFileClass {
    public void cc() {

    }
}


interface Secret {
    String magic(double d);
}

class MySecret implements Secret {
    public String magic(double d) {
        return "Poof";
    }
}
