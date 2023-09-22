class CSphere{ // (circle)perimeter= 2πr
               // area=  πr^2

               // 會用到微積分
               // A = 4πr^2 (球面積公式)
               // V = (4/3)πr^3 (球體積公式)
    private int x; // 圓心x座標
    private int y; // 圓心y座標
    private int z; // 圓心z座標
    private int radius; // 圓球半徑

    void setLocation(){ // main的自訂參數是從這裡進入的
        x = 3;
        y = 4;
        z = 5;
    }

    void setRadius(){
        radius = 1;
    }

    double surfaceArea(){ // 表面積
        return 4 * 3.14 * (radius*radius);
    }

    double volume(){
        return (4/3) * 3.14 * (radius*radius*radius);
    }

    void showCenter(){
        System.out.println(""+ x + "\n" + y + "\n" + z);
    }
}

public class hw8_16 {
    public static void main(String args[]){ // 別忘記物件導向到最後要加上調用類別及方法 以啟用 才算是完整完成程式
        CSphere sphere = new CSphere(); // 容器
        sphere.setLocation();
        sphere.setRadius();
        sphere.surfaceArea(); //直接調用不 用於後續計算 可以不用給變量存放
        sphere.volume();
        sphere.showCenter();
    }
}
