package com.company;


public class Main
{
    public static void main(String[] args)
    {
        Human human1 = new Human("Stefan", "Czarnecki", "Lekarz", 28, 73, 2500 );
        Car car1 = new Car("126p", "fiat", "OH 357B", 2, 500, 2000);
        Car car2 = new Car("Lancer VII", "Mitsubishi", "GKE 122RW", 4, 2500, 15000);
        Car car3 = new Car("Mustang", "Ford", "GD 0001FM", 2, 5000, 78000);

        human1.Set_Samochod(car1.rejestracja, car1.wartosc);
        human1.Get_Samochod();
        human1.Set_Samochod(car2.rejestracja, car2.wartosc);
        human1.Get_Samochod();
        human1.Set_Samochod(car3.rejestracja, car3.wartosc);
        human1.Get_Samochod();
    }
}