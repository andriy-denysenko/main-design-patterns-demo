class User{

    // Required fields
    private String email;
    private String password;

    // Optional fields
    private String fullName;
    private int age;
    private String phoneNumber;

    public static class Builder {
        private User newUser;

        public Builder(){
            newUser = new User();
        }

        public Builder setEmail(String email){
            newUser.email = email;
            return this;
        }

        public Builder setPassword(String password){
            newUser.password = password;
            return this;
        }

        public Builder setFullName(String fullName){
            newUser.fullName = fullName;
            return this;
        }

        public Builder setAge(int age){
            newUser.age = age;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber){
            newUser.phoneNumber = phoneNumber;
            return this;
        }

        public User build(){
            return newUser;
        }

    }

    public void print(){
        System.out.print(
            "User:     " + this.fullName + "\n" +
            "Email:    " + this.email + "\n" +
            "Password: " + this.password + "\n" +
            "Age:      " + this.age + "\n" +
            "Phone:    " + this.phoneNumber + "\n");
        }
}

class BuilderDemo{
    public static void main(String[] args){
        User myUser = new User.Builder()
            .setEmail("name@example.com")
            .setPassword("secret123")
            .setFullName("New User")
            .setAge(30)
            .setPhoneNumber("555-55-55")
            .build();

        myUser.print();
    }
}