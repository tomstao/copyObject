public class Cars {
    private String make;
    private String model;
    private int year;

    Cars(String make, String model, int year) {
        setMake(make);
        setModel(model);
        setYear(year);
    }

    Cars(Cars x ){
        // Copy constructor
        copy(x);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void copy(Cars x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }


}
