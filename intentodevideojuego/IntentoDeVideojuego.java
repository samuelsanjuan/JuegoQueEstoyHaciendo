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

        System.out.println("Te mueves con a,w,s,d, empiezas en la casilla 22. ");
        System.out.println("Tu objetivo es llegar a la casilla 44, en la casilla 43 y 24 hay enemigos y en la casilla 42 esta la tienda");  
 
Personaje yo=new Personaje(50, 10, 2, 100, 25,0,100,50,25,1);
Tienda tienda=new Tienda();


        
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
while (linkedHashMap.get(tuPosicion)!="objetivo"){
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
if ("tienda".equals(linkedHashMap.get(tuPosicion))){tienda.activarTienda(yo, tienda);
 

}

if ("enemy".equals(linkedHashMap.get(tuPosicion))){       
System.out.println("contra quien te quieres enfrentar 1(limo) 2(lobo) o 3(bandido)?(aun no tienes herraminetas para ganarle al bandido)");
String enemyType=sc.next();
//orden en los enemigos def atk hp exp gold
switch (enemyType){
    case "1":{Enemigo limo=new Enemigo(2,5,10,0,5);limo.combate(limo, yo);}break;
    case "2":{Enemigo lobo=new Enemigo (4,10,25,0,15);lobo.combate(lobo, yo);}break;
    case "3":{Enemigo bandido= new Enemigo(10,25,100,0,50);bandido.combate(bandido, yo);}break;
}}

}
}}
