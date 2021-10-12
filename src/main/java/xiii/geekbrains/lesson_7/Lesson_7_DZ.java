package xiii.geekbrains.lesson_7;

public class Lesson_7_DZ {

    public static void main(String[] args) {
        Plate plate_1 = new Plate(30);
        System.out.println(plate_1.getCurrentFoodVolume());
        Cat[] cats = new Cat[10];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Кот_" + (i + 1));
            System.out.printf("%s сытый: %s\n", cats[i].getName(), cats[i].getIsWellFed());
            while (!cats[i].getIsWellFed()) {
                cats[i].eatFromPlate(plate_1);
            }
            System.out.printf("%s сытый: %s\n", cats[i].getName(), cats[i].getIsWellFed());
            System.out.println();
        }
    }
}
