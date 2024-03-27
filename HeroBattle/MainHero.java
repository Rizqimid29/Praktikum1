package HeroBattle;

import java.util.Scanner;

public class MainHero {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name1, name2;
        double hp1, hp2, attack1, attack2, defense1, defense2, gameOver1, gameOver2;
        int i = 1;
        Hero hero1 = new Hero();
        System.out.println("Permainan adu hero");
        System.out.println("Player 1 : Silakan masukkan hero Anda!");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500");
        System.out.println("============================================================");
        System.out.print("Nama Hero\t: ");
        name1 = scn.next();
        System.out.print("Health Point\t: ");
        hp1 = scn.nextDouble();
        System.out.print("Attack\t\t: ");
        attack1 = scn.nextDouble();
        System.out.print("Defense\t\t: ");
        defense1 = scn.nextDouble();
        hero1.setName(name1);
        hero1.setHp(hp1);
        hero1.setAttack(attack1);
        hero1.setDefense(defense1);

        System.out.println("\nPermainan adu hero");
        System.out.println("Player 2 : Silakan masukkan hero Anda!");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500");
        System.out.println("============================================================");
        System.out.print("Nama Hero\t: ");
        name2 = scn.next();
        System.out.print("Health Point\t: ");
        hp2 = scn.nextDouble();
        System.out.print("Attack\t\t: ");
        attack2 = scn.nextDouble();
        System.out.print("Defense\t\t: ");
        defense2 = scn.nextDouble();
        Hero hero2 = new Hero(name2, hp2, attack2, defense2);
        gameOver1 = hero1.getHp();
        gameOver2 = hero2.getHp();
        do {
            System.out.println("\n============================================================" + 
            "\n============================================================");
            System.out.println("Ronde " + i);
            gameOver1 -= (hero2.getAttack() - hero1.getDefense());
            if (gameOver1 < 0.0) {
                System.out.println(hero2.getName() + " menyerang " + hero1.getName() + "\n");
                System.out.println(hero2.getName() + " menyerang sebesar " + hero2.getAttack());
                System.out.println(hero1.getName() + " memiliki pertahanan sebesar " + hero1.getDefense());
                System.out.println("Health " + hero1.getName() + " saat ini 0.0");
                System.out.println("\nPertarungan telah usai!");
                System.out.println(hero1.getName() + " telah kalah!");
                System.out.println("=======================");
                System.out.println(hero2.getName() + " adalah pemenangnya");
                break;
            }
            System.out.println(hero2.getName() + " menyerang " + hero1.getName() + "\n");
            System.out.println(hero2.getName() + " menyerang sebesar " + hero2.getAttack());
            System.out.println(hero1.getName() + " memiliki pertahanan sebesar " + hero1.getDefense());
            System.out.println("Health " + hero1.getName() + " saat ini " + gameOver1);
            gameOver2 -= (hero1.getAttack() - hero2.getDefense());
            if (gameOver2 < 0.0) {
                System.out.println("\n" + hero1.getName() + " menyerang " + hero2.getName() + "\n");
                System.out.println(hero1.getName() + " menyerang sebesar " + hero1.getAttack());
                System.out.println(hero2.getName() + " memiliki pertahanan sebesar " + hero2.getDefense());
                System.out.println("Health " + hero2.getName() + " saat ini 0.0");
                System.out.println("\nPertarungan telah usai!");
                System.out.println(hero2.getName() + " telah kalah!");
                System.out.println("=======================");
                System.out.println(hero1.getName() + " adalah pemenangnya");
                break;
            }
            System.out.println("\n" + hero1.getName() + " menyerang " + hero2.getName() + "\n");
            System.out.println(hero1.getName() + " menyerang sebesar " + hero1.getAttack());
            System.out.println(hero2.getName() + " memiliki pertahanan sebesar " + hero2.getDefense());
            System.out.println("Health " + hero2.getName() + " saat ini " + gameOver2);
            if (gameOver1 == 0.0 && gameOver2 == 0.0) {
                System.out.println("\nPertarungan telah usai!");
                System.out.println("=======================");
                System.out.println("Hasil pertarungan seri");
                break;
            }
            if (hp1 == attack1 && hp1 == defense1 && hp1 == hp2 && hp2 == attack2 && hp2 == defense2) {
                System.out.println("\nHasil pertarungan seri");
                break;
            }
            if (attack1 == defense2 && attack2 == defense1) {
                System.out.println("\nHasil pertarungan seri");
                break;
            }
            ++i;
        } while (gameOver1 > 0.0 || gameOver2 > 0.0);
        scn.close();
    }
}
