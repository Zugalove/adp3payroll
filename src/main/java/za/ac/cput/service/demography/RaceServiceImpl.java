package za.ac.cput.service.demography;

import za.ac.cput.entity.demography.Race;
import za.ac.cput.repository.demorgraphy.RaceRepository;
import za.ac.cput.service.RaceService;

public class RaceServiceImpl implements RaceService<Race ,String> {
 private static RaceService<Race ,String> service=null;
 private static RaceRepository repository;


    public RaceServiceImpl(RaceRepository repository) {
        this.repository = repository;
    }

    public RaceServiceImpl() {

    }

    @Override
    public Race create(Race race) {

        return this.repository.create(race);
    }

    @Override
    public Race read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Race update(Race race) {
        return this .repository.update(race);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);

    }
}
