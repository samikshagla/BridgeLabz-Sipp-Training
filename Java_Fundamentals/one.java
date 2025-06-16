public class one
{
    public static void main(String[]args)
{
    int earth_radius_km=6378;
    double earth_radius_miles=earth_radius_km*0.621371;
    double const_volume=(4.0/3.0)*3.14;
    double volume_km=const_volume*Math.pow(earth_radius_km,3);
    double volume_miles=const_volume*Math.pow(earth_radius_miles,3);
    System.out.println("The volume of earth in cubic kilometers is:"+""+ volume_km +" " +"and cubic miles is:"+volume_miles);
}
}