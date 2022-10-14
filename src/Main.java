public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        porsche.color = "yellow";
        porsche.name = "panamera";
        porsche.engine = 4.0f;
        porsche.door = 2;

        Car masserati = new Car();
        masserati.door = 2;
        masserati.color = "chroni";
        masserati.engine = 5.0f;
        masserati.name = "mc20";

        porsche.drive();
        masserati.drive();

        Car Porsche2 = porsche;
        System.out.println(porsche.color);
        Porsche2.color = "blue";
        System.out.println(porsche.color);

        porsche = null;
        Porsche2 = null;

    }
}