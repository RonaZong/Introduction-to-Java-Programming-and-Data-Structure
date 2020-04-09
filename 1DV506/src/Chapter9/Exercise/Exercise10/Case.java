package Chapter9.Exercise.Exercise10;

public interface Case {
    static Location largestValue(double[][] doubles) {
        Location highest = new Location(-1, -1, Double.MIN_VALUE);
        for (int i = 0; i < doubles.length; i++) {
            for (int k = 0; k < doubles[i].length; k++) {
                double value = doubles[i][k];
                if (value > highest.getMaxValue()) {
                    highest = new Location(i, k, value);
                }
            }
        }
        return highest;
    }
}
