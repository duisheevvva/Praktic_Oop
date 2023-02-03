import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//          TODO Tapshyrma1
    /*   Passport passport=new Passport();
        passport.lastname="Ysmailov";
        passport.firstname="Raiym";
        passport.surname="Ysmailovich";
        passport.gender="E/M";
        passport.country="Kyrgyzstan Republic";
        passport.ID=1877213;


        System.out.println("Familia:"+ passport.lastname
                +"\n"+"Imy:"+passport.firstname
                +"\n"+"Ochestvo:"+passport.surname
                +"\n"+"Pol:"+passport.gender
                +"\n"+"Strana:"+passport.country
                +"\n"+"Data roshdenia:"+passport.date
                +"\n"+"ID:"+passport.ID); */


//        TODO Tapshyrma2
      /*  Scanner sc=new Scanner(System.in);
      Seasons seasons1=new Seasons();
        seasons1.seasons(sc.nextInt()); */


//          TODO Tapshyrma3
        Student student1 = new Student();
        student1.name = "Oksana Saidilkanova";
        student1.age = 20;
        student1.group = "Java";

        Student student2 = new Student();
        student2.name = "Tilek uulu Ernazar";
        student2.age = 20;
        student2.group = "Java";


        Student student3 = new Student();
        student3.name = "Sanzhar Abdymomunov";
        student3.age = 20;
        student3.group = "Java";

        Student student4 = new Student();
        student4.name = "Nuridinov Kairat";
        student4.age = 18;
        student4.group = "Js";

        Student student5 = new Student();
        student5.name = "Turgunbaev Eldan";
        student5.age = 17;
        student5.group = "Js";

       Student[]array={student1,student2,student3,student4,student5};
       int counter=0;
       int counter2=0;

        for (int i = 0; i < array.length; i++) {
            if(array[i].group.equals("Java")){
                counter++;
            } else if (array[i].group.equals("Js")){
                counter2++;
            }

        }
        System.out.println("Java:"+counter);
        System.out.println("Js:"+counter2);


    }
}