
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment comparedApartment){
        if(this.squares>comparedApartment.squares){
             return true;
        }else{
            return false;
        }
    }
    
    public int priceDifference(Apartment compared){
        return Math.abs((this.squares*this.princePerSquare)-(compared.squares*compared.princePerSquare));
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if(this.princePerSquare>compared.princePerSquare){
            return true;
        }else{
            return false;
        }
    }

}
