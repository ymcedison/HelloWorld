//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.xy.hellowolrd.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class DBHelper extends SQLiteOpenHelper {
    static final String DB_NAME = "DB";
    static final int VERSION = 2;
    static final String TABLE_NAME_TEST_LIBRARY = "table_test_library";
    static final String TEST_LIBRARY_COL_ID = "test_id";
    static final String TEST_LIBRARY_QUESTION_ID = "test_question_id";
    static final String TEST_LIBRARY_QUESTION_NAME = "test_question_name";
    static final String TEST_LIBRARY_QUESTION_TYPE = "test_question_type";
    static final String TEST_LIBRARY_QUESTION_ANSWER = "test_question_answer";
    static final String TEST_LIBRARY_QUESTION_ANALYSIS = "test_question_analysis";
    static final String TEST_LIBRARY_QUESTION_FOR = "test_question_for";
    static final String TEST_LIBRARY_QUESTION_SCORE = "test_question_score";
    static final String TEST_LIBRARY_QUESTION_OPTION_A = "test_question_option_a";
    static final String TEST_LIBRARY_QUESTION_OPTION_B = "test_question_option_b";
    static final String TEST_LIBRARY_QUESTION_OPTION_C = "test_question_option_c";
    static final String TEST_LIBRARY_QUESTION_OPTION_D = "test_question_option_d";
    static final String TABLE_NAME_MY_ERROR_QUESTION = "table_my_error_question";
    static final String MY_ERROR_QUESTION_ID = "_question_id";
    static final String MY_ERROR_QUESTION_NAME = "_question_name";
    static final String MY_ERROR_QUESTION_TYPE = "_question_type";
    static final String MY_ERROR_QUESTION_ANSWER = "_question_answer";
    static final String MY_ERROR_QUESTION_SELECTED = "_question_selected";
    static final String MY_ERROR_QUESTION_ISRIGHT = "_question_isright";
    static final String MY_ERROR_QUESTION_ANALYSIS = "_question_analysis";
    static final String MY_ERROR_QUESTION_OPTION_A = "_question_option_a";
    static final String MY_ERROR_QUESTION_OPTION_B = "_question_option_b";
    static final String MY_ERROR_QUESTION_OPTION_C = "_question_option_c";
    static final String MY_ERROR_QUESTION_OPTION_D = "_question_option_d";
    static final String MY_ERROR_QUESTION_OPTION_E = "_question_option_e";
    static final String MY_ERROR_QUESTION_OPTION_TYPE = "_question_option_type";

    public DBHelper(Context context) {
        super(context, "DB", (CursorFactory)null, 2);
    }

    public void onCreate(SQLiteDatabase db) {
        String cerateTable_testLibrary = "CREATE TABLE table_test_library (test_id INTEGER PRIMARY KEY AUTOINCREMENT,test_question_id TEXT,test_question_name TEXT,test_question_type TEXT,test_question_answer TEXT,test_question_for TEXT,test_question_score TEXT,test_question_analysis TEXT,test_question_option_a TEXT,test_question_option_b TEXT,test_question_option_c TEXT,test_question_option_d TEXT)";
        String cerateTable_myErrorQuestion = "CREATE TABLE table_my_error_question (_question_id INTEGER PRIMARY KEY AUTOINCREMENT,_question_name TEXT,_question_type TEXT,_question_answer TEXT,_question_selected TEXT,_question_isright TEXT,_question_analysis TEXT,_question_option_a TEXT,_question_option_b TEXT,_question_option_c TEXT,_question_option_d TEXT,_question_option_e TEXT,_question_option_type TEXT)";
        db.execSQL(cerateTable_testLibrary);
        db.execSQL(cerateTable_myErrorQuestion);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
