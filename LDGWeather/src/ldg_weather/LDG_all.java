/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldg_weather;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author salva
 */
public class LDG_all {

    @SerializedName("coord")
    @Expose
    private LDG_Coord_weather coord;
    @SerializedName("weather")
    @Expose
    private List<LDG_Weather> weather = null;
    @SerializedName("base")
    @Expose
    private String base;
    @SerializedName("main")
    @Expose
    private LDG_Main main;
    @SerializedName("visibility")
    @Expose
    private Integer visibility;
    @SerializedName("wind")
    @Expose
    private LDG_Wind wind;
    @SerializedName("clouds")
    @Expose
    private LDG_Clouds clouds;
    @SerializedName("dt")
    @Expose
    private Integer dt;
    @SerializedName("sys")
    @Expose
    private LDG_Sys sys;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("cod")
    @Expose
    private Integer cod;    
    
    public LDG_Coord_weather getCoord() {
        return coord;
    }

    public void setCoord(LDG_Coord_weather coord) {
        this.coord = coord;
    }

    public List<LDG_Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<LDG_Weather> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public LDG_Main getMain() {
        return main;
    }

    public void setMain(LDG_Main main) {
        this.main = main;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public LDG_Wind getWind() {
        return wind;
    }

    public void setWind(LDG_Wind wind) {
        this.wind = wind;
    }

    public LDG_Clouds getClouds() {
        return clouds;
    }

    public void setClouds(LDG_Clouds clouds) {
        this.clouds = clouds;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public LDG_Sys getSys() {
        return sys;
    }

    public void setSys(LDG_Sys sys) {
        this.sys = sys;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }
    
}
