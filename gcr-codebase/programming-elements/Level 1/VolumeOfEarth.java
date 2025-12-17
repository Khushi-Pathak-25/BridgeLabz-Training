class VolumeOfEarth{
    public static void main(String[]args){
    //radius of Earth in km
    int radius= 6378;
     
    //Calculate volume of Earth in km^3
    double volumeInKm = (4.0 / 3) * Math.PI * radius * radius * radius;
    //Calculate volume of Earth in miles^3
    double volumeInMiles = volumeInKm * 0.2399;

    System.out.println("The volume of earth in cubic kilometers is "+volumeInKm+" and cubic miles is "+volumeInMiles);
    }
}