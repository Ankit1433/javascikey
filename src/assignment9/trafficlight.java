package assignment9;

import java.util.concurrent.Semaphore;


class car extends  Thread{
    String name;
    Semaphore sem;
    car(String name,Semaphore sem)
    {
        this.name = name;
       this.sem = sem;
    }

    @Override
    public void run() {
        System.out.println(name+ " car arrived!!");
        try {
            sem.acquire();
            System.out.println(name+" car is doing its work!!");
            sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sem.release();
        System.out.println(name+" is leaving!!");
    }
}
class trafficlight{
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(3);
        car c = new car("car1",sem);
        car c2 = new car("car2",sem);
        car c3 = new car("car3",sem);
        car c4 = new car("car4",sem);
        car c5 = new car("car5",sem);

        c.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
    }
}


//
//class TrafficLight implements Runnable {
//    private String color;
//    private int duration; // Duration in milliseconds
//
//    public TrafficLight(String color, int duration) {
//        this.color = color;
//        this.duration = duration;
//    }
//
//    @Override
//   synchronized public void run() {
//        while (true) {
//            System.out.println(color + " light is on");
//            try {
//                Thread.sleep(duration); // Simulate the duration of the current state
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//                return;
//            }
//            changeColor(); // Change the color
//        }
//    }
//
//    private void changeColor() {
//        // Logic to change the color based on the current color
//        switch (color) {
//            case "Red":
//                color = "Green";
//                break;
//            case "Green":
//                color = "Yellow";
//                break;
//            case "Yellow":
//                color = "Red";
//                break;
//        }
//    }
//
//    public static void main(String[] args) {
//        TrafficLight redLight = new TrafficLight("Red", 5000); // Red light stays for 5 seconds
//        TrafficLight greenLight = new TrafficLight("Green", 7000); // Green light stays for 7 seconds
//        TrafficLight yellowLight = new TrafficLight("Yellow", 2000); // Yellow light stays for 2 seconds
//
//        // Create and start threads for each traffic light
//        Thread redThread = new Thread(redLight);
//        Thread greenThread = new Thread(greenLight);
//        Thread yellowThread = new Thread(yellowLight);
//
//        redThread.start();
//        greenThread.start();
//        yellowThread.start();
//    }
//}
//
