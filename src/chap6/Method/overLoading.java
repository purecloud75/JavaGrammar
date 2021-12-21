package chap6.Method;

public class overLoading {

    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double plus(double x, double y) {
        double result = x + y;
        return result;
    }

    double areaRec(double width) {
        return width * width;
    }

    double areaRec(double width, double height) {
        return width * height;
    }
}
