import java.util.Scanner; // 導入Scanner 模組

class CTest{
    double num;
    Scanner scanner = new Scanner(System.in);
      // 在這個類別中建立並宣告一個Scanner物件
      /*在Java中，System.in 是一個 InputStream（輸入流）的實例，
      它允許你從鍵盤或其他輸入源讀取數據 */ 


// 設立方法
    void test(){
        double num = scanner.nextDouble();
        if(num%2 != 0){ // 要用餘數除
            System.out.println("此數為奇數");
        }
        else if(num%2 == 0){
            System.out.println("此數為偶數");
        }
        else if(num == 0){
            System.out.println("此數為0");
        }
    }
}


// 正式啟動
public class hw8_7 {
    public static void main(String args[]){
        CTest testNow = new CTest(); // 宣告並建立變數 將Ctest類別中的自訂函數成員方法調用進去
                                  /*等號要打的是類別名 而不是類別中的函式名 */
        testNow.test(); //這行才是真的在調用方法
    }
}
