package jp.ac.uryukyu.ie.e235755;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * 名前を参照するメソッド
     * @return　name
     */
    public String getName(){
        return this.name;
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
        return this.hitPoint;
    }
    /**
     * HPを設定するメソッド
     * @param h 設定したいHP
     */
    public void setHitPoint(int h){
        this.hitPoint = h;
    }

    /**
     * 攻撃力を参照するメソッド
     * @return　attack 
     */
    public int getAttack(){
        return this.attack;
    }
    /**
     * 攻撃力を設定するメソッド
     * @param a　設定したい攻撃力
     */
    public void setAttack(int a){
        this.attack = a;
    }

    /**
     * 生死状態を参照するメソッド
     * @return　dead
     */
    public boolean getDead(){
        return this.dead;
    }
    /**
     * 生死状態を設定するメソッド
     * @param d　設定したい生死状態
     */
    public void setDead(boolean d){
        this.dead = d;
    }


    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Enemyへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param e 攻撃対象
     */
    public void attack(Enemy e){
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, e.getName(), damage);
        e.wounded(damage);
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
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}
