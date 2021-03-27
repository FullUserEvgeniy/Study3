package com.company;
class Vehicle{
    private int passengers;
    private int fuelcap;
    private int mpg;
    Vehicle(int p,int f,int m){
        passengers=p;
        fuelcap=f;
        mpg=m;
    }
    int range(){
        return mpg*fuelcap;
    }
    double fuelneeded(int miles){
        return (double) miles/mpg;
    }
    int getPassengers(){return passengers;}
    void setPassengers(int p){passengers=p;}
    int getFuelcap(){return fuelcap;}
    void setFuelcap(int f){fuelcap=f;}
    int getMpg(){return mpg;}
    void setMpg(int m){mpg=m;}
}
class Truck extends Vehicle{ //наследуется класс Vehicle
    private int cargocup;
    Truck(int p,int f,int m,int c){
        super(p,f,m);// вызов конструктора суперкласса (Vehicle)
        cargocup=c;
    }
    int getCargo(){return cargocup;}
    void putCargo(int c){cargocup=c;}
}
public class Main {

    public static void main(String[] args) {
	Truck semi=new Truck(2,200,7,44000); //создание объектов подкласса
	Truck pickup=new Truck(3,28,15,2000);
	double gallons;
	int dist=252;
	gallons= semi.fuelneeded(dist);
        System.out.println("Грузовик может перевезти "+semi.getCargo()+" фунтов.");
        System.out.println("Для преодоления "+dist+" миль, грузовику требуется "+gallons+" галлонов топлива.\n");
        gallons= pickup.fuelneeded(dist);
        System.out.println("Пикап может перевезти "+pickup.getCargo()+" фунтов.");
        System.out.println("Для преодоления "+dist+" миль, пикапу требуется "+gallons+" галлонов топлива.\n");
    }
}
