public class LogicOperation {

public static void main (String [] args) {
    double a=8.4, b=12.1, c=20;

    if(Math.abs(c-a) < Math.abs(c-b)){
        System.out.println("Число " + a + " ближе к числу " + c);
    } else {
        System.out.println("Число " + b + " ближе к числу " + c);
    }


    int n=9;
    if(n%2==0){
        System.out.println("Число " + n + " является четным");
    }else {
        System.out.println("Число " + n + " является нечетным");
    }


    double d = ( Math.random() * (155-5) ) + 5;

    if( d > 25 & d < 100){
        System.out.println("Число " + d + " попадает в отрезок от 25 до 100");
    } else {
        System.out.println("Число " + d + " не попадает в отрезок от 25 до 100");
    }



}
}