package org.example.builder;

public class User {
    private  String name;
    private int age;
    private String email;
    private String city;

    private User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.age = userBuilder.age;
        this.email = userBuilder.email;
        this.city= userBuilder.city;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email=" + email +
                ", city='" + city + '\'' +
                '}';

    }

    public static class UserBuilder {
        private String name;
        private int age;
        private String email;
        private String city;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        User build(){
            return  new User(this);
        }
    }
}

