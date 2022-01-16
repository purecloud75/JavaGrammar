package chap07.Test3;

import java.util.ArrayList;

public class Player {
    public static void main(String[] args) {

        ArrayList<PlayerLevel> levels = new ArrayList<>();

        levels.add(new Beginner());
        levels.add(new Advanced());
        levels.add(new Super());

        for (int i = 0; i < levels.size(); i++) {
            PlayerLevel level = levels.get(i);
            level.go(i+1);
        }
    }
}
