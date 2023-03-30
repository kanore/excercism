public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() { return 40; }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutesInOven() - minutesInOven;

    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int noLayers) {
        return noLayers * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int noLayers, int noMinutes) {
        return preparationTimeInMinutes(noLayers) + noMinutes;
    }
}
