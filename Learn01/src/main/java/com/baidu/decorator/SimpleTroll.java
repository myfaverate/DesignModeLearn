package com.baidu.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 没有武器的巨魔
 */
@Slf4j
public class SimpleTroll implements Troll{
    @Override
    public void attack() {
        log.info("巨魔尝试去抓住你...");
    }

    /**
     * 返回 10 攻击力
     * @return 返回 10 攻击力
     */
    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {
        log.info("巨魔在恐惧中咆哮，然后逃离战斗...");
    }
}
