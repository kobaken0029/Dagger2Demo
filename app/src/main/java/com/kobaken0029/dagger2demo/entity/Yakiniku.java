package com.kobaken0029.dagger2demo.entity;

public class Yakiniku extends Food {
    private String niku;

    public Yakiniku(int money) {
        if (money < 1000) {
            niku = "鶏肉";
        } else if (money >= 1000 && 2000 > money) {
            niku = "豚肉";
        } else {
            niku = "最高級国産牛肉";
        }
    }

    public String getNiku() {
        return niku;
    }

    public void setNiku(String niku) {
        this.niku = niku;
    }
}
