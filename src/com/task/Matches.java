package com.task;

public class Matches {

    // Number of squares
    private int squaresNumber;
    // Minimum number of matches
    private int numberMatches = 0;

    // Setter for squaresNumber
    public void setSquaresNumber(int squaresNumber)
    {
        if(squaresNumber <= 0) throw new Error("Quantity lower 0.");
        this.squaresNumber = squaresNumber;
    }

    // Getter for squaresNumber
    public int getSquaresNumber()
    {
        return this.squaresNumber;
    }

    // Getter for numberMatches
    public int getNumberMatches() {
        if(numberMatches == 0) this.setNumberMatches();
        return this.numberMatches;
    }

    // Setter for numberMatches
    private void setNumberMatches() {
        int sum = 0;
        int width = (int) Math.sqrt(this.squaresNumber);
        int length = this.squaresNumber / width;
        int remainder = this.squaresNumber - width * length;
        if (remainder != 0) {
            sum = 2 * remainder + 1;
        }

        this.numberMatches = width * (length + 1) + length * (width + 1) + sum;
    }


}
