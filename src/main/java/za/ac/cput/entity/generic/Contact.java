package za.ac.cput.entity.generic;

public class Contact {
    private String cellPhone,homePhone, email;

    public Contact(Builder builder) {
        this.cellPhone= builder.cellPhone;
        this.homePhone= builder.homePhone;;
        this.email= builder.email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "cellPhone='" + cellPhone + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static  class  Builder{

        private String cellPhone,homePhone, email;

        public Builder setCellPhone(String cellPhone) {
            this.cellPhone = cellPhone;
            return this;
        }

        public Builder setHomePhone(String homePhone) {
            this.homePhone = homePhone;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return  this;
        }
        public   Builder copy(Contact contact){
            this.cellPhone=contact.cellPhone;
            this.homePhone=contact.homePhone;
            this.email=contact.email;

            return this;
        }

        public Contact build(){

            return  new Contact(this);
        }
    }

}
