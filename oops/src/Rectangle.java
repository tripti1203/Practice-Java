public class Rectangle {
    private int height;
    private int width;
    void setHeight(int h){
        height=h;
    }
    int getHeight(){
        return height;
    }
    void setWidth(int w){
        width=w;
    }
    int getwidth(){
        return width;
    }
    void Area(){
        System.out.println(height*width);
    }
    void perimeter(){
        System.out.println(2*height+2*width);
    }
}
