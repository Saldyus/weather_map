/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldg_weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author salva
 */
public class LDG_Position {

    @SerializedName("location")
    @Expose
    private LDG_Location location;
    @SerializedName("accuracy")
    @Expose
    private Double accuracy;

    public LDG_Location getLocation() {
        return location;
    }

    public void setLocation(LDG_Location location) {
        this.location = location;
    }

    public Double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }
}
