public class Car {
    private String stamp; // марка
    private String model; // модель
    private double engineCapacity; // объем двигателя
    private String bodyColor; // цвет кузова
    private int yearOfProduction; // год выпуска
    private String countryOfAssembly; // страна сборки
    Car(String stamp, String model, int yearOfProduction, String countryOfAssembly, String bodyColor, double engineCapacity){
        if(stamp == null){
            this.stamp = "default";
        }else{
            this.stamp = stamp;
        }
        if(model == null){
            this.model = "default";
        }else{
            this.model = model;
        }
        if(countryOfAssembly == null){
            this.countryOfAssembly = "default";
        }else{
            this.countryOfAssembly = countryOfAssembly;
        }
        if (engineCapacity <= 0){
            this.engineCapacity = 1.5;
        }else{
            this.engineCapacity = engineCapacity;
        }
        if (bodyColor == null){
            this.bodyColor = "Белый";
        }else{
            this.bodyColor = bodyColor;
        }
        if (yearOfProduction <= 0){
            this.yearOfProduction = 2000;
        }else{
            this.yearOfProduction = yearOfProduction;
        }
    }
    Car(String stamp, String model, String countryOfAssembly, int yearOfProduction, String bodyColor,double engineCapacity){
        this.stamp = stamp;
        this.model = model;
        this.bodyColor = bodyColor;
        this.countryOfAssembly = countryOfAssembly;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }
    Car(String stamp, String model, String countryOfAssembly, String bodyColor, double engineCapacity, int yearOfProduction){
        this.stamp = stamp;
        this.model = model;
        this.bodyColor = bodyColor;
        this.countryOfAssembly = countryOfAssembly;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }
    public String getStamp() {
        return this.stamp;
    }
    public String getModel() {
        return this.model;
    }
    public String getCountryOfAssembly() {
        return this.countryOfAssembly;
    }
    public int getYearOfProduction() {
        return this.yearOfProduction;
    }
    public String getBodyColor() {
        return this.bodyColor;
    }
    public double getEngineCapacity() {
        return this.engineCapacity;
    }
}