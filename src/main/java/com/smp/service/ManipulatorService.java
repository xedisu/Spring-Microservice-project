package com.smp.service;

import org.springframework.stereotype.Service;

@Service
public class ManipulatorService {
    //cuts username size in half and returns the string
    public String cutsUsername(String userName) {
        if (userName == null) {
            return null;
        }
        return userName.substring(0, userName.length() / 2);
    }

    public String enlargeUsername(String userName) {
        if (userName == null) {
            return null;
        }
        if (userName.equals("")) {
            return "";
        }

        String temp = userName;
        while (userName.length() < 7) {
            userName += temp;
        }

        return userName;
    }

    // if username first char  == uppercase, delete every appearence of that letter in the full name,
    // if first char == lowercase , delete all the appearences of the SECOND letter in the username string;
    public String alterUsername(String username) {
        if (username == null) {
            return null;

        }
        if (username.equals("")) {
            return "";
        }

        if (Character.isUpperCase(username.charAt(0))) {
            return deleteAppearances(0, username.toLowerCase());
        } else {
            return deleteAppearances(1, username.toLowerCase());
        }
    }

    private String deleteAppearances(int i, String temp) {
        StringBuilder sb = new StringBuilder();
        char target = temp.charAt(i);
        for (char c : temp.toCharArray()) {
            if (c == target) {
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public void toUpperCase ( String s){
        s = s.toUpperCase();
    }


}
