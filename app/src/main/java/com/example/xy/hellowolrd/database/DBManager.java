//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.xy.hellowolrd.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.xy.hellowolrd.bean.ErrorQuestionInfo;

public class DBManager {
	private Context context;
	private SQLiteDatabase database;

	public DBManager(Context context) {
		this.context = context;
	}

	public void openDB() {
		DBHelper dbHelper = new DBHelper(this.context);
		if(this.database == null || !this.database.isOpen()) {
			this.database = dbHelper.getWritableDatabase();
		}

	}

	public void closeDB() {
		if(this.database != null && this.database.isOpen()) {
			this.database.close();
		}

	}

	public long deleteLibraryAllData() {
		return (long)this.database.delete("table_test_library", (String)null, (String[])null);
	}

	public long insertErrorQuestion(ErrorQuestionInfo info) {
		ContentValues newValues = new ContentValues();
		newValues.put("_question_name", info.getQuestionName());
		newValues.put("_question_type", info.getQuestionType());
		newValues.put("_question_answer", info.getQuestionAnswer());
		newValues.put("_question_selected", info.getQuestionSelect());
		newValues.put("_question_isright", info.getIsRight());
		newValues.put("_question_analysis", info.getAnalysis());
		newValues.put("_question_option_a", info.getOptionA());
		newValues.put("_question_option_b", info.getOptionB());
		newValues.put("_question_option_c", info.getOptionC());
		newValues.put("_question_option_d", info.getOptionD());
		newValues.put("_question_option_e", info.getOptionE());
		newValues.put("_question_option_type", info.getOptionType());
		return this.database.insert("table_my_error_question", (String)null, newValues);
	}

	public long deleteAllData() {
		return (long)this.database.delete("table_my_error_question", (String)null, (String[])null);
	}

	public ErrorQuestionInfo[] queryAllData() {
		Cursor result = this.database.query("table_my_error_question", (String[])null, (String)null, (String[])null, (String)null, (String)null, (String)null);
		return this.ConvertToQuestion(result);
	}

	private ErrorQuestionInfo[] ConvertToQuestion(Cursor cursor) {
		int resultCounts = cursor.getCount();
		if(resultCounts != 0 && cursor.moveToFirst()) {
			ErrorQuestionInfo[] peoples = new ErrorQuestionInfo[resultCounts];

			for(int i = 0; i < resultCounts; ++i) {
				peoples[i] = new ErrorQuestionInfo();
				peoples[i].questionId = cursor.getInt(0);
				peoples[i].questionName = cursor.getString(cursor.getColumnIndex("_question_name"));
				peoples[i].questionType = cursor.getString(cursor.getColumnIndex("_question_type"));
				peoples[i].questionAnswer = cursor.getString(cursor.getColumnIndex("_question_answer"));
				peoples[i].questionSelect = cursor.getString(cursor.getColumnIndex("_question_selected"));
				peoples[i].isRight = cursor.getString(cursor.getColumnIndex("_question_isright"));
				peoples[i].Analysis = cursor.getString(cursor.getColumnIndex("_question_analysis"));
				peoples[i].optionA = cursor.getString(cursor.getColumnIndex("_question_option_a"));
				peoples[i].optionB = cursor.getString(cursor.getColumnIndex("_question_option_b"));
				peoples[i].optionC = cursor.getString(cursor.getColumnIndex("_question_option_c"));
				peoples[i].optionD = cursor.getString(cursor.getColumnIndex("_question_option_d"));
				peoples[i].optionE = cursor.getString(cursor.getColumnIndex("_question_option_e"));
				peoples[i].optionType = cursor.getString(cursor.getColumnIndex("_question_option_type"));
				cursor.moveToNext();
			}

			return peoples;
		} else {
			return null;
		}
	}
}
