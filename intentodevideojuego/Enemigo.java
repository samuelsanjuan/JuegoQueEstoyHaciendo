
package intentodevideojuego;

import java.util.Scanner;

public class Enemigo {
    Scanner sc=new Scanner(System.in);
   private double enemyHP, enemyATK, enemyDEF,exp,gold;
   public Enemigo(){}
   public Enemigo(double def,double atk, double hp, double exp, double gold){enemyDEF=def;enemyATK=atk;enemyHP=hp;this.exp=exp;this.gold=gold;}
   public double getAtk(){return enemyATK;}
   public double getDef(){return enemyDEF;}
   public double getHp(){return enemyHP;}
   public double getGold(){return gold;}
   public void setAtk(double atk){this.enemyATK=atk;}
   public void setDef(double def){this.enemyDEF=def;}
   public void setHp(double hp){this.enemyHP=hp;}
   public void combate(Enemigo enemy, Personaje me)
   {while ((enemy.getHp()>0) && (me.getHp()>0) && (me.getEstamina()>0)){
        System.out.println("que quieres hacer 1=atacar, 2=magia, 3=item, o 4=correr");
    String accion= sc.next();
    switch (accion){
        case "1":{
        System.out.println("que ataque quieres hacer? 1=fuerte 2=ligero 3=defensivo");
        String tipoDeAtaque=sc.next();
        switch(tipoDeAtaque){
                case "1":
            enemy.setHp(enemy.getHp()-(me.getAtk()*1.5-enemy.getDef()));
            me.setEstamina(me.getEstamina()-10);
            me.setHp(me.getHp()-(enemy.getAtk()-me.getDef()));
            System.out.println("al enemigo le queda "+enemy.getHp()+" vida, a ti te queda "+me.getEstamina()+" estamina, y a ti te queda "+me.getHp()+" vida");
                break;
                case "2":
            enemy.setHp(enemy.getHp()-(me.getAtk()-enemy.getDef()));
            me.setEstamina(me.getEstamina()-5);
            me.setHp(me.getHp()-(enemy.getAtk()-me.getDef()));
            System.out.println("al enemigo le queda "+enemy.getHp()+" vida, a ti te queda "+me.getEstamina()+" estamina, y a ti te queda "+me.getHp()+" vida");
                break;
                case "3":
            enemy.setHp(enemy.getHp()-(me.getAtk()-enemy.getDef()));
            me.setEstamina(me.getEstamina()-20);
            me.setHp(me.getHp()-(enemy.getDef()-me.getDef()*1.5));
            System.out.println("al enemigo le queda "+enemy.getHp()+" vida, a ti te queda "+me.getEstamina()+" estamina, y a ti te queda "+me.getHp()+" vida");
                break;
                default:
            System.out.println("pon un numero del 1 al 3");
                break;}}break;
        case "2":
            me.setMana(me.getMana()-25);
            if (me.getMana()>=0){
            System.out.println("vas a usar magia");
            enemy.setHp(enemy.getHp()-(me.getAtk()*3));
            me.setHp(me.getHp()-(enemy.getAtk()-me.getDef()));
            System.out.println("al enemigo le queda "+enemy.getHp()+" vida, a ti te queda "+me.getMana()+" mana, y a ti te queda "+me.getHp()+" vida");
            }else
            System.out.println("no tienes suficiente mana");
            break;
        case "3":System.out.println("las opciones correr y items no estan implementadas aun");break;
        case "4":System.out.println("las opciones correr y items no estan implementadas aun");break;    
  }}
        if (enemy.getHp()<=0){System.out.println("Ganaste, te puedes volver a mover");me.setDinero(me.getDinero()+enemy.getGold());
        }else {System.out.println("perdiste");}}} 
