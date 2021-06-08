package za.ac.cput.service.demography;

import za.ac.cput.entity.demography.Race;
import za.ac.cput.repository.demorgraphy.RaceRepository;

public class RaceServiceImpl implements RaceService {
 private static RaceService service=null;
 private RaceRepository repository;


    public RaceServiceImpl(RaceRepository repository) {
        this.repository = repository;
    }

    public RaceServiceImpl() {

    }

    public static RaceService getService() {
        if (service==null) service=new RaceServiceImpl();
        return service;
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
