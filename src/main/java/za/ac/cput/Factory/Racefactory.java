package za.ac.cput.Factory;

import za.ac.cput.Entity.Race;
import za.ac.cput.Util.GenericHelper;

public class Racefactory {
    public  static   Race createRace(String desc){
        String raceID=GenericHelper.generateId();
        Race race=new Race.Builder()
                .setId(raceID)
                .setDesc(desc)
                .builder();
        return race;
    }

}
