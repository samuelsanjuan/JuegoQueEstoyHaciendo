package intentodevideojuego;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ssanjuanandres
 */
public class IntentoDeVideojuego {
    public static void main(String[] args) {
//me gustaria aclarar que nunca e programado nada mas que operaciones metematicas simples por lo que estoy orgulloso de esto
//si alguien me puede decir como para mostrar cosas graficamente en plan pixeles y tal me molaria bastante la verdad
        System.out.println("Te mueves con a,w,s,d, empiezas en la casilla 22. ");
        System.out.println("Tu objetivo es llegar a la casilla 44, en la casilla 43 y 24 hay enemigos, horizontalmente te mueves de 10 en 10 y verticalemtnte de 1 en 1");  
 
//estadiscticas tuyas
double manaComprado=0 ,estComprada=0, defComprada = 0,hpComprada = 0,atkComprado = 0,lvl= 1.0, hp=50+hpComprada, atk=10+atkComprado ,def=2+defComprada, estamina=100+estComprada, mana=25+manaComprado,dineros=0, estTot=100, hpTot=50, manaTot=25;
        
        //dibujamos el mapa
    Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
linkedHashMap.put(11,"obstaculo");
linkedHashMap.put(12,"obstaculo");
linkedHashMap.put(13,"obstaculo");
linkedHashMap.put(14,"obstaculo");
linkedHashMap.put(21,"obstaculo");
linkedHashMap.put(22,"nada");
linkedHashMap.put(23,"nada");
linkedHashMap.put(24,"enemy");
linkedHashMap.put(31,"obstaculo");
linkedHashMap.put(32,"nada");
linkedHashMap.put(33,"nada");
linkedHashMap.put(34,"nada");
linkedHashMap.put(41,"obstaculo");
linkedHashMap.put(42,"tienda");
linkedHashMap.put(43,"enemy");
linkedHashMap.put(44,"objetivo");
linkedHashMap.put(15,"obstaculo");
linkedHashMap.put(25,"obstaculo");
linkedHashMap.put(35,"obstaculo");
linkedHashMap.put(45,"obstaculo");
linkedHashMap.put(51,"obstaculo");
linkedHashMap.put(52,"obstaculo");
linkedHashMap.put(53,"obstaculo");
linkedHashMap.put(54,"obstaculo");
linkedHashMap.put(55,"obstaculo");



//gestion de movimineto
int tuPosicion=22;
//el valor que le pongas al while es el objetivo
while (tuPosicion!=44){
    Scanner sc=new Scanner(System.in);
        String movimiento= sc.nextLine();
switch (movimiento) {
    case "a":
        System.out.println(linkedHashMap.get(tuPosicion-10));
        if ("obstaculo".equals(linkedHashMap.get(tuPosicion-10))) {
        System.out.println("te has chocado");
        } else {tuPosicion=tuPosicion-10;}
        System.out.println("ahora estas en "+tuPosicion );
        break;
    case "s":
        System.out.println(linkedHashMap.get(tuPosicion+1));
       if ("obstaculo".equals(linkedHashMap.get(tuPosicion+1))) {
        System.out.println("te has chocado");
        } else {tuPosicion=tuPosicion+1;}
        System.out.println("ahora estas en "+tuPosicion );
        break;
    case "w":
        System.out.println(linkedHashMap.get(tuPosicion-1));
        if ("obstaculo".equals(linkedHashMap.get(tuPosicion-1))) {
        System.out.println("te has chocado");
        } else {tuPosicion=tuPosicion-1;}
        System.out.println("ahora estas en "+tuPosicion );
        break;
    case "d":
        System.out.println(linkedHashMap.get(tuPosicion+10));
        if ("obstaculo".equals(linkedHashMap.get(tuPosicion+10))) {
        System.out.println("te has chocado");
        } else {tuPosicion=tuPosicion+10;}
        System.out.println("ahora estas en "+tuPosicion );
        break;    
    default:
        System.out.println("te mueves con asdw");
        break;    
}

//tienda
if ("tienda".equals(linkedHashMap.get(tuPosicion))){
System.out.println("hola soy la tienda, que quieres comprar, tienes "+dineros+" dineros");
System.out.println("1=mejora de daño, 2=mejora de vida 3=mejora de mana 4=mejora de defensa");
 estamina=estTot;
 hp=hpTot;
 mana=manaTot;
String tienda=sc.next();
if (dineros>10){
switch (tienda){
    case "1":
        
        atkComprado=5;
        atk=atk+atkComprado;
        System.out.println("has comprado 5 de daño a cambio de 10 dineros, te quedan "+(dineros-10)+" monedicas");
        dineros=dineros-10;
        break;
    case "2":
        
        hpComprada=25;
        hpTot=hpTot+hpComprada;
        hp=hpTot;
        System.out.println("has comprado 25 de vida a cambio de 10 dineros, te quedan "+(dineros-10)+" monedicas");
        dineros=dineros-10;
        break;
    case "3":
        defComprada=1;
        def=def+defComprada;
        System.out.println("has comprado 1 de defensa a cambio de 10 dineros, te quedan "+(dineros-10)+" monedicas");
        dineros=dineros-10;
        break;
    case "4":
        manaComprado=25;
        manaTot=manaTot+manaComprado;
        mana=manaTot;
        System.out.println("has comprado 25 de mana a cambio de 10 dineros, te quedan "+(dineros-10)+" monedicas");
        break;
    default:
        System.out.println("buen viaje");break;
}}
else{System.out.println("muevete, no tienes suficiente dinero");}

}

if ("enemy".equals(linkedHashMap.get(tuPosicion))){       
// estadisticas de los enemigos
       Enemigo limo=new Enemigo();
       limo.meterATK(5);
       limo.meterDEF(0);
       limo.meterHp(15);
       Enemigo lobo=new Enemigo ();
       lobo.meterATK(10);
       lobo.meterDEF(3);
       lobo.meterHp(25);
       Enemigo bandido= new Enemigo();
       bandido.meterATK(20);
       bandido.meterDEF(5);
       bandido.meterHp(100);
               

System.out.println("contra quien te quieres enfrentar 1(limo) 2(lobo) o 3(bandido)?(aun no tienes herraminetas para ganarle al bandido)");
String enemyType=sc.next();

switch (enemyType){
    case "1":{
        while ((limo.HP()>0) && (hp>0) && (estamina>0)){
        System.out.println("que quieres hacer 1=atacar, 2=magia, 3=item, o 4=correr");
    String accion= sc.next();
    
    switch (accion){
        case "1":{
            
        System.out.println("que ataque quieres hacer? 1=fuerte 2=ligero 3=defensivo");
        String tipoDeAtaque=sc.next();
        
        //ataque fuerte
            switch(tipoDeAtaque){
                case "1":
            limo.meterHp(limo.HP()-(atk*1.5-limo.DEF()));
            estamina=estamina-10;
            hp=hp-(limo.ATK()-def);
            System.out.println("al enemigo le queda "+limo.HP()+" vida, a ti te queda "+estamina+" estamina, y a ti te queda "+hp+" vida");
                break;
        
        //ataque debil
                case "2":
            limo.meterHp(limo.HP()-(atk-limo.DEF()));
            estamina=estamina-5;
            hp=hp-(limo.ATK()-def);
            System.out.println("al enemigo le queda "+limo.HP()+" vida, a ti te queda "+estamina+" estamina, y a ti te queda "+hp+" vida");
                break;
     
        //ataque defensivo
                case "3":
            limo.meterHp(limo.HP()-(atk-limo.DEF()));
            estamina=estamina-20;
            hp=hp-(limo.DEF()-def*1.5);
            System.out.println("al enemigo le queda "+limo.HP()+" vida, a ti te queda "+estamina+" estamina, y a ti te queda "+hp+" vida");
                break;
                
                
                default:
            System.out.println("pon un numero del 1 al 3");
                break;
}}//fin de seleccion de ataque y fin de ejecucion de ataque

            //magia (funciona de forma rara despues de elegir ataque fisico te coje la primera accion que tengas despues)
        case "9":break;
        
        case "2":
            mana=mana-25;
            if (mana>=0){
            System.out.println("vas a usar magia");
            limo.meterHp(limo.HP()-(atk*3));
            hp=hp-(limo.ATK()-def);
            System.out.println("al enemigo le queda "+limo.HP()+" vida, a ti te queda "+mana+" mana, y a ti te queda "+hp+" vida");
            }else
            System.out.println("no tienes suficiente mana");
        break;


        case "3":System.out.println("las opciones correr y items no estan implementadas aun");break;
        case "4":System.out.println("las opciones correr y items no estan implementadas aun");break;
        
  }}//fin de seleccion de accion y fin de bucleHP
   if (limo.HP()<=0){System.out.println("Ganaste, te puedes volver a mover");dineros=dineros+2;estamina=100+estComprada;
   }else {System.out.println("perdiste");}

break;}

    case "2":{
        while ((lobo.HP()>0) && (hp>0) && (estamina>0)){
        System.out.println("que quieres hacer atacar=1, magia=2, item=3, o correr=4");
    String accion= sc.next();
    
    switch (accion){
        case "1":{
            
        System.out.println("que ataque quieres hacer?1=fuerte 2=ligero 3=defensivo");
        String tipoDeAtaque=sc.next();
        
        //ataque fuerte
            switch(tipoDeAtaque){
                case "1":
            lobo.meterHp(lobo.HP()-(atk*1.5-lobo.DEF()));
            estamina=estamina-10;
            hp=hp-(lobo.ATK()-def);
            System.out.println("al enemigo le queda "+lobo.HP()+" vida, a ti te queda "+estamina+" estamina, y a ti te queda "+hp+" vida");
                break;
        
        //ataque debil
                case "2":
            lobo.meterHp(lobo.HP()-(atk-lobo.DEF()));
            estamina=estamina-5;
            hp=hp-(lobo.ATK()-def);
            System.out.println("al enemigo le queda "+lobo.HP()+" vida, a ti te queda "+estamina+" estamina, y a ti te queda "+hp+" vida");
                break;
     
        //ataque defensivo
                case "3":
            lobo.meterHp(lobo.HP()-(atk-lobo.DEF()));
            estamina=estamina-20;
            hp=hp-(lobo.DEF()-def*1.5);
            System.out.println("al enemigo le queda "+lobo.HP()+" vida, a ti te queda "+estamina+" estamina, y a ti te queda "+hp+" vida");
                break;
                
                
                default:
            System.out.println("pon un numero del 1 al 3");
                break;
}}//fin de seleccion de ataque y fin de ejecucion de ataque

            //magia (funciona de forma rara despues de elegir ataque fisico te coje la primera accion que tengas despues)
        case "9":break;
        
        case "2":
            mana=mana-25;
            if (mana>=0){
            System.out.println("vas a usar magia");
            lobo.meterHp(lobo.HP()-(atk*3));
            hp=hp-(lobo.ATK()-def);
            System.out.println("al enemigo le queda "+lobo.HP()+" vida, a ti te queda "+mana+" mana, y a ti te queda "+hp+" vida");
            }else
            System.out.println("no tienes suficiente mana");
        break;


        case "3":System.out.println("las opciones correr y items no estan implementadas aun");break;
        case "4":System.out.println("las opciones correr y items no estan implementadas aun");break;

  }}//fin de seleccion de accion y fin de bucleHP
   if (lobo.HP()<=0){System.out.println("Ganaste, te puedes volver a mover");dineros=dineros+5;estamina=100+estComprada;
   }else {System.out.println("perdiste");}

break;}

case "3":{
        while ((bandido.HP()>0) && (hp>0) && (estamina>0)){
        System.out.println("que quieres hacer atacar, magia, item, o correr");
    String accion= sc.next();
    
    switch (accion){
        case "1":{
            
        System.out.println("que ataque quieres hacer? 1=fuerte 2=ligero 3=defensivo");
        String tipoDeAtaque=sc.next();
        
        //ataque fuerte
            switch(tipoDeAtaque){
                case "1":
            bandido.meterHp(bandido.HP()-(atk*1.5-bandido.DEF()));
            estamina=estamina-10;
            hp=hp-(bandido.ATK()-def);
            System.out.println("al enemigo le queda "+bandido.HP()+" vida, a ti te queda "+estamina+" estamina, y a ti te queda "+hp+" vida");
                break;
        
        //ataque debil
                case "2":
            bandido.meterHp(bandido.HP()-(atk-bandido.DEF()));
            estamina=estamina-5;
            hp=hp-(bandido.ATK()-def);
            System.out.println("al enemigo le queda "+bandido.HP()+" vida, a ti te queda "+estamina+" estamina, y a ti te queda "+hp+" vida");
                break;
     
        //ataque defensivo
                case "3":
            bandido.meterHp(bandido.HP()-(atk-bandido.DEF()));
            estamina=estamina-20;
            hp=hp-(bandido.DEF()-def*1.5);
            System.out.println("al enemigo le queda "+bandido.HP()+" vida, a ti te queda "+estamina+" estamina, y a ti te queda "+hp+" vida");
                break;
                
                
                default:
            System.out.println("pon un numero del 1 al 3");
                break;
}}//fin de seleccion de ataque y fin de ejecucion de ataque

            //magia (funciona de forma rara despues de elegir ataque fisico te coje la primera accion que tengas despues)
        case "9":break;
        
        case "2":
            mana=mana-25;
            if (mana>=0){
            System.out.println("vas a usar magia");
            bandido.meterHp(bandido.HP()-(atk*3));
            hp=hp-(bandido.ATK()-def);
            System.out.println("al enemigo le queda "+bandido.HP()+" vida, a ti te queda "+mana+" mana, y a ti te queda "+hp+" vida");
            }else
            System.out.println("no tienes suficiente mana");
        break;


        case "3":System.out.println("las opciones correr y items no estan implementadas aun");break;
        case "4":System.out.println("las opciones correr y items no estan implementadas aun");break;

  }}//fin de seleccion de accion y fin de bucleHP
   if (bandido.HP()<=0){System.out.println("Ganaste, te puedes volver a mover");dineros=dineros+25;estamina=100+estComprada;
   }else {System.out.println("perdiste");}

break;}



}//fin del swich tipo de enemigo
}}

}}
