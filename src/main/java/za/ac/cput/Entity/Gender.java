package za.ac.cput.Entity;

public class Gender {
    private  String id, desc;

    public Gender(Builder builder) {
        this.id=builder.id;
        this.desc=builder.desc;

    }

    @Override
    public String toString() {
        return "Gender{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public static class  Builder{

        private String id, desc;
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setDesc(String desc) {
            this.desc = desc;
            return  this;

        }
        public  Builder copy(Gender gender){

            this.id=gender.id;
            this.desc=gender.desc;
            return this;
        }
        public Gender build(){

            return new Gender(this);
        }
    }

}
