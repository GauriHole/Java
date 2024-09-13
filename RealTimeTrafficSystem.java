import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TrafficLight {
    private String color;
    private final Lock lock = new ReentrantLock();

    public TrafficLight(String initialColor) {
        this.color = initialColor;
    }

    public void changeColor(String newColor) {
        lock.lock();
        try {
            this.color = newColor;
            System.out.println("Traffic light changed to: " + newColor);
        } finally {
            lock.unlock();
        }
    }

    public String getColor() {
        lock.lock();
        try {
            return this.color;
        } finally {
            lock.unlock();
        }
    }
}

class Intersection {
    private final TrafficLight northSouth;
    private final TrafficLight eastWest;
    private final AtomicBoolean running = new AtomicBoolean(true);

    public Intersection() {
        this.northSouth = new TrafficLight("Green");
        this.eastWest = new TrafficLight("Red");
    }

    public void simulateTraffic() {
        new Thread(() -> {
            while (running.get()) {
                try {
                    Thread.sleep(10000); // 10 seconds
                    changeLights();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread was interrupted");
                }
            }
        }).start();
    }

    private void changeLights() {
        if (northSouth.getColor().equals("Green")) {
            northSouth.changeColor("Red");
            eastWest.changeColor("Green");
        } else {
            northSouth.changeColor("Green");
            eastWest.changeColor("Red");
        }
    }

    public void prioritizeEmergencyVehicle() {
        System.out.println("Emergency vehicle detected! Prioritizing...");
        northSouth.changeColor("Red");
        eastWest.changeColor("Green");
    }

    public void stopSimulation() {
        running.set(false);
    }
}

public class RealTimeTrafficSystem {
    public static void main(String[] args) {
        Intersection intersection = new Intersection();
        intersection.simulateTraffic();

        // Simulate emergency vehicle after 15 seconds
        new Thread(() -> {
            try {
                Thread.sleep(15000); // 15 seconds
                intersection.prioritizeEmergencyVehicle();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Stop the simulation after 20 seconds
        new Thread(() -> {
            try {
                Thread.sleep(20000); // 20 seconds
                intersection.stopSimulation();
                System.out.println("Simulation stopped.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
