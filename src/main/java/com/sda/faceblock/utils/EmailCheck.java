package com.sda.faceblock.utils;

import com.sda.faceblock.models.Profile;

import java.util.List;

public class EmailCheck {

    public static boolean emailCheck(List<Profile> profileList, String email) {
        for(Profile p : profileList) {
            if( p.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
}
