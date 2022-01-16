package chap05;

public class multiArray {
    public static void main(String[] args) {
        int[][] scores = new int[2][3];
        // 배열 변수인 scores 는 길이가 2인 배열 A를 참조. [가로인덱스][세로인덱스] 2X3 행렬.
        // scores[0]에 길이가 3인 배열 B를 참조. scores[1]에 길이가 3인 배열 C를 참조. 위로 쌓아서 오른쪽 아래방향으로 돌려. 끝.
        System.out.println(scores.length + ", " + scores[0].length + ", " + scores[1].length);  // 2, 3, 3

        int[][] eng = new int[2][];
        eng[0] = new int[2];  //
        eng[1] = new int[3];
        for (int i = 0; i < eng.length; i++) {
            for (int j = 0; j < eng[i].length; j++) {
                System.out.println("eng[" + i + "][" + j + "] = " + eng[i][j]);
            }
        }

        int[][] kor = {{95, 80}, {92, 96, 80}};
        for (int i = 0; i < kor.length; i++) {  //kor.length 는 중괄호의 개수이다.
            for (int j = 0; j < kor[i].length; j++) {
                System.out.println("eng[" + i + "][" + j + "] = " + kor[i][j]);
            }
        }
    }
}
