import java.text.DecimalFormat;
import java.util.Random;

public class Car implements Runnable {

    double route, speed, time, averageSpeed;
    DecimalFormat dF = new DecimalFormat("#.##");
    public Car(double Route){
        this.route = Route;
    }

    public void run(){
        Random random = new Random();

        while(route > 0){
              double maximum = 120;
              double minimum = 100;
              averageSpeed = minimum;
              speed = random.nextDouble(minimum, maximum);
            //route = route - speed;
              time = route / averageSpeed;
              averageSpeed = (averageSpeed+speed)/2;
              //averageSpeed = (route/speed) * 3600;
              //time = (route/speed) * 3600;
              route = (route - (speed/60/60));

              System.out.println("Ваша скорость: " + dF.format(speed) + " км/ч; "  + " осталось: " + dF.format(route) + " км, " + " вы прибудете через " + dF.format(time) + " ч.");
              System.out.println("Средня скорость равна: " + dF.format(averageSpeed));

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
       // averageSpeed = route / time;
        //System.out.println("Средня скорость равна: " + averageSpeed);
    }
}
//System.out.println(new DecimalFormat( "###,###.##" ).format(74554542.224463));