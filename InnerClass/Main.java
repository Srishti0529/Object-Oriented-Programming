package InnerClass;

import java.util.*;

class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public void performAction() {
        System.out.println(name + " is performing an action.");
    }

    // Non-static inner class
    class Arm {
        public void pickItem() {
            System.out.println(name + " arm picking an item.");
        }
    }

    // Static nested class
    static class Processor {
        public void process() {
            System.out.println("Processor analyzing the data.");
        }
    }

    // Method demonstrating a local inner class
    public void manageSensors() {
        class Sensor {
            public void sense() {
                System.out.println(name + " sensor detecting obstacles.");
            }
        }

        Sensor sensor = new Sensor();
        sensor.sense();
    }

    // Anonymous inner class
    public void executeTask() {
        Task task = new Task() {
            @Override
            public void execute() {
                System.out.println(name + " executing a custom task.");
            }
        };
        task.execute();
    }

    interface Task {
        void execute();
    }
}

class Main {
    public static void main(String[] args) {
        // Hardcoded input
        String name = "Robot-1";

        // Create Robot object
        Robot robot = new Robot(name);

        // Call methods to demonstrate the inner classes and task
        robot.performAction();

        Robot.Arm arm = robot.new Arm();
        arm.pickItem();

        Robot.Processor processor = new Robot.Processor();
        processor.process();

        robot.manageSensors();

        robot.executeTask();
    }
}
