import java.util.Random;

public class MegaSena {

    public static void main(String[] args) {
        Random generate = new Random();

        //Com While
        /*int counter = 0;
        while (counter < 6){
            int number = generate.nextInt(60);
            System.out.print(number+" ");
            counter++;
        }*/

        //com For
        for(int count = 0; count < 6; count++){
            int number = generate.nextInt(60);
            System.out.print(number+" ");
        }
    }
}
