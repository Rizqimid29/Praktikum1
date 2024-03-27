package HeroBattle;

public class Hero {
    private String name;
    private double hp;
    private double attack;
    private double defense;

public Hero() {
    this.name = null;
    this.hp = 0.0;
    this.attack = 0.0;
    this.defense = 0.0;
}
public Hero(String name, double hp, double attack, double defense) {
    this.name = name;
    this.hp = hp;
    this.attack = attack;
    this.defense = defense;
}
public void setName(String name) {
    this.name = name;
}
public String getName() {
    return name;
}
public void setHp(double hp) {
    this.hp = hp;
}
public double getHp() {
    return hp;
}
public void setAttack(double attack) {
    this.attack = attack;
}
public double getAttack() {
    return attack;
}
public void setDefense(double defense) {
    this.defense = defense;
}
public double getDefense() {
    return defense;
}
}

