package za.ac.cput.Factory;

import za.ac.cput.Entity.Gender;
import za.ac.cput.Util.GenericHelper;

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
