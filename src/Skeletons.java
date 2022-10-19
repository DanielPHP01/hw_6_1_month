public class Skeletons extends Boss {

    int numberArrows;

    public int getNumberArrows() {
        return numberArrows;
    }

    public void setNumberArrows(int numberArrows) {
        this.numberArrows = numberArrows;
    }

    @Override
    public String printInfo() {
        return super.printInfo()+" Number arrows:  "+ this.numberArrows;
    }
}
