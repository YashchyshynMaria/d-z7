import java.util.HashMap;



import java.util.Map;



public class PlanetsW {

    public enum Planets {



        MERCURY(1, 0, 5, null, "VENUS"),



        VENUS(2, 4, 3, MERCURY, "EARTH"),



        EARTH(3, 2, 2, VENUS, "MARS"),



        MARS(4, 4, 3, EARTH, "JUPITER"),



        JUPITER(5, 1, 5, MARS, "SATURN"),



        SATURN(6, 3, 4, JUPITER, "URANUS"),



        URANUS(7, 7, 5, SATURN, "NEPTUNE"),



        NEPTUNE(8, 4, 6, URANUS, null);





        public final int numberFromSun;



        public final double distanceFromPreviousPlanet;



        public final double distanceFromSun;



        public final double radius;



        public final Planets previousPlanet;



        public final String nextPlanet;





        private static final Map<Integer, Planets> planetsMap = new HashMap<Integer, Planets>();





        Planets(int numberFromSun, float distanceFromPreviousPlanet, float radius, Planets previousPlanet, String nextPlanet) {



            this.numberFromSun = numberFromSun;



            this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;



            this.radius = radius;



            this.previousPlanet = previousPlanet;



            this.nextPlanet = nextPlanet;



            this.distanceFromSun = getDistanceFromSun();



        }



        public int getPlanetNumber() {

            return this.numberFromSun;

        }



        public Planets getPreviousPlanet() {

            if (this.previousPlanet == null) {

                return null;

            } else {

                return this.previousPlanet;

            }

        }



        public double getDistanceFromSun() {

            double distance = 0;



            if (this.getPlanetNumber() == 1 || this.getPreviousPlanet() == null) {

                return distance;

            }

            distance = this.distanceFromPreviousPlanet + this.previousPlanet.getDistanceFromSun();



            return distance;

        }





        public static Planets getPlanetByNumber(int numberFromSun) {



            return planetsMap.get(numberFromSun);



        }





        public static void main(String[] args) {

            System.out.println(PlanetsW.Planets.EARTH.getDistanceFromSun());

        }



    }

}
