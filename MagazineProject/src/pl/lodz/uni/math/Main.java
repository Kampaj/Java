package pl.lodz.uni.math;

import pl.lodz.uni.math.storage.StorageProvider;

public class Main {
    public static void main(String[] args) {
        StorageProvider storageProvider = new StorageProvider();
    }
}
/*
MAGAZYN

- Coding rules! (10 linijek na funkcje)
- aplikacja konsolowa (bez okienek)
- test coverage - 65%

- ktos podaje 3 wartosci (x,y,z) I TWORZY KOSTKE
- potrzebny "dzwig" by wyciagac elementy z kostki (tylko z gory), trzeba zdjac wszytkie wyzsze jezeli chce sie dostac do nizszego

- kazda paczka ma rozmiar (1,1,1) (x,y,z)
- kazda paczka ma swoj typ (zabawka, koc itp.)
- tylko 1 dzwig

- Paczka zawiera: opis, ile razy ruszona, data dodania, numer(hash), priorytet (kazda paczka zawiera takie wartosci)
- paczka z mniejszym priorytetem nie moze byc polozona na paczke z wiekszym priorytetem

- przekladanie paczek tylko w tym klocku

IMPLEMENTACJA:
- getPackageByNumber(#); // wyjmuje paczke o podanym numerze
- getAllPackagesByType(Type); // wyjmuje wszystkie paczki podanego typu
- getHistoryOfPreviousMoves(); // przedstawia kroki wykonane do otrzymania ostatniej paczki
- getStatusOfStorage(); // wypisuje wszystkie informacje o wszystkich paczkach
 */