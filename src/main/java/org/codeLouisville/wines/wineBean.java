package org.codeLouisville.wines;



public class wineBean {
    float pH;
    float sulphates;
    float alcohol;
    int quality;

    public wineBean(String a_pH, String a_sulphates, String a_alcohol, String a_quality){
        pH = Float.parseFloat(a_pH);
        sulphates = Float.parseFloat(a_sulphates);
        alcohol = Float.parseFloat(a_alcohol);
        quality = Integer.parseInt(a_quality);
    }

    public float getpH() {
        return pH;
    }

    public float getSulphates() {
        return sulphates;
    }

    public float getAlcohol() {
        return alcohol;
    }

    public int getQuality() {
        return quality;
    }


    public void setpH(float pH) {
        this.pH = pH;
    }

    public void setSulphates(float sulphates) {
        this.sulphates = sulphates;
    }

    public void setAlcohol(float alcohol) {
        this.alcohol = alcohol;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Wine data " + pH + " " + sulphates + " " + alcohol + " " + quality;
    }
}