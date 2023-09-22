// package assi.ch8;

// hw8_4, 類別的練習
class CBox // 一般寫在public class  之外 當作一個工具用於調用
{
    int length;
    int width;
    int height;

    
}
public class hw8_4{ //一個檔案只能有一個public(修飾符)的類別 因為public的特性是獨立、公開的 其他package(包)可以訪問他
                    // public只要不是拿來定義class就可以存在複數個這個詞在一個程式中 然後每個class有其各自的public main()值
                    // public class 後是檔名
                    //main()都是寫在這之下
                    //public class 中的 main() 方法是Java主要運行程式的地方
                    //沒有public的class中也可以寫方法輸出指令
    public static void main(String arge[])//[]在String/arg後面都可以
        // 一個程式中main()默認只能有一個 要多個main()要名稱、參數類型不同才可以:
        //   ex: main(), main1();  (String...), (int...)
    {
        CBox box;
        box=new CBox();

        box.length = 15;
        box.width = 10;
        box.height = 25;

        System.out.println("length = " + box.length); // 可以直接輸出 但一定要用字串加上變數連結
        System.out.println("width = " + box.width);
        System.out.println("height = " + box.height);

    }
}