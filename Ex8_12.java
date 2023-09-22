// hw8_12, 視窗類別

class CWin
{
    int width;
    int height;
    String name;

    void setW(int w) /* 要用main來設定類別成員的值才需要像這樣
                        使用建構函數來設定參數裡的資料類別 */
    {
        width = w;
    }
    void setH(int h)
    {
        height = h;
    }
    void setName(String s)
    {
        name = s;
    }

//  多載
    void setWindows(int w, int h, String s)
      // 多載表示兩個函式名稱相同但參數個數、類型、順序不同
    {
        width = w;
        height = h;
        name = s;
    }
    void setWindows(String s)
    {
        name = s;
    }


    public void show()
    {
        System.out.println("w="+width+", H="+height);
    }

}

public class hw8_12 {
    public static void main(String args[]){ // 要使用方法要件個容器給它放
        CWin cw = new CWin();
        cw.setName("My Windows");
        cw.setW(5);
        cw.setH(3);
        cw.show();

        // System.out.println(cw); // 只會印出show()的內容
    }
}