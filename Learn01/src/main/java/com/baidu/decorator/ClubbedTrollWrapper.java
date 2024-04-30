package com.baidu.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClubbedTrollWrapper implements Troll{

    /**
     * 被装饰的巨魔
     */
    private final Troll decorated;

    public ClubbedTrollWrapper(Troll decorated) {
        this.decorated = decorated;
    }

    @Override
    public void attack() {
        decorated.attack(); // 咬敌人
        log.info("巨魔挥舞着棒球棒殴打敌人...");
    }

    @Override
    public int getAttackPower() {
        return decorated.getAttackPower() + 10; // 战力再加 10
    }

    @Override
    public void fleeBattle() {
        decorated.fleeBattle(); // 逃跑就无需增强了...
    }
}
