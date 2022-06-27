package org.example;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int[] masa = new int[31];
        for (int i = 0; i < masa.length; i++) {
            masa[i] = i + 1;
        }

        int[] masb = new int[31];
        for (int i = 0; i < masb.length; i++) {
            masb[i] = -i + 1;
        }

        int[] mas1 = new int[masa.length + masb.length];
        int count = 0;

        for (int i = 0; i < masa.length; i++) {
            mas1[i] = masa[i];
            count++;
        }

        for (int j = 0; j < masb.length; j++) {
            mas1[count++] = masb[j];
        }
        for (int i = 0; i < mas1.length; i++)
           // System.out.print(mas1[i] + " ");

        Arrays.sort(mas1);
        //System.out.println(Arrays.toString(mas1));

        String arrayToString = Arrays.toString(mas1);
        System.out.println("This is an array of numbers");
        System.out.println(arrayToString);

        int poz = mas1.length; // длина массива. Он же порядковый номер числа в массиве. Может меняться
        int norm = poz; // norm = менять не будем. Это базовая величина размера массива
        System.out.println("Array len  = " + norm);

        System.out.println("Select a number and enter it on the keyboard : ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        System.out.println("You number = " + x); // Выбранный номер

        if ( poz % 2 != 0) { poz = poz + 1;}
        int temp = (poz / 2) + 1;
        poz = poz / 2;
        int sum = 0;


        while (x != mas1[poz]) {

                if (x < mas1[poz]) {     // Проверяем, если  х меньше нашего числа
                    temp = temp / 2;
                    if (temp == 0) {temp = 1; } //  значение temp не может быть ноль. иначе цикл не пройдет

                    System.out.println("Step = " + sum + " Searched number = " + mas1[poz] + " < " + x + " False.  Next number = " + mas1[poz] + " - " + temp); // пишем ход на уменьшение нашего числа
                    poz = (poz - temp); // уменьшаем наше число на temp
                    sum = sum + 1; // плюс счетчик  и передаем на обработку ниже
                    }

                if (x > mas1[poz]) {     // Проверяем, если  х меньше нашего числа
                    temp = temp / 2;
                    if (temp == 0) {
                        temp = 1;
                    } //  значение temp не может быть ноль. иначе цикл не пройдет
                    System.out.println("Step = " + sum + " Searched number = " + mas1[poz] + " > " + x + " False.  Next number = " + mas1[poz] + " + " + temp); // пишем ход на уменьшение нашего числа
                    poz = (poz + temp); // увеличиваем наше число на temp
                    sum = sum + 1; // плюс счетчик  и передаем на обработку ниже
                    }

                if (x == mas1[poz]) { // если угадали, пишем про это, если не угадали передаем на обработку ниже
                    sum = sum + 1;
                    System.out.println("Step = " + sum + " Searched number = " + mas1[poz] + " = " + x + " True." );
                    }
                }
        }
    }









