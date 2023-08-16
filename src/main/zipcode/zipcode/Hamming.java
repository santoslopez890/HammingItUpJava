package zipcode;

public class Hamming {
    private int hammingDistance;
    public Hamming(String s, String s1)throws IllegalArgumentException {
    char[] carOne=s.toCharArray();
        char[] carTwo=s1.toCharArray();
        int smaller = Math.min(carOne.length, carTwo.length);
        for (int i = 0; i < smaller; i++) {
            if(carOne[i]!=carTwo[i]){
                hammingDistance++;
            }
        }
        
    }

    public int getHammingDistance() {
        return hammingDistance;
    }
}
