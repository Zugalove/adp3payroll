package za.ac.cput.repository.demorgraphy;

import za.ac.cput.entity.demorgraphy.Race;

import java.util.HashSet;
import java.util.Set;

public class RaceRepository {
    private Set<Race> raceDb;

    // create constructor
    public RaceRepository() {

        this.raceDb = new HashSet<>();
    }


}

