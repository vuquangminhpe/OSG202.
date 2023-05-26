package PRO192.boxPkg.rectPkg;


public class Rectangle {
    public class Box extends Rectangle {
        int height;
        protected int price;
        private int weight;

        void setSize(int l, int w, int h) {

            height = h > 0 ? h : 0;
        }


        private void setSize(int l, int w) {
        }
    }

}
