
package country;


public class Country {
    private String countryCode;
    private String countryName;
    private float totalArea;

    public Country() {
    }

    public Country(String countryCode, String countryName, float totalArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.totalArea = totalArea;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }
    // hiển thị thông tin quốc gia 

    @Override
    public String toString() 
    {
        return  "countryCode: " + countryCode + ", countryName: " + countryName + ", totalArea: " + totalArea ;
    }
    
}
