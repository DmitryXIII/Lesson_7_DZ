package xiii.geekbrains.lesson_7;

public class Cat {
    private boolean isWellFed;
    private int foodToWellFed;
    private String name;

    public Cat(String name) {
        this.name = name;
        this.isWellFed = false;
        this.foodToWellFed = (int) (5 + (Math.random() * 6)); // случайное количество еды для сытости кота (от 5 до 10)
    }

    public void eatFromPlate(Plate plate) {
        System.out.printf("Сейчас в тарелке %s единиц еды\n", plate.getCurrentFoodVolume());
        if (plate.getMaxPlateVolume() < this.foodToWellFed) { // если максимум тарелки меньше, чем надо коту, кот не наестся
            System.out.printf("Эта тарелка слишком маленькая для %s, дайте тарелку побольше!\n", this.name);
        } else if (plate.getCurrentFoodVolume() < this.foodToWellFed) { // если в тарелке меньше, чем надо коту, кот не наестся, наполнить тарелку до максимума
            System.out.printf("%s не наестся из этой тарелки, тарелку необходимо наполнить!\n", this.name);
            plate.putFoodToPlate(plate.getMaxPlateVolume() - plate.getCurrentFoodVolume());
            System.out.println("Хозяин наполнил тарелку");
        } else { // если в тарелке достаточно еды, кот поел и наелся
            plate.setCurrentFoodVolume(plate.getCurrentFoodVolume() - this.foodToWellFed);
            System.out.printf("%s съел %s единиц еды и наелся\n", this.name, this.foodToWellFed);
            this.isWellFed = true;
            System.out.printf("В тарелке осталось %s единиц еды\n", plate.getCurrentFoodVolume());
        }
    }

    public String getName() {
        return this.name;
    }

    public boolean getIsWellFed() {
        return isWellFed;
    }
}
