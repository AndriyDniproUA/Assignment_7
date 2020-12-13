package com.savytskyy.Lesson6.RegExBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserParser {

    List<User> parseGroup (String user) {

        List<User> userList= new ArrayList<>();
        String[] userArray = user.split(",") ;
        for (int i = 0; i < userArray.length; i++) {
            //System.out.println(userArray[i]);
            if (!userArray[i].contains(":@")) {
                userList.add(parseSingle(userArray[i]));
            }
        }
        return userList;
    }


    public User parseSingle(String user){

        String userIdPattern = "(?:(\\w+):)?(\\w+)(?:@(\\w+))?";

        Pattern pattern = Pattern.compile(userIdPattern);
        Matcher matcher = pattern.matcher(user);

        if (matcher.find()) {
            String nickName = matcher.group(1);
            String userName = matcher.group(2);
            String passWord = matcher.group(3);

            if (nickName == null) {nickName = userName;}

            return new User(nickName, userName, passWord);

        } else {
            return null;
        }
    }





}
