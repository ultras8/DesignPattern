public class Foot {
    private FootShape footShape;
    private String footType;

    public Foot(FootShape footShape , String footType){
        this.footShape = footShape;
        this.footType = footType;
    }
    public String draw(){
        switch(footType) {
            case "Ellipse":
                return footShape.drawAsEllipse();
            case "Rectangle": //complete MountainCustomer
                return footShape.drawAsRectangle();
        }
        return "TryAgain";
    }
    
}