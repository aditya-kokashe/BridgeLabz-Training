/*Write a Program to compute the volume of Earth in km^3 and miles^3*/

public class VolumeOfEarth {
    public static void main(String[] args) {

		//Create variables of radii in Kilometers and Miles
        double radiusKilometers = 6378;                 
        double radiusMiles = radiusKilometers * 0.6; 
		//Calculate volume in Kilometer cube and Mile cube
        double volumeKilometerCube = (4.0 / 3.0) * Math.PI * Math.pow(radiusKilometers, 3);
        double volumeMilesCube = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

		//Display the results
        System.out.println("The volume of earth in cubic kilometers is: " + volumeKilometerCube + 
		" and cubic miles is: " + volumeMilesCube);
    }
}