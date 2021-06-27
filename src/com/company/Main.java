package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Введите число от 1 до 7: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 1) {
            String perv = "Понедельник";
            System.out.println(perv);}
        else if (a == 2) {
            String vt = "Вторник";
            System.out.println(vt);}
        else if (a == 3) {
            String tret = "Среда";
            System.out.println(tret);}
        else if (a == 4) {
            String chet = "Четверг";
            System.out.println(chet);}
        else if (a == 5) {
            String pt = "Пятница";
            System.out.println(pt);}
        else if (a >= 6 && a <= 7) {
            String vyh = "Выходной";
            System.out.println(vyh);}
        else if (a > 7) {
            System.out.println("Условие не соблюдено");}
        }
    }

