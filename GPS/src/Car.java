import java.util.Random;

public class Car implements Runnable {

    int route, speed, time, averageSpeed;

    public Car(int Route){
        this.route = Route;
    }

    public void run(){
        Random random = new Random();

        while(route >= 0 & route - speed > 0){

              speed = random.nextInt(100, 120);
            //route = route - speed;
              time = route / speed;
              //averageSpeed = route / time;
              //averageSpeed = (route/speed) * 3600;
              //time = (route/speed) * 3600;
              route = route - speed;

              System.out.println("Ваша скорость: " + speed + " м/с; "  + " осталось: " + route + " м, " + " вы прибудете через " + time + " с.");
            //System.out.println("Средня скорость равна: " + averageSpeed);
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
