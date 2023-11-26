package jp.ac.uryukyu.ie.e235755;

public class LivingThing {
    //フィールド
    private String name;
    private int hitPoint;
    private int Attack;
    private boolean dead;

    //コンストラクタ
    public LivingThing(String name,int hitPoint,int Attack){
        this.name = name;
        this.hitPoint = hitPoint;
        this.Attack = Attack;
        this.dead = false;
    }
    //メソッド
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int attack) {
        Attack = attack;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }
    
    public void attack(LivingThing opponent){
        int damage = (int)(Math.random() * Attack);
        if (dead == false){
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n",name,opponent.getName(),damage);
            opponent.wounded(damage);
        }
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
    
}
