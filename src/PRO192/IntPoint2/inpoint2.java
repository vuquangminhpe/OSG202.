package PRO192.IntPoint2;

public class inpoint2 {
    int x = 7 , y =3;
    public inpoint2(){
        output();
        x=100;
        y=1000;
        output();
    }
    public inpoint2(int x,int y){
        output();
        this.x = x;
        this.y =y;
        output();
    }
    public void output(){
        String s = "[" + x + "," + y + "]";
        System.out.println(s);
    }
}
