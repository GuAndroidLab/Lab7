package me.ankitarpit.labassignment7.data;

import android.provider.BaseColumns;

public final class Registeration {
    public static abstract class register implements BaseColumns{
        public static final String TABLE_NAME = "user";
        public static final String COLUMN_NAME = "user";
        public static final String COLUMN_ENROLLMENT = "enrollment";
        public static final String COLUMN_COURSE = "cource";
        public static final String COLUMN_COLLEGE = "college";
        public static final String COLUMN_EMAIL = "email";


    }
}
