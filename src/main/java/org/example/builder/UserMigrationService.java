package org.example.builder;

public class UserMigrationService {

    public void migrateUser(){

//        User builder = new User.UserBuilder();
//        builder.setName("Rahul")
//                .setAge(35)
//                .setEmail("rahul@gmail.com");
//
//        User user = new User(builder);
//

        User user = new User.UserBuilder()
                .setName("Rahul")
                .setAge(25)
                .setEmail("rahul@gmail.com")
                .build();

        System.out.println("User migrated ->" + user);
    }



}
