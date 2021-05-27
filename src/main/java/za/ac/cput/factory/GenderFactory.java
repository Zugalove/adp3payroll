package za.ac.cput.factory;

import za.ac.cput.entity.demorgraphy.Gender;
import za.ac.cput.util.GenericHelper;

public class GenderFactory {

    public   static Gender createGender(String desc){
        String genderid = GenericHelper.generateId();
        Gender gender=new Gender.Builder()
                .setId(genderid)
                .setDesc(desc)
                .build();
        return gender;
    }
}
