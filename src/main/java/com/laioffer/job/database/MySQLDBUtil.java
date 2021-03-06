package com.laioffer.job.database;

public class MySQLDBUtil {//产生url用的
    private static final String INSTANCE = "laiproject-instance.cwumjypicoe8.us-east-2.rds.amazonaws.com";
    private static final String PORT_NUM = "3306";
    public static final String DB_NAME = "laiproject2";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "yantingyin613";
    public static final String URL = "jdbc:mysql://"
            + INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
            + "?user=" + USERNAME + "&password=" + PASSWORD
            + "&autoReconnect=true&serverTimezone=UTC";

}
