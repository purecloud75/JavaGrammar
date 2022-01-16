package chap06.Method;

public class Car {

    int gas;
    int speed;

    Car() {
    }

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }

    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다. (gas잔량: " + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춥니다. (gas잔령: " + gas + ")");
                return;  //얘를 만나는 순간 즉시 종료
            }
        }
    }

    int getSpeed() {
        return speed;
    }

    void KeyTurnOn() {
        System.out.println("키를 돌립니다.");
    }

    void run1() {
        for (int i = 10; i < 50; i += 10) {
            speed = i;
            System.out.println("달립니다. (시속:" + speed + "km/h)");
        }
    }
}
