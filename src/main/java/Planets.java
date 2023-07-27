public class Planets {
    public enum SolarSystem {
        MERCURY(0,0,2439, null, null),
        VENUS(2, 107, 6051, MERCURY, null),
        EARTH(3, 108, 6371, VENUS, null),
        MARS(4, 53, 3389,EARTH, null),
        JUPITER(
                5, 228,69911, MARS, null),
        SATURN(6, 779, 58232, JUPITER, null),
        URANUS(7, 1, 25362, SATURN, null),
        NEPTUNE(8, 1, 24622, URANUS, null);

        private final int orderFromSun;
        private final int prevDistance;
        private final int distanceFromSun;
        private final int radius;
        private final SolarSystem previousPlanet;
        private final SolarSystem nextPlanet;

        SolarSystem(int orderFromSun, int prevDistance, int radius, SolarSystem previousPlanet, SolarSystem nextPlanet) {
            this.orderFromSun = orderFromSun;
            this.prevDistance = prevDistance;
            this.radius = radius;
            this.previousPlanet = previousPlanet;
            this.nextPlanet = nextPlanet;

            if (previousPlanet == null) {
                this.distanceFromSun = 0;
            } else {
                this.distanceFromSun = previousPlanet.getDistanceFromSun() + prevDistance;
            }
        }
        public int getOrderFromSun() {
            return orderFromSun;
        }
        public int getPrevDistance() {
            return prevDistance;
        }
        public int getDistanceFromSun() {
            return distanceFromSun;
        }
        public int getRadius() {
            return radius;
        }
        public SolarSystem getPreviousPlanet() {
            return previousPlanet;
        }
        public SolarSystem getNextPlanet() {
            return nextPlanet;
        }

    }
    public static void main(String[] args) {
        SolarSystem planet = SolarSystem.EARTH;
        System.out.println("Planet: " + planet);
        System.out.println("Order from Sun: " + planet.getOrderFromSun());
        System.out.println("Distance from Sun: " + planet.getDistanceFromSun());
        System.out.println("Radius: " + planet.getRadius());
        System.out.println("Previous Planet: " + planet.getPreviousPlanet());
        System.out.println("Next Planet: " + planet.getNextPlanet());
    }
}
