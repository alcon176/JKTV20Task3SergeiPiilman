/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20task3sergeipiilman;

import java.util.Scanner;
public class JKTV20Task3SergeiPiilman {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();
        System.out.println("Введите вашу фамилию:");
        String family = scanner.nextLine();
        System.out.println("Введите дату рождения:");
        String birthday = scanner.nextLine();
        System.out.println("Ваши данные: ");
        System.out.println("Имя и фамилия: "+name+" "+family);
        System.out.println("Дата рождения: "+birthday);
    }
  }  