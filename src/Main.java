public class Main {
    public static void main(String[] args){
        Car lada = new Car("Lada", "Grande",0,
                "сборка в России", "желтого цвета", 0);

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020,
                "сборка в Германии", "черный цвет кузова", 3.0);

        Car bmw = new Car("BMW", "Z8", "Сборка в Германии",
                2021, "черный цвет кузова", 3.0);

        Car kia = new Car("Kia", "Sportage 4 поколение", 2018, "Сборка в Южной Корее", "цвет кузова красный", 2.4);


        Car hyundai = new Car("Hyundai", "Avante", "сборка в Южной Корее", "цвет кузова оранжевый", 1.6, 2016);



        System.out.println(lada.getStamp() + " " + lada.getModel() + ", " + lada.getYearOfProduction() + " год выпуска, " +
                lada.getCountryOfAssembly() + ", " + lada.getBodyColor() + ", объем двигателя - " + lada.getEngineCapacity());

        System.out.println(audi.getStamp() + " " + audi.getModel() + ", " + audi.getYearOfProduction() + " год выпуска, " +
                audi.getCountryOfAssembly() + ", " + audi.getBodyColor() + ", объем двигателя - " + audi.getEngineCapacity());

        System.out.println(bmw.getStamp() + " " + bmw.getModel() + ", " + bmw.getCountryOfAssembly() + ", в " +
                bmw.getYearOfProduction() + " году, " + bmw.getBodyColor() + ", объем - " + bmw.getEngineCapacity());

        System.out.println(kia.getStamp() + " " + kia.getModel() + ", " + kia.getYearOfProduction() + " года выпуска, " +
                kia.getCountryOfAssembly() + ", " + kia.getBodyColor() + ", объем двигателя - " + kia.getEngineCapacity());

        System.out.println(hyundai.getStamp() + " " + hyundai.getModel() + ", " + hyundai.getCountryOfAssembly() + ", " +
                hyundai.getBodyColor() + ", объем двигателя - " + hyundai.getEngineCapacity() + ", год выпуска - " +
                hyundai.getYearOfProduction() + " год.");
    }
}
