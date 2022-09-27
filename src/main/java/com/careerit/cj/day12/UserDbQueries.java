package com.careerit.cj.day12;

public class UserDbQueries {
    public static final String ALL_USERS="select * from user where deleted=false";
    public static final String GET_USER_BY_STATUS="select * from users where status = ?";

}
