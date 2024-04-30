package com.baidu.decorator;

/**
 * 巨魔接口
 */
public interface Troll {
    /**
     * 攻击
     */
    void attack();

    /**
     * 获取战力
     * @return 数值
     */
    int getAttackPower();

    /**
     * 逃离战斗
     */
    void fleeBattle();
}
