package com.automationAPI.models;

import com.automationAPI.lib.BaseResponseApi;

import java.util.List;

public class Planets extends BaseResponseApi {
    private String name;
    private String diameter;
    private String rotation_period;
    private String orbital_period;
    private String gravity;
    private String population;
    private String climate;
    private String terrain;
    private String surface_water;
    private List<String> residents;
    private List<String> films;
    private String url;
    private String created;
    private String edited;

    public Planets() {
    }

    public Planets(String name, String diameter, String rotation_period, String orbital_period, String gravity, String population, String climate, String terrain, String surface_water, List<String> residents, List<String> films, String url, String created, String edited) {
        this.name = name;
        this.diameter = diameter;
        this.rotation_period = rotation_period;
        this.orbital_period = orbital_period;
        this.gravity = gravity;
        this.population = population;
        this.climate = climate;
        this.terrain = terrain;
        this.surface_water = surface_water;
        this.residents = residents;
        this.films = films;
        this.url = url;
        this.created = created;
        this.edited = edited;
    }

    public String getName() {
        return name;
    }

    public String getDiameter() {
        return diameter;
    }

    public String getRotation_period() {
        return rotation_period;
    }

    public String getOrbital_period() {
        return orbital_period;
    }

    public String getGravity() {
        return gravity;
    }

    public String getPopulation() {
        return population;
    }

    public String getClimate() {
        return climate;
    }

    public String getTerrain() {
        return terrain;
    }

    public String getSurface_water() {
        return surface_water;
    }

    public List<String> getResidents() {
        return residents;
    }

    public List<String> getFilms() {
        return films;
    }

    public String getURL() {
        return url;
    }

    public String getCreated() {
        return created;
    }

    public String getEdited() {
        return edited;
    }
}
