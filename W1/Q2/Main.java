import java.util.Scanner;

public class Main {
    public static String getFootShapeType(){
        String footShapeType = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                footShapeType = "Ellipse";
                break;
            case 2:
                footShapeType = "Rectangle";
                break;
        }inp.close();
        return footShapeType;
    }


    public static void main(String[] args) {
        String footShapeType = getFootShapeType();
        FootShape footShape = new FootShape();
        Foot foot = new Foot( footShape, footShapeType );
        System.out.println(foot.draw());
    }
}
