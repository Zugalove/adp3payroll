package za.ac.cput.repository.demorgraphy;

import za.ac.cput.entity.demography.Race;
import za.ac.cput.repository.Repository;

import java.util.HashSet;
import java.util.Set;

public class RaceRepository implements Repository<Race, String> {
    private  Set<Race> raceDB;

    public RaceRepository() {

        this.raceDB = new HashSet<>();
    }


    @Override
    public Race create(Race race) {
        this.raceDB.add(race);
        return race;
    }

    @Override
    public Race read(String raceId) {
       Race gender=this.raceDB.stream().filter(g -> g.getId()
                .equalsIgnoreCase(raceId))
                .findAny()
                .orElse(null);
        return gender;
    }

    @Override
    public Race update(Race race) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
