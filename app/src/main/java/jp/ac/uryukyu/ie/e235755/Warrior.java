package jp.ac.uryukyu.ie.e235755;

public class Warrior extends LivingThing{
    
    //コンストラクタ
    public Warrior(String name,int hitPoint,int Attack){
        super(name,hitPoint,Attack);
    }

    //メソッド
    public void attackWithWeponSkill(LivingThing opponent){
        int damage = (int)(1.5 * getAttack());
        if (isDead() == false){
            System.out.printf("%sの攻撃！ウェポンスキルを発動!%sに%dのダメージを与えた！！\n",getName(),opponent.getName(),damage);
            opponent.wounded(damage);
        }


    }
    
}
