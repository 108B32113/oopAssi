class CCalculator{
    int a;  int b;  int c;
    int x;  int y;  int z;

    void set_value(){
        x = 25; //this 可以不用寫
        y = 3;
        z = 7;
        /*如果你想要在類別的方法中使用 this 來指示成員變數，
        你需要確保等號右邊的值是方法的參數本身，而不是直接指定的數值*/

    }
    
    void show(){
        System.out.println(a +"\n"+ b +"\n"+ c +"\n"+ x +"\n"+  y +"\n"+ z);
                           // "\n" 要把它當字串用來連結 所以要用"+"
    }

    int add(){ // 用傳回就要給函式設立資料型態 而不能直接用void
        return x + y + z; // operator 運算子  operand 運算元
    }

    int sub(){
        return a - b - c;
    }

    int mul(){
        return a * b * c;
    }

    double avg(){
        return (a+b+c) / 3;
    }

    void showAll(){ // 自訂的方法 用於調用該類別全部的方法
        set_value();
        show();
        add();
        sub();
        mul();
        avg();
    }
}

public class hw8_9 {
    public static void main(String args[]){
        CCalculator obj = new CCalculator();
        obj.showAll();
    }
}
