package zipcode;

public class Hamming {
    private int hammingDistance;
    public Hamming(String s, String s1) throws IllegalArgumentException{

            char[] carOne = s.toCharArray();
            char[] carTwo = s1.toCharArray();
        if(carOne.length!=carTwo.length){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
            for (int i = 0; i < carTwo.length; i++) {
                if (carOne[i] != carTwo[i]) {
                    hammingDistance++;
                }
            }

    }

    public int getHammingDistance() {
        return hammingDistance;
    }
}
