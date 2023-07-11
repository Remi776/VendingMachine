package Domen;

public class HotDrinks extends Product{
    private float drinkTemperature;
    // Свойства
    public float getDrinkTemperature() {
        return drinkTemperature;
    }

    public void setDrinkTemperature(float drinkTemperature) {
        this.drinkTemperature = drinkTemperature;
    }
    //конструкторы
    public  HotDrinks(int price, int place, String name, long id){
        super(price,place,name,id);
        this.drinkTemperature = 0;
    }
    public HotDrinks (int price, int place, String name, long id, float drinkTemperature){
        super(price,place,name,id);
        this.drinkTemperature = drinkTemperature;
    }

    @Override
    public String toString() {
        return super.toString() + "\ndrink temperature="+drinkTemperature ;
    }

}
