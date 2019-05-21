package com.company;

import java.util.Scanner;

public class Main {
//-B/2A;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap a:");
        double a=sc.nextDouble();
        System.out.println("Nhap b:");
        double b=sc.nextDouble();
        System.out.println("Nhap c:");
        double c=sc.nextDouble();
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant()>0){
           double root1=quadraticEquation.getRoot1();
            double root2=quadraticEquation.getRoot2();
            System.out.println("Phuong trihn co 2 nghiem  "+"\n" +root1+"\n"+root2);
        }else if (quadraticEquation.getDiscriminant()==0){
            double nk=quadraticEquation.getNghiemkep();
            System.out.println("Nghiem kep"+nk);
        }else {
            System.out.println("The equation has no roots");
        }


    }
}
