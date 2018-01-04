/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldg_weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author salva
 */
public class LDG_City_json {

    @SerializedName("city")
    @Expose
    protected List<LDG_City> city = null;

    public List<LDG_City> getCity() {
        return city;
    }

    public void setCity(List<LDG_City> city) {
        this.city = city;
    }

}
