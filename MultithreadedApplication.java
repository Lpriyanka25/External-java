import java.util.Random;

class RandomNumberThread extends Thread {
    public void run() {
        try {
            Random random = new Random();
            while (true) {
                int number = random.nextInt(100); // Generate a random integer (0-99)
                System.out.println("Generated Number: " + number);

                // Create and start SquareThread and CubeThread
                Thread squareThread = new SquareThread(number);
                Thread cubeThread = new CubeThread(number);
                squareThread.start();
                cubeThread.start();

                // Sleep for 2 seconds before generating the next number
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("RandomNumberThread interrupted: " + e.getMessage());
        }
    }
}

class SquareThread extends Thread {
    private final int number;

    public SquareThread(int number) {
        this.number = number;
    }

    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + ": " + square);
    }
}

class CubeThread extends Thread {
    private final int number;

    public CubeThread(int number) {
        this.number = number;
    }

    public void run() {
        int cube = number * number * number;
        System.out.println("Cube of " + number + ": " + cube);
    }
}

public class MultithreadedApplication {
    public static void main(String[] args) {
        RandomNumberThread randomThread = new RandomNumberThread();
        randomThread.start(); // Start the random number generation thread
    }
}