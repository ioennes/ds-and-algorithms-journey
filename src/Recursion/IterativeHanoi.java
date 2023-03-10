package Recursion;

// The Tower of Hanoi is a mathematical puzzle that consists of three rods and a set
// of disks of different sizes which can slide onto any rod. The puzzle starts with
// the disks in a neat stack in ascending order of size on one rod, the smallest at
// the top, thus making a cone shape. The objective of the puzzle is to move the
// entire stack to another rod, obeying the following simple rules:
//
// Only one disk can be moved at a time.
// Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack or on an empty rod.
// No larger disk may be placed on top of a smaller disk.
//
// Specs:   CPU: Ryzen 5800H
//          GPU: Nvidia RTX3060 6GB VRAM 115W (+15W)
//          RAM: 16GB

import java.lang.Math;
import java.time.Instant;
import java.time.Duration;

public class IterativeHanoi {

    // the following class sets up a tower (peg)

    public class Tower {
        int top;
        int size;
        int[] disks;
    }

    // the following method creates the tower, it acts as a constructor

    public Tower createTower(int size) {
        Tower tower = new Tower();
        tower.size = size;
        tower.top = -1;
        tower.disks = new int[size];
        return tower;
    }

    // the addTop method has two purposes: loading the first disk full of disks and adding
    // disks to towers.

    public void addTop(Tower tower, int disk) {
        if (tower.top == tower.size - 1) {
            return;
        }
        tower.top++;
        tower.disks[tower.top] = disk;
    }

    // the removeTop method simply deletes the topmost disk.

    public int removeTop(Tower tower) {
        if (tower.top == -1) {
            return -1;
        }
        int disk = tower.disks[tower.top];
        tower.top--;
        return disk;
    }

    // printMove helps illustrate the movement of the disks.

    public void printMove(char s, char d, int disk) {
        System.out.println("Moved " + disk + " from " + s + " to " + d);
    }

    // the move method finds the top of the tower and works on the distribution

    public void move(Tower s, Tower e, char src, char des) {
        int top_of_source = removeTop(s);
        int top_of_destin = removeTop(e);

        if (top_of_source == -1) {
            addTop(s, top_of_destin);
            printMove(des, src, top_of_destin);
        }

        else if (top_of_destin == -1) {
            addTop(e, top_of_source);
            printMove(src, des, top_of_source);
        }

        else if (top_of_source > top_of_destin) {
            addTop(s, top_of_source);
            addTop(s, top_of_destin);
            printMove(des, src, top_of_destin);
        }

        else if (top_of_destin > top_of_source) {
            addTop(e, top_of_destin);
            addTop(e, top_of_source);
            printMove(src, des, top_of_source);
        }
    }

    // the hanoi method emulates the entire procedure.

    public void hanoi(Tower s, Tower m, Tower e, int num_disks) {
        char src = 's';
        char mid = 'm';
        char des = 'e';

        int num_moves = (int) (Math.pow(2, num_disks) - 1);

        // here, we switch the names of the towers because the "between" movements of n mod 2 = 0
        // would be exactly the same as those of n mod 2 = 1 if we switched the middle and destination towers.

        if (num_disks % 2 == 0) {
            char temp = des;
            des = mid;
            mid = temp;
        }

        for (int i = num_disks; i >= 1; i--) {
            addTop(s, i);
        }

        for (int i = 1; i <= num_moves; i++) {
            if (i % 3 == 1) {
                move(s, e, src, des);
            } else if (i % 3 == 2) {
                move(s, m, src, mid);
            } else if (i % 3 == 0) {
                move(m, e, mid, des);
            }
        }

    }

    // this function saves helps avoid unnecessary rewriting and space in the main method

    public static void startHanoi(int num_disks) {
        IterativeHanoi hanoi = new IterativeHanoi();
        Tower s, m, e;

        System.out.println(num_disks + " --------------------");

        Instant inst1 = Instant.now();

        s = hanoi.createTower(num_disks);
        m = hanoi.createTower(num_disks);
        e = hanoi.createTower(num_disks);

        hanoi.hanoi(s, m, e, num_disks);

        Instant inst2 = Instant.now();

        System.out.println("Elapsed Time: "+ Duration.between(inst1, inst2).toString());
    }

    public static void main(String[] args) {
        startHanoi(3);      // 0.019s
        startHanoi(5);      // 0.001s
        startHanoi(10);     // 0.02s
        startHanoi(30);     // more than 10m
        startHanoi(100);    // more than 10m
    }
}