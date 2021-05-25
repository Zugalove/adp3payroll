package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Contact;

import static org.junit.jupiter.api.Assertions.*;

class ContactFactoryTest {
    @Test
    public void createContact(){
        Contact contact=ContactFactory.createContact("747477474","85874734636", "@t9zuga") ;
         System.out.println(contact);
    }

}