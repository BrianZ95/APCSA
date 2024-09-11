public class Main {
    int num = 5;
    double ten = 10.2;
    boolean dino = true;
    final double PI = 3.14159;

    public static void main(String[] args) {
        Main obj = new Main(); 

        System.out.println(obj.num);
        obj.num = obj.num - 2;

        System.out.println(obj.num + obj.ten);
        System.out.println(obj.dino);
        System.out.println("Dinosaur");
        System.out.println(obj.PI);
    }
}
