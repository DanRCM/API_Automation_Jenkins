package com.automationAPI.models;

import com.automationAPI.lib.BaseResponseApi;

import java.util.List;

public class People extends BaseResponseApi {
    private String name;
    private String birth_year;
    private String eye_color;
    private String gender;
    private String hair_color;
    private String height;
    private String mass;
    private String skin_color;
    private String homeworld;
    private List<String> films;
    private List<String> species;
    private List<String> starships;
    private List<String> vehicles;
    private String url;
    private String created;
    private String edited;

    public People(String name, String birthYear, String eyeColor, String gender, String hairColor, String height, String mass, String skinColor, String homeworld, List<String> films, List<String> species, List<String> starships, List<String> vehicles, String url, String created, String edited) {
        this.name = name;
        this.birth_year = birthYear;
        this.eye_color = eyeColor;
        this.gender = gender;
        this.hair_color = hairColor;
        this.height = height;
        this.mass = mass;
        this.skin_color = skinColor;
        this.homeworld = homeworld;
        this.films = films;
        this.species = species;
        this.starships = starships;
        this.vehicles = vehicles;
        this.url = url;
        this.created = created;
        this.edited = edited;
    }

    public People() {
    }

    public String getName() {
        return name;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public String getEye_color() {
        return eye_color;
    }

    public String getGender() {
        return gender;
    }

    public String getHair_color() {
        return hair_color;
    }

    public String getHeight() {
        return height;
    }

    public String getMass() {
        return mass;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public List<String> getFilms() {
        return films;
    }

    public List<String> getSpecies() {
        return species;
    }

    public List<String> getStarships() {
        return starships;
    }

    public List<String> getVehicles() {
        return vehicles;
    }

    public String getUrl() {
        return url;
    }

    public String getCreated() {
        return created;
    }

    public String getEdited() {
        return edited;
    }
}
