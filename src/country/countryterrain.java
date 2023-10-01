package country;

public class countryterrain extends Country{
    
    private String countryTerrain;
    public countryterrain() {
    }

    public countryterrain( String countryCode, String countryName, float totalArea,String countryTerrain) {
         super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
       
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public String toString() {
        return super.toString()+", countryTerrain: " + countryTerrain ;
    }
        
}
