public class Plane {
    private int id;
    private int model;
    public int getPlaneNum() {
        return id;
    }
    public void setPlaneNum(String idString) {
        id = Integer.parseInt(idString);
    }
    public int getPlaneModel() {
        return model;
    }
    public void setPlaneModel(String modelString) {
        model = Integer.parseInt(modelString);
    }
    public void takeOff() {
        
    }
    public void land() {
        // ...
    }
}