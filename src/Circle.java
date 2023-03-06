import java.lang.Math;
import java.util.Scanner;
public class Circle {

    private final double PI = 3.14159;


    public double get_pi(){
        return PI;
    }
    public double get_radius(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan radius lingkaran (r) : ");

        return input.nextInt();
    }

    public double calculate_radius_squared(double radius){
        return radius * radius;
    }


    public double calculate_circle_area(){
        return Math.round(PI * calculate_radius_squared(get_radius()));
    }

    public void print_circle_area(){
        System.out.println("Luas Lingkarang Adalah : " + calculate_circle_area());
    }


}

