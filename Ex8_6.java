class CCircle  //定義類別CCircle
{
    double pi = 3.14; // 可以給初值 在建立class時
    double radius; // 可以給其定義為0.0當初值

    void show_periphery() // show_periphery(), 顯示出圓周長
      // 設立函數成員要給其返回類型
    {
        System.out.println("periphery=" + 2 * this.pi * this.radius);
          //java裡 "":用在字串    '':用在單個字符ex:'A'
    }

    void setRadius(double radius){  // 此函數表示允許函數引用一個新的double來數來指定半徑的值(套數字進radius成員中 給其新值)
        this.radius = radius; // 這裡的 this 表引用當前對象
    }
}

public class hw8_6{
    public static void main(String args[]){
        CCircle cir1 = new CCircle();

        // cir1.radius = 3.0;

        cir1.setRadius(3.0); // 改成用直接帶入函式輸入一個double值當作值 而不是使用宣告建立變數並套用
        cir1.show_periphery(); // 呼叫此函數來顯示圓周 => 條件(d)
          // 因為套用的函式是有output內容的所以會顯示輸出在終端
    }
}




// this 的用途
/*在類別的定義內呼叫其他函數 可在函數之前加上 this 此時代表取用此一函數的物件
  ex:
  void showAll() {
    System.out.println("radius=" + radius);
    this.showArea();
}



返回當前對象的引用：在方法中，你可以使用 this 來返回當前對象的引用。
這在某些情況下可能很有用
ex:
public class Calculator {
    private int result;

    public Calculator add(int num) {
        this.result += num;
        return this; // 返回當前對象的引用，允許方法鏈
    }
}


=====> 總結: 用於強調、避免在程式碼中混淆成員變數和方法參數
*/