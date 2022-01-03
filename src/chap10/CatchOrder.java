package chap10;

public class CatchOrder {
    public static void main(String[] args) {

        String[] arr1 = null;
        double[] arr2 = new double[]{10, 20, 30};

        //코드 중에서 예외가 발생할 것 같은 코드 일부에 이 문법을 적용하는데 try{} 안에 집어넣는다. 만약 try 안에서 예외가 발생했다면
        //그 즉시 try 문은 중단하고 바로 catch 로 오는데, 해당 예외클래스의 객체에 맞는 타입의 매개변수 e를 갖는 catch 문을 찾아 들어감
        //들어가서 실행문을 실행한 후 finally{}로 들어와서 실행. 예외없이 정상실행되면 try{} 다 실행하고 catch 건너뛰고 또 finally{}.
        try {
            String data1 = arr1[0];
            String data2 = arr1[1];

            double num1 = arr2[1];
            double num2 = arr2[3];

            int value1 = Integer.parseInt("123");
            int value2 = Integer.parseInt("34a");
        }
        //프로그램 실행 도중에 예외가 발생하면 해당 예외클래스의 객체가 생성되고, 그 객체의 타입에 맞는 catch 문을 찾아서 들어와 실행문 실행
        catch (NullPointerException e) {
            System.out.println("객체를 참조하세요.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 인덱스를 수정하세요.");
        }
        catch (NumberFormatException e) {
            System.out.println("문자열에 숫자로 변환할 수 없는 문자가 포함되어 있으니 수정하세요.");
        }
        catch (ClassCastException e) {
            System.out.println("인터페이스와 구현객체간의, 부모타입과 자식타입간의 타입변환에서의 오류이니 둘의 관게를 다시 살펴보세요.");
        }
        //이상 초보 개발자가 가장 많이 마주하는 4개의 대표적인 예외들(예외클래스타입의 객체)를 살펴보았고 잘 모르겠으면 전체 다루는 아래처럼!
        catch (Exception e) {
            System.out.println("실행에 문제가 있습니다.");
        }
        //finally 는 try 에서 예외가 생기던 정상실행되면 무조건 실행되고, return 문도 안통함. 무조건 실행됨.
        finally {
            System.out.println("다시 실행하세요");
        }
    }
}

/*
data2
예외처리를 배운다. try, catch x N, (finally) 로 예외처리를 해준다. 혹은 throws Exception 종류 로 떠넘겨서 호출된 곳에서 예외처리 한다.
예외란 개발자의 잘못된 코딩으로 인해 발생하는 프로그램 오류. 예외처리를 통해 프로그램 종료하지 않고 정상실행 상태 유지시키고 원인 파악가능.
여기서 원인파악은 catch(얘일거라고 의심되는 예외종류) {여기서 괄호안의 예외를 내가 알아듣게끔 한글이든 영어든 해서 출력하면 바로 내가 파악가능}

JVM 은 프로그램 실행 도중에 예외가 발생하면 해당 예외 클래스로 객체를 생성한다. 그리고 나서 예외 처리코드에서 생성된 예외객체를
이용 할 수 있도록 해준다. 모든 예외 클래스는 java.lang.Exception 클래스를 상속 받는다.
일반예외 : 컴파일러 체크예외. 컴파일러가 빨간줄로 알려준다.
실행예외 : 오로지 개발자의 경험에 의해 예외 처리코드 작성해야. RuntimeException 의 하위클래스이면 다 여기. 아니면 다 일반예외.

다중 catch 문 이용시 주의사항 :
상위예외클래스(Exception)을 아래에 두어야 한다. catch 문은 위에서부터 아래로 알맞는 타입의 catch 문을 검색하는데 상위예외클래스가
위에 있다면 부모타입의 매개변수에 부모객체와 자식타입(자동타입변환)까지 모두 올수있는 것을 고려하였을 때, 자칫 위에 적어놓은 상위클래스만
계속해서 실행될 우려가 있다. 우리의 의도와 다르게 작동하므로 주의

try{} 에서 예외를 만나면 그 즉시 종료하고 바로 해당하는 catch 로 가므로 하나의 예외를 찾고 내가 알맞게 잘 적어놓은 출력문을 보고
예외를 잘 처리하였으면(오류를 잘 수정하였으면) try 에서 그 부분은 지우고 다시 돌려본다.
발견 즉시 try 문을 바로 종료해버리니까 한번에 하나의 예외밖에 못 찾기때문이다.
 */