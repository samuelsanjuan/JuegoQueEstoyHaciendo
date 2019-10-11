
package intentodevideojuego;
public class Enemigo {
   private double enemyHP, enemyATK, enemyDEF;
   public Enemigo(){}
   public Enemigo(double def,double atk, double hp){enemyDEF=def;enemyATK=atk;enemyHP=hp;}
   public void meterHp(double vida){
    enemyHP=vida;}
   public void meterATK(double atk){
    enemyATK=atk;}
   public void meterDEF(double def){
    enemyDEF=def; }
   public double ATK(){
    return enemyATK;}
   public double DEF(){
       return enemyDEF;}
   public double HP(){
    return enemyHP;
}}