// package assi.ch8;

class CBox
{
    int length;
    int width;
    int height;

    int volume(){
        return length * width * height; // 回傳這個方式 以幫函數成員建立運作方法
          // 因為是同個class中 所以直接使用他們的類別成員名稱就好 不用打資料類型
    }

    int surfaceArea(){
        return length*width*6;
    }

    void showDate(){
        System.out.println("length= " + length);
        System.out.println("width= " + width);
        System.out.println("height= " + height);
    }

    void showAll(){
        showDate();
        System.out.println("surface of box= " + surfaceArea());
          // "\n" 直接打在字串中可以換行
        System.out.println("volume of box= " + volume());
    }
}

public class hw8_5 {
    public static void main(String args[]){
        CBox box = new CBox();
        box.length = 1;
        box.width = 1;
        box.height = 1;

        box.showAll(); // 調用一個show()自訂函數來顯示資訊 然後要在public class 外的class中加上一個自訂方法的output資訊
    }
}
//沒有在 main 方法中加入任何輸出語句。 所以雖然 showAll 方法內部有輸出，但由於沒有輸出到控制台，所以你看不到任何結果。