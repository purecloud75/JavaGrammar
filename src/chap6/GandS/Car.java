package chap6.GandS;

public class Car {

    //필드
    private int speed;
    private boolean stop;

    //생성자. 없으니까 디폴트생성자 자동생성 by 컴파일러

    //메소드
    //carExam 클래스는 Car 클래스와 같은 패키지에 있으니까 굳이 public 을 안 붙여도(=default) 이 메소드는 얼마든지 저기서 쓰일 수 있다.
    int getSpeed() {
        return speed;
    }
    //위에처럼 (default)이거나 아래처럼 protected 이거나 같은패키지의 클래스에서는 접근가능하지만, 그럼에도 public 으로 하는게 확실하다.
    protected void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }

    public boolean isStop() {  //boolean 타입의 필드를 리턴할때에는 관례적으로 getStop 대신 isStop 을 써준다.
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        this.speed = 0;
    }
}

/*
객체의 필드를 직접 접근하는것을 막는다. 속도에 음수가 입력되는건 말이 안되잖아. 그래서 이러한 문제점을 해결하기 위해
메소드를 통해서 필드를 변경하는 방법을 선호한다. 필드를 읽어올때에도 메소드를 사용하는 것이 좋다고 한다.
필드는 프라이빗, 필드를 초기화(setter)하거나 필드를 리턴(getter)하는 용도의 메소드는 공개(다른패키지에서도 쓰게한다면 public 이 좋겠지)
해서 메소드를 통해 필드에 접근하도록 유도한다. 속도가 음수라면 속도 0이고 바로 리턴때려서 일종의 "검증과정" 을 거친다고 보면 된다.
 */