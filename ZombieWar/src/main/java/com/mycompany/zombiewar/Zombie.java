
package com.mycompany.zombiewar;

/**
 *
 * @author shado
 */
public abstract class Zombie {
    private int health;
    private int damage;
    private String name;
    
    public Zombie(){
        
    }
    
    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public int getDamage(){
        return damage;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
}