package za.ac.cput.repository.demorgraphy;

import za.ac.cput.entity.demography.Gender;
import za.ac.cput.repository.Repository;

import java.util.HashSet;
import java.util.Set;

public class GenderRepository implements Repository<Gender, String> {
    // data structures to store data
    //   Set, Maps , lists, trees, objects
    //     RAM : uses data storage mechanism to store data
    //       create , read, update , delete;

     private Set<Gender> genderDB;

     public GenderRepository (){

         this .genderDB=new HashSet<>();
     }


    @Override
    public Gender create(Gender gender) {
         this.genderDB.add(gender);
        return gender;
    }

    @Override
    public Gender read(String genderId) {
         Gender gender=this.genderDB.stream().filter(g -> g.getId()
                 .equalsIgnoreCase(genderId))
                 .findAny()
                 .orElse(null);
        return gender;
    }

    @Override
    public Gender update(Gender gender) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}



