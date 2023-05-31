package seminar1_homework;

// 1. Создать наследника реализованного класса ГорячийНапиток с дополнительным
// полем int температура.
// 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
// и реализовать перегруженный метод getProduct(int name, int volume, int
// temperature), выдающий продукт соответствующий имени, объёму и температуре
// 3. В main проинициализировать несколько ГорячихНапитков и
// ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
// 4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

public class Main {
    public static void main(String[] args) {
        HotDrink TeaLarge = new Tea("Green gunpowder", 130, 500, 95);
        HotDrink TeaMedium = new Tea("Green gunpowder", 110, 250, 95);
        HotDrink Cocoa = new Cocoa("Cocoa with milk", 250, 250, 65);
        HotDrink CoffeEspresso = new Coffee("Espresso", 80, 60, 80);

        VendingMachine DrinksVending = new HotDrinksVendingMachine();

        DrinksVending.addDrink(TeaLarge);
        DrinksVending.addDrink(TeaMedium);
        DrinksVending.addDrink(Cocoa);
        DrinksVending.addDrink(CoffeEspresso);

        System.out.println(DrinksVending.getDrink("Green gunpowder"));
        System.out.println(DrinksVending.getDrink("Cocoa with milk", 250, 65));
        System.out.println(DrinksVending.getDrink("hot water"));

        System.out.println(DrinksVending.getDrink("Green gunpowder", 250));
    }
}