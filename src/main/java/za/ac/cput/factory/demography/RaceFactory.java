package za.ac.cput.factory.demography;

import za.ac.cput.entity.demography.Race;
import za.ac.cput.util.GenericHelper;

public class RaceFactory {
    public  static   Race createRace(String desc){
        String raceID=GenericHelper.generateId();
        Race race=new Race.Builder()
                .setId(raceID)
                .setDesc(desc)
                .builder();
        return race;
    }

}
