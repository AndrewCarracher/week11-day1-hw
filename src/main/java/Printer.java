public class Printer {

    private int numberOfSheets;
    private int toner;

    public Printer(int paper, int toner){
        this.numberOfSheets = paper;
        this.toner = toner;
    }

    public void print(int numberOfPages, int numberOfCopies){
        if(this.numberOfSheets > numberOfPages){
            this.numberOfSheets = this.numberOfSheets - numberOfCopies;
            this.toner = this.toner - numberOfCopies;
        }
    }

    public void refillPaper(int paperAdded){
        this.numberOfSheets =  this.numberOfSheets + paperAdded;
    }

    public void refillToner(int tonerAdded){
        this.toner =  this.toner + tonerAdded;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }

    public int getToner() {
        return toner;
    }
}
