
package intentodevideojuego;

/**
 *
 * @author ssanjuanandres
 */
public class Personaje {
    
    double hp, atk ,def, estamina, mana,
           dineros, estTot, hpTot, manaTot, lvl;
    
    public Personaje(){}
    public Personaje(double hp,double atk, double def, double estamina, double mana, 
            double dineros,double estTot, double hpTot, double manaTot, double lvl)
            {this.hp=hp; this.atk=atk; this.def=def ;this.dineros=dineros ;this.estTot=estTot ;this.estamina=estamina;
             this.hpTot=hpTot ;this.lvl=lvl ;this.mana=mana ;this.manaTot=manaTot;}
    
    public void amosar (){System.out.println(hp+atk+def+estamina+mana+dineros+estTot+hpTot+manaTot+lvl);}
    
    
    public double getHp (){return hp;}
    public double getAtk (){return atk;}
    public double getDef (){return def;}
    public double getMana (){return mana;}
    public double getDinero (){return dineros;}
    public double getEstamina (){return estamina;}
    public double getLvl (){return lvl;}
    public double getEstTot(){return estTot;}
    public double getHpTot(){return hpTot;}
    public double getManaTot(){return manaTot;}        
    
    public void setHp (double hp){this.hp=hp;}
    public void setAtk (double atk){this.atk=atk;}
    public void setDef (double def){this.def=def;}
    public void setMana (double mana){this.mana=mana;}
    public void setDinero (double dinero){this.dineros=dinero;}
    public void setEstamina (double estamina){this.estamina=estamina;}
    public void setHpTot (double hpTot){this.hpTot=hpTot;}
    public void setManaTot(double manaTot){this.manaTot=manaTot;}
    public void setEstaminaTot(double estTot){this.estTot=estTot;}
            }