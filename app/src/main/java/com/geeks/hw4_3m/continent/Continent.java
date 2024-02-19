package com.geeks.hw4_3m.continent;

import android.os.Bundle;

import com.geeks.hw4_3m.R;
import com.geeks.hw4_3m.country.CountryFragment;

public class Continent {
    public String nameContinent;
    public String imgContinent;

    public Continent(String nameContinent, String imgContinent) {
        this.nameContinent = nameContinent;
        this.imgContinent = imgContinent;
    }

    public String getNameContinent() {
        return nameContinent;
    }

    public void setNameContinent(String nameContinent) {
        this.nameContinent = nameContinent;
    }

    public String getImgContinent() {
        return imgContinent;
    }

    public void setImgContinent(String imgContinent) {
        this.imgContinent = imgContinent;
    }

}
