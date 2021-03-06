package pt.ua.diogobento.guiao1.weather.impa_client;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * list of city's forecasts (class was generated by jsonschema2pojo )
 */
public class IpmaCityForecast {

        @SerializedName("owner")
        @Expose
        private String owner;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("data")
        @Expose
        private List<CityForecast> data = null;
        @SerializedName("globalIdLocal")
        @Expose
        private Integer globalIdLocal;
        @SerializedName("dataUpdate")
        @Expose
        private String dataUpdate;

    /**
     * gets Owner String
     * @return who got the data
     */
    public String getOwner() {
            return owner;
        }

    /**
     * sets Owner String
     * @param owner who got the data
     */
    public void setOwner(String owner) {
            this.owner = owner;
        }

    /**
     * get Country
     * @return Contry data is relative to
     */
    public String getCountry() {
            return country;
        }

    /**
     * set data country
     * @param country country of data origin
     */
    public void setCountry(String country) {
            this.country = country;
        }

    /**
     * get forecasts list
     * @return forecasts
     * @see pt.ua.diogobento.guiao1.weather.impa_client.CityForecast
     */
    public List<CityForecast> getData() {
            return data;
        }

    /**
     * set forecasts list
     * @param data forecasts
     * @see pt.ua.diogobento.guiao1.weather.impa_client.CityForecast
     */
    public void setData(List<CityForecast> data) {
            this.data = data;
        }

    /**
     * get id
     * @return place ID
     */
    public Integer getGlobalIdLocal() {
            return globalIdLocal;
        }

    /**
     * set id
     * @param globalIdLocal place id,int
     */
        public void setGlobalIdLocal(Integer globalIdLocal) {
            this.globalIdLocal = globalIdLocal;
        }

    /**
     * get date of request
     * @return API call date
     */
    public String getDataUpdate() {
            return dataUpdate;
        }

    /**
     * set date of request
     * @param dataUpdate date of update
     */
    public void setDataUpdate(String dataUpdate) {
            this.dataUpdate = dataUpdate;
        }
}

