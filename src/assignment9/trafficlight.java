package assignment9;


class TrafficLight implements Runnable {
    private String color;
    private int duration; // Duration in milliseconds

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    @Override
   synchronized public void run() {
        while (true) {
            System.out.println(color + " light is on");
            try {
                Thread.sleep(duration); // Simulate the duration of the current state
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            changeColor(); // Change the color
        }
    }

    private void changeColor() {
        // Logic to change the color based on the current color
        switch (color) {
            case "Red":
                color = "Green";
                break;
            case "Green":
                color = "Yellow";
                break;
            case "Yellow":
                color = "Red";
                break;
        }
    }

    public static void main(String[] args) {
        TrafficLight redLight = new TrafficLight("Red", 5000); // Red light stays for 5 seconds
        TrafficLight greenLight = new TrafficLight("Green", 7000); // Green light stays for 7 seconds
        TrafficLight yellowLight = new TrafficLight("Yellow", 2000); // Yellow light stays for 2 seconds

        // Create and start threads for each traffic light
        Thread redThread = new Thread(redLight);
        Thread greenThread = new Thread(greenLight);
        Thread yellowThread = new Thread(yellowLight);

        redThread.start();
        greenThread.start();
        yellowThread.start();
    }
}

