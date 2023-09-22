// package assi.ch8; // 路徑為在指定的專案資料夾之下 package(套件) + 資料夾 + "." + 在這之下的另一個資料夾(等等)
  //可以不用寫 但如果寫了的話比較嚴謹 好管理
  
// project>package>class>member(>field) = function(>body)

class Cbbb
/*java允許同套件中不同類別彼此之間有想同名稱的member 和之後建立的變數名
  java不能以數字開頭命名
*/
{   
    double x;
    double y;

    public String toString() { //系統默認的方法 我們要覆寫他 使用我們想要的格式
        return "" + x + " " + y; // 因為是函式 所以要回傳值(使用方法的制定) 不能只是輸出數字 要換成字串加值 不然會變成16進位的數字輸出來
    }

    public static void main(String[] args){ //一個類別中只能存在一個main()
        Cbbb obj = new Cbbb(); // 只是要建立物件並調用之前宣告的 建立一個方法的意思
        //宣告變數   建立變數
        //上述的指令完整為: Cbbb obj;
        //                 obj = new Cbbb;
                        //要加() 默認語法 表示可能會加上參數 算是一個方法
                        //main 方法是Java應用程式的入口點
        // 類別內容可以在類別的大括號中加上此處的基本架構main()就可以了
        Cbbb obj2 = new Cbbb();
        Cbbb avg = new Cbbb();

        obj.x=5.2; obj.y=3.9; // 調用之前建立的類別成員來充當宣告建立的變數的值
        obj2.x=6.2; obj2.y=4.6;

        avg.x = (obj.x + obj2.x) / 2;
        avg.y = (obj.y + obj2.y) / 2;



        System.out.println(obj); //系統會自動用到默認的toString函數 所以上文中要先覆寫 這樣才可以不用再括號鐘用字串連結達到輸出變數成字串
          //為輸出的基本架構
        System.out.println(obj2);
        System.out.println(avg);
    }
}