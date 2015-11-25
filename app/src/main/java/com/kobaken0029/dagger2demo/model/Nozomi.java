package com.kobaken0029.dagger2demo.model;

import com.kobaken0029.dagger2demo.entity.Food;
import com.kobaken0029.dagger2demo.entity.Yakiniku;

public class Nozomi implements SchoolIdol {
    public String sing(String songName) {
        return songName == "僕らは○の中で"
                ? "楽しいだけじゃない 試されるだろう"
                : "わしわしMAXやで～";
    }

    public void joinLive(int money) {
        while (true) {
            if (finishedLive()) break;
        }
        goToYakiniku(money);
    }

    private boolean finishedLive() {
        return true;
    }

    private void goToYakiniku(int money) {
        eat(new Yakiniku(money));
    }

    private void eat(Food food) {
        // おいしくご飯を食べるのんたん
    }
}
