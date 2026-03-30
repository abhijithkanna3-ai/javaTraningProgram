import java.util.*;

// 🔴 Abstract Device
abstract class Gaget {
    abstract void turnOn();
    abstract void turnOff();
}

// 🔴 Light Device
class Light extends Gaget {
    @Override
    void turnOn() {
        System.out.println("Light ON");
    }

    @Override
    void turnOff() {
        System.out.println("Light OFF");
    }
}

// 🔴 AC Device
class Ac extends Gaget {
    @Override
    void turnOn() {
        System.out.println("AC ON");
    }

    @Override
    void turnOff() {
        System.out.println("AC OFF");
    }
}

// 🔴 Trigger Interface
interface Trigger {
    boolean isTriggered();
}

// 🔴 Motion Trigger
class MotionTrigger implements Trigger {
    boolean motion;

    MotionTrigger(boolean motion) {
        this.motion = motion;
    }

    public boolean isTriggered() {
        return motion;
    }
}

// 🔴 Temperature Trigger
class TempTrigger implements Trigger {
    int temp;

    TempTrigger(int temp) {
        this.temp = temp;
    }

    public boolean isTriggered() {
        return temp > 30;
    }
}

// 🔴 Time Trigger
class TimeTrigger implements Trigger {
    int time;

    TimeTrigger(int time) {
        this.time = time;
    }

    public boolean isTriggered() {
        return time == 19; // 7 PM
    }
}

// 🔴 Action Interface
interface Action {
    void execute();
}

// 🔴 Turn ON Action
class TurnOnAction implements Action {
    Gaget device;

    TurnOnAction(Gaget device) {
        this.device = device;
    }

    public void execute() {
        device.turnOn();
    }
}

// 🔴 Turn OFF Action
class TurnOffAction implements Action {
    Gaget device;

    TurnOffAction(Gaget device) {
        this.device = device;
    }

    public void execute() {
        device.turnOff();
    }
}

// 🔴 Rule Class (HAS-A relationship)
class Rule {
    Trigger trigger;
    Action action;

    Rule(Trigger trigger, Action action) {
        this.trigger = trigger;
        this.action = action;
    }

    void checkAndRun() {
        if (trigger.isTriggered()) {
            action.execute();
        }
    }
}

// 🔴 Main Class
public class Task9 {
    public static void main(String[] args) {

        // Devices
        Light light = new Light();
        Ac ac = new Ac();

        // Triggers
        MotionTrigger motion = new MotionTrigger(true);
        TempTrigger temp = new TempTrigger(35);
        TimeTrigger time = new TimeTrigger(19);

        // Actions
        TurnOnAction lightOn = new TurnOnAction(light);
        TurnOnAction acOn = new TurnOnAction(ac);

        // Rules
        Rule r1 = new Rule(motion, lightOn);
        Rule r2 = new Rule(temp, acOn);
        Rule r3 = new Rule(time, lightOn);

        // Execute Rules
        r1.checkAndRun();
        r2.checkAndRun();
        r3.checkAndRun();
    }
}