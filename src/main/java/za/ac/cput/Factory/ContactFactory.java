package za.ac.cput.Factory;

import za.ac.cput.Entity.Contact;
import za.ac.cput.Util.GenericHelper;

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
