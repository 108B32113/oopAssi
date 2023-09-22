class CCircle{
    double pi = 3.14;
    double radiusDouble;
    float radiusFloat;
    int radiusInt;

    double area(double r){ // 多載函數名可相同 但是裡面的成員到調用函式的參數當作值前 要建立不同的類別成員中的field name
        radiusDouble = r;
        return pi * radiusDouble * radiusDouble;
    }
    double area(float r){
        radiusFloat = r;
        return pi * radiusFloat * radiusFloat;
    }
    double area(int r){
        radiusInt = r;
        return pi * radiusInt * radiusInt;
    }

}

public class hw8_13 {
    public static void main(String args[]){
        CCircle circle = new CCircle();
        double areaDouble = circle.area(2); // areaDouble 以及底下跟它名字很像的是現在才建立的變數 用於帶入類別建立的函式的方法
        double areaFloat = circle.area(2.2f);
        double areaInt = circle.area(2.2);

        System.out.println("" + areaDouble);
        System.out.println("" + areaFloat);
        System.out.println("" + areaInt);
    }
}
