package opg1;

public class App {
    public static void main(String[] args) {
        Measurable[] objects = new Measurable[4];

        Chili c1 = new Chili("Mild", 200);
        Chili c2 = new Chili("Stærk", 20000);
        Chili c3 = new Chili("Meget Stærk", 120000);
        Træ t1 = new Træ("Birk", 50);
        objects[0] = c1;
        objects[1] = c2;
        objects[2] = c3;
        objects[3] = t1;

        Measurable maxObject = max(objects);
        System.out.println("Max object measure: " + maxObject.getMeasure());

        double average = avg(objects);
        System.out.println("Average measure: " + average);
    }

    public static Measurable max(Measurable[] objects) {

        if (objects.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        Measurable maxObj = objects[0];
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].getMeasure() > maxObj.getMeasure()) {
                maxObj = objects[i];
            }
        }
        return maxObj;
    }

    public static double avg(Measurable[] objects) {

        if (objects.length == 0) {
            throw new IllegalArgumentException("Arrayet er tomt");
        }
        double sum = 0;
        for (Measurable m : objects) {
            sum += m.getMeasure();
        }
        return sum / objects.length;
    }
}
