/**
 * Created by CMB on 01/11/2016.
 */


public class Actor{

    private String fName;
    private String lName;

    //User-defined constructor
    public Actor(String fName, String lName){
        setFName(fName);
        setLName(lName);
    }

    //Setters & Getters
    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}
