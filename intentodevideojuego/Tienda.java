
package intentodevideojuego;

import java.util.Scanner;

/**
 *
 * @author ssanjuanandres
 */
public class Tienda {
        Scanner sc=new Scanner(System.in);
        private double atkComprado, defComprada, hpComprada, manaComprado, estaminaComprada;
        public Tienda(double atkComprado,double defComprada,double hpComprada, double manaComprado, double estaminaComprada){
            this.atkComprado=atkComprado;this.defComprada=defComprada;this.hpComprada=hpComprada;this.estaminaComprada=estaminaComprada;this.manaComprado=manaComprado;
        }
        public Tienda (){}
        
                
                
                
                
    
    public void activarTienda(Personaje me, Tienda tn){
  System.out.println("hola soy la tienda, que quieres comprar, tienes "+me.getDinero()+" dineros");
System.out.println("1=mejora de daño, 2=mejora de vida 3=mejora de mana 4=mejora de defensa");
 me.setEstamina(me.getEstTot());
 me.setHp(me.getHpTot());
 me.setMana(me.getManaTot());
String tienda=sc.next();
if (me.getDinero()>=10){
switch (tienda){
    case "1":
        atkComprado=5;
        me.setAtk(me.getAtk()+atkComprado);
        System.out.println("has comprado 5 de daño a cambio de 10 dineros, te quedan "+(me.getDinero()-10)+" monedicas");
        me.setDinero(me.getDinero()-10);
        break;
    case "2":
        hpComprada=25;
        me.setHpTot(me.getHpTot()+hpComprada);
        me.setHp(me.getHpTot());
        System.out.println("has comprado 25 de vida a cambio de 10 dineros, te quedan "+(me.getDinero()-10)+" monedicas");
        me.setDinero(me.getDinero()-10);
        break;
    case "3":
        defComprada=1;
        me.setDef(me.getDef()+defComprada);
        System.out.println("has comprado 1 de defensa a cambio de 10 dineros, te quedan "+(me.getDinero()-10)+" monedicas");
        me.setDinero(me.getDinero()-10);
        break;
    case "4":
        manaComprado=25;
        me.setManaTot(manaComprado+me.getManaTot());
        me.setMana(me.getManaTot());
        System.out.println("has comprado 25 de mana a cambio de 10 dineros, te quedan "+(me.getDinero()-10)+" monedicas");
        me.setDinero(me.getDinero()-10);
        break;
    default:
        System.out.println("buen viaje");break;
}}
else{System.out.println("muevete!!, no tienes suficiente dinero");}
}}

