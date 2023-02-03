public class Seasons {
    String seasons;

    void  seasons(int a) {
        if (a <= 2 && a >= 1) {
            System.out.println("winter");
        } else if (a>=3&&a<=5) {
            System.out.println("Spring");
        } else if (a>=6&&a<=8) {
            System.out.println("Summer");
        } else if (a>=9&&a<=11) {
            System.out.println("Autumn");
        } else if (a==12) {
            System.out.println("Winter");
        }else {
            System.out.println("Eror");
        }


    }




}
