package za.ac.cput.util;

import java.util.UUID;

public class GenericHelper {
    public  static  String generateId(){

        return UUID.randomUUID().toString();
    }
}
