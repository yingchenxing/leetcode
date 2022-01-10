package week1.no374.q3;

import java.util.Arrays;

class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int sum = mass;

        Arrays.sort(asteroids);
        for (int i = 0; i < asteroids.length; i++) {
            if (mass >= asteroids[i]) {
                if (mass>asteroids[asteroids.length-1])
                    return true;
                else
                    mass += asteroids[i];
            } else
                return false;
        }

        return true;
    }


    public static void main(String[] args) {
    }
}
