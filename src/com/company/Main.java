package com.company;

public class Main {

    public static void main(String[] args) {
int [] mass = new int[100];
for (int i=0;i<100;i++)
    {
        mass[i] = (int) (Math.random() * 1000);
    }
for (int i=0; i < mass.length; i++)
{
    for (int j=0;j<mass.length-i-1;j++)
    {
        if  (mass[j] > mass[j+1])
        {
            int test = mass[j];
            mass[j] = mass[j+1];
            mass[j+1] = test;
        }
    }
}
for (int i=0;i<mass.length;i++)
{
    System.out.println(mass[i]);
}
    }
}
