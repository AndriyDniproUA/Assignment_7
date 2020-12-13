package com.savytskyy.Lesson6.RegExBasics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String testString = "nickname:username@password,programmer:vasia@123,programmer:vasia,vasia@1234,vasia,vasia:@trulala";

        List<User> userList = new UserParser().parseGroup(testString);
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));
        }
    }
}




