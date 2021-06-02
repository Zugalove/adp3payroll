package za.ac.cput.factory.demography;

import za.ac.cput.entity.demography.Gender;
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
