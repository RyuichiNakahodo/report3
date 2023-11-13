package jp.ac.uryukyu.ie.e235755;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * 名前を参照するメソッド
     * @return　name
     */
    public String getName(){
        return name;
    }
    /**
     * 名前を設定するメソッド
     * @param s 設定したい名前
     */
    public void setName(String s){
        this.name = s;
    }

    /**
     * HPを参照するメソッド
     * @return　hitPoint
     */
    public int getHitPoint(){
        return hitPoint;
    }
    /**
     * HPを設定するメソッド
     * @param i 設定したいHP
     */
    public void setHitPoint(int i){
        this.hitPoint = i;
    }

    /**
     * 攻撃力を参照するメソッド
     * @return　attack 
     */
    public int getAttack(){
        return attack;
    }
    /**
     * 攻撃力を設定するメソッド
     * @param i　設定したい攻撃力
     */
    public void setAttack(int i){
        this.attack = i;
    }

    /**
     * 生死状態を参照するメソッド
     * @return　dead
     */
    public boolean getDead(){
        return dead;
    }
    /**
     * 生死状態を設定するメソッド
     * @param b　設定したい生死状態
     */
    public void setDead(boolean b){
        this.dead = b;
    }

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param hero 攻撃対象
     */
    public void attack(Hero hero){
        int damage = (int)(Math.random() * attack);
        if (dead == false){
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n",name, hero.getName(), damage);
            hero.wounded(damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

}
