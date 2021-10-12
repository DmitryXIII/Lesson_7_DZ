package xiii.geekbrains.lesson_7;

public class Plate {
    private int maxPlateVolume;
    private int currentFoodVolume;

    public Plate(int maxPlateVolume) {
        this.maxPlateVolume = maxPlateVolume;
        this.currentFoodVolume = (int) (1 + Math.random() * (1 + this.maxPlateVolume)); // случайное количество еды при создании тарелки (от 1 до maxPlateVolume)
    }

    public void setCurrentFoodVolume(int currentFoodVolume) {
        if (currentFoodVolume > this.maxPlateVolume) {
            System.out.printf("В эту тарелку не влезет %s единиц еды \n", currentFoodVolume);
        } else {
            this.currentFoodVolume = currentFoodVolume;
        }
    }

    public void putFoodToPlate(int foodVolume) {
        if (currentFoodVolume + foodVolume > this.maxPlateVolume) {
            System.out.printf("В эту тарелку не влезет %s единиц еды \n", foodVolume);
        } else {
            this.currentFoodVolume += foodVolume;
        }
    }

    public int getCurrentFoodVolume() {
        return this.currentFoodVolume;
    }

    public int getMaxPlateVolume() {
        return this.maxPlateVolume;
    }
}
