public class Rectangle {
    private int height=1;
    private int width=1;

    public Rectangle(int h,int w){
    setHeight(h);
    setWidth(w);
    }
    void setHeight(int h){
        if(h>0) {
            height = h;
        }
    }
    int getHeight(){
        return height;
    }
    void setWidth(int w){
        if(w>0){
            width=w;
        }
    }
    int getWidth(){
        return width;
    }
    void Area(){
        System.out.println("Area of rectangle is :"+ (height*width));
    }
    void perimeter(){
        System.out.println("Perimeter of rectangle is :"+ (2*height+2*width));
    }
}
