//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cars car1 = new Cars("Chevrolet","Camaro",2021);
//        Cars car2 = new Cars("Ford","Mustang",2022);
        Cars car2 = new Cars(car1);
        // Don't copy your object like car1 = car2
        // This way copies the memory address

        car2.copy(car1);
        // We need to create a method for copying over the attributes from the target object


        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car2.getMake());

        System.out.println(car1.getModel());
        System.out.println(car2.getModel());

        System.out.println();
        System.out.println(car1.getYear());
        System.out.println(car2.getYear());

    }
}