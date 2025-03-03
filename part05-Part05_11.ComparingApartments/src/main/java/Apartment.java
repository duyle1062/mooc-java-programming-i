import java.lang.Math;

public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public int getSquares() {
        return this.squares;
    }
    
    public int getRooms() {
        return this.rooms;
    }
    
    public int getPrincePerSquare() {
        return this.princePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.getSquares()) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        return Math.abs(this.squares * this.princePerSquare - compared.getPrincePerSquare() * compared.getSquares());
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (this.squares * this.princePerSquare - compared.getPrincePerSquare() * compared.getSquares() >= 0) {
            return true;
        }
        return false;
    }
}
