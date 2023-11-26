package jp.ac.uryukyu.ie.e235755;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackTest() {
        int attack = 100;
        Warrior demoWarrior = new Warrior("デモ勇者", 100, attack);
        Enemy slime = new Enemy("スライムもどき", 10, 100);
        for (int i=0;i<3;i++){
            int slimeFirstHitPoint = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            assertEquals(attack*1.5,slimeFirstHitPoint - slime.getHitPoint());
        }
        
    }
}
