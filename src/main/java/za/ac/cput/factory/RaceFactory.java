package za.ac.cput.factory;

import za.ac.cput.entity.demorgraphy.Race;
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
