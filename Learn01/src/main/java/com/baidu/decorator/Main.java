package com.baidu.decorator;

public class Main {
    public static void main(String[] args) {
        var troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();

        var clubbedTroll = new ClubbedTrollWrapper(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
    }
}
