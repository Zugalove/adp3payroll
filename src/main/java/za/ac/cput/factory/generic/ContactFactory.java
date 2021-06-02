package za.ac.cput.factory.generic;

import za.ac.cput.entity.generic.Contact;
import za.ac.cput.util.GenericHelper;

public class ContactFactory {
    public  static Contact createContact(String cellPhone, String homePhone, String email) {
        String contactId = GenericHelper.generateId();
        Contact contac = new Contact.Builder()
                .setCellPhone(cellPhone)
                .setHomePhone(homePhone)
                .setEmail(email)
                .build();
        return contac;
    }
}
