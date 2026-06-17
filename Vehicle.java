package com.tns.multilevel;

public class Vehicle
{
public static void main(String[]args) 
{
Car c = new Car();
c.vehicleType();

Maruthi m = new Maruthi();
m.brand();
m.speed();
m.vehicleType();

Maruti800 m1=new Maruti800();
m1.speed();//maruti800
m1.brand();//maruthi
m1.vehicleType();//car
}
}

