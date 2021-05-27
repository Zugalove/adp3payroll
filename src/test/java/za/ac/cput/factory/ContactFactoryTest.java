package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.generic.Contact;

class ContactFactoryTest {
    @Test
    public void createContact(){
        Contact contact=ContactFactory.createContact("747477474","85874734636", "@t9zuga") ;
         System.out.println(contact);
    }

}