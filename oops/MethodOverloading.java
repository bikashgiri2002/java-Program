package oops;
import java.util.*;
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(120,130));
        System.out.println(cal.sum(12.3f,134));
        System.out.println(cal.sum(120,130,500));
    }
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b,int c){
        return a+b+c;
    }
}
