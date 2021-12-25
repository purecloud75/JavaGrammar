package chap6.PandL;

import chap6.FandC.*;
import chap6.IandS.*;


public class ImportExam {
    Korean p1 = new Korean("John","123-456");

    chap6.FandC.Car car1 = new chap6.FandC.Car();
    //해당 클래스의 생성자를 public 해주면 오류 안나고 잘 된다.
    //이렇게 클래스 전체이름을 쓰게되면 import 문이 없어도 해당 클래스가 public 이기만 해도 이렇게 다른 패키지의 클래스에서 접근가능하다.

    chap6.IandS.Car car2 = new chap6.IandS.Car("벤츠");
    //다른 패키지에 동일한 이름의 클래스가 있다면, 클래스의 전체이름으로 타입을 써 준다.

    Calculator calc1 = new Calculator();
    //생성자가 선언되어있지않아 디폴트생성자가 자동으로 생긴 경우는 오류가 안난다. 해당 클래스의 접근레벨이 public 이기에 그대로 따라해서
}
//결론은 가져오고싶은 클래스는 public level 이면서 동시에 import 로 가져와야 한다.