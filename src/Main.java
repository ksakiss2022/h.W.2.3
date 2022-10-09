import transport.Car;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Human maksim = new Human(35, "Максим", "Минск", " бренд-менеджерa");
        maksim.human();

        Human anna = new Human(29, "Анна", "Москва", " методистa образовательных программ");
        anna.human();

        Human katya = new Human(28, "Катя", "Калининград", " продакт-менеджера");
        katya.human();

        Human artem = new Human(27, "Артем", "Москва", " директора по развитию бизнеса");
        artem.human();

        Human vladimir = new Human(21, "Владимир", "Казань", null);
        vladimir.human();

        Human checkingForNullHuman = new Human(-3, null, null, null);
        checkingForNullHuman.human();


        Car.Key carManagement = new Car.Key("Удаленный запуск двигателя в комплектации",
                "Бесключевой доступ в комплектации");
        Car.Insurance carInsurance = new Car.Insurance(null, 3550.50, "123456789");

        Car ladaGrande = new Car("Lada", "Grande", 1.7f, "желтый", 2015,
                "России");
        ladaGrande.setKey(carManagement);
        ladaGrande.car();
        Car.Insurance ladaGrandeInsurance = new Car.Insurance(null, 4321.90,
                "987654321");
        ladaGrande.setInsurance(ladaGrandeInsurance);
        System.out.println(carManagement.getKeylessAccess());
        System.out.println(carManagement.getRemoteEngineStart());
        System.out.println("Номер страховки- " + ladaGrandeInsurance.getInsuranceNumber() + ","
                + " стоимость страховки- " + ladaGrandeInsurance.getTheCostOfInsurance() +
                "," + " срок дейстрия страховки- " + ladaGrandeInsurance.getInsuranceValidityPeriod());


        Car audi = new Car("Audi A8 50 L TDI", "quattro", 3.0f, "черный",
                2020, "Германия");
        audi.car();
        Car.Insurance audiInsurance = new Car.Insurance(null, 5555.40,
                "111111111");
        audi.setInsurance(audiInsurance);
        System.out.println("Номер страховки- " + audiInsurance.getInsuranceNumber() + ","
                + " стоимость страховки- " + audiInsurance.getTheCostOfInsurance() +
                "," + " срок дейстрия страховки- " + audiInsurance.getInsuranceValidityPeriod());

        Car bmw = new Car("BMW", "Z8", 3.0f, "черный", 2021,
                "Германия");
        bmw.car();
        Car.Insurance bmwInsurance = new Car.Insurance(null, 4444.40,
                "222222222");
        audi.setInsurance(bmwInsurance);
        System.out.println("Номер страховки- " + bmwInsurance.getInsuranceNumber() + ","
                + " стоимость страховки- " + bmwInsurance.getTheCostOfInsurance() +
                "," + " срок дейстрия страховки- " + bmwInsurance.getInsuranceValidityPeriod());

        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4f, "красный", 2018,
                "Южная Корея");
        kia.car();
        Car.Insurance kiaInsurance = new Car.Insurance(null, 3333.56,
                "333333333");
        audi.setInsurance(kiaInsurance);
        System.out.println("Номер страховки- " + kiaInsurance.getInsuranceNumber() + ","
                + " стоимость страховки- " + kiaInsurance.getTheCostOfInsurance() +
                "," + " срок дейстрия страховки- " + kiaInsurance.getInsuranceValidityPeriod());

        Car hyundai = new Car("Hyundai", "Avante", 1.6f, "оранжевый", 2016,
                "Южная Корея");
        hyundai.car();
        Car.Insurance hyundayInsurance = new Car.Insurance(null, 6666.00,
                "444444444");
        audi.setInsurance(hyundayInsurance);
        System.out.println("Номер страховки- " + hyundayInsurance.getInsuranceNumber() + ","
                + " стоимость страховки- " + hyundayInsurance.getTheCostOfInsurance() +
                "," + " срок дейстрия страховки- " + hyundayInsurance.getInsuranceValidityPeriod());

        Car checkingForNull = new Car(null, null, 0, null, 0,
                null);
        checkingForNull.car();

        Flower rose = new Flower("Роза обыкновенная", "Голландия", 35.59f, 9);
        rose.printflower();

        Flower hresantem = new Flower("Хризантема", " ", 15f, 5);
        hresantem.printflower();

        Flower pion = new Flower("Пион", "Англия", 69.9f, 4);
        pion.printflower();

        Flower gibiscus = new Flower("Гипсофила", "Турция", 19.5f, 10);
        gibiscus.printflower();
        Flower[] flowers = new Flower[20];
        flowers[0] = rose;
        flowers[1] = hresantem;
        flowers[2] = pion;
        flowers[3] = gibiscus;

        calculate(flowers);

        Car skodaCadiac = new Car("Skoda", "Cadiac", 2.0f, "синий", 2020,
                "России", "4-х ступенчатая", "внедорожник",
                "P503XK190", 4, "летняя", 12);

        skodaCadiac.allCar();
        skodaCadiac.sumAndWinterTires();
        skodaCadiac.chekNumberCar();


    }


    public static void calculate(Flower[] flowers) {
        int lifeSpan = Integer.MAX_VALUE;
        float sum = 0;
        String text = "В букете есть:\n";
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] != null) {
                text += " " + flowers[i].getFlowerColorName() + " " + "из " + flowers[i].getCountry() + "\n";
                if (flowers[i].getLifeSpan() < lifeSpan) {
                    lifeSpan = flowers[i].getLifeSpan();
                }
                sum += flowers[i].getCost();
            }
        }
        sum = sum * 1.10f;
        text += "\n";
        text += "Сумма букета = " + String.format("%.2f", sum);
        text += "\n";
        text += "Срок годности:" + lifeSpan;
        System.out.println(text);

    }

}