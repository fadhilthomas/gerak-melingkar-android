package com.wibudev.gerakmelingkar.adapter;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.wibudev.gerakmelingkar.model.Question;

import java.util.ArrayList;
import java.util.List;

public class DbHelper extends SQLiteOpenHelper {

    //DB version, table and database name
    private static final int DB_VERSION = 2;
    private static final String DB_NAME = "quizdb";
    private static final String DB_TABLE = "quiztable";

    //table column names
    private static final String KEY_ID = "id";
    private static final String KEY_QUES = "question";
    private static final String KEY_ANSWER = "answer";
    private static final String KEY_OPTA = "optA";
    private static final String KEY_OPTB = "optB";
    private static final String KEY_OPTC = "optC";
    private static final String KEY_OPTD = "optD";

    private SQLiteDatabase dbase;
    private int rowCount = 0;

    public DbHelper(Context context){
        super(context,DB_NAME,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase = db;
        String sqlQuery = String.format("CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT )", DB_TABLE, KEY_ID, KEY_QUES, KEY_ANSWER, KEY_OPTA, KEY_OPTB, KEY_OPTC, KEY_OPTD);
        Log.d("TaskDBHelper", "Query to form table" + sqlQuery);
        db.execSQL(sqlQuery);
        addQuestions();
    }

    private void addQuestions() {
        Question q1 = new Question("Waktu yang diperlukan untuk menempuh satu putaran disebut ...", "Periode", "Frekuensi", "Kecepatan", "Kelajuan anguler", "Periode");
        this.addQuestionToDB(q1);
        Question q2 = new Question("Sebuah benda yang melakukan gerak melingkar beraturan memiliki ...", "Kecepatan tetap", "Kelajuan tetap", "Percepatan tetap", "Kecepatan yang arahnya menjauhi pusat lingkaran", "Kelajuan tetap");
        this.addQuestionToDB(q2);
        Question q3 = new Question("Sebuah benda yang mengalami gerak melingkar beraturan, kecepatannya tergantung pada ...", "Massa dan periode", "Massa dan frekuensi", "Massa dan jari-jari lintasan", "Periode dan jari-jari lintasan", "Periode dan jari-jari lintasan");
        this.addQuestionToDB(q3);
        Question q4 = new Question("Jika sebuah roda katrol berputar 60 putaran tiap dua menit, maka frekuensi dan kecepatan sudut roda adalah ...", "0,5 Hz dan 6,28 rad/s", "0,5 Hz dan 3,14 rad/s", "0,8 Hz dan 6,28 rad/s", "0,8 Hz dan 3,14 rad/s", "0,5 Hz dan 3,14 rad/s");
        this.addQuestionToDB(q4);
        Question q5 = new Question("Sebuah kipas angin berputar sebanyak 1.200 tiap 30 sekon. Periode dan frekuensi putaran kipas angin tersebut adalah ...", "40 s dan 0,25 Hz", "40 s dan 0,025 Hz", "40 s dan 0,0025 Hz", "0,025 s dan 40 Hz", "0,025 s dan 40 Hz");
        this.addQuestionToDB(q5);
        Question q6 = new Question("Dalam waktu 0,5 sekon, sebuah benda menempuh sudut ½ π. Kecepatan sudut benda tersebut adalah ... rad/s", "2π", "π", "¾π", "½π", "π");
        this.addQuestionToDB(q6);
        Question q7 = new Question("Sebuah roda berputar dengan kelajuan linear 1,4 m/s. Jari-jari roda tersebut 7 cm. Waktu yang dibutuhkan untuk menempuh satu putaran penuh yaitu...", "3,14 s", "1 s", "1/3,14 s", "0,1 s", "1/3,14 s");
        this.addQuestionToDB(q7);
        Question q8 = new Question("Seseorang memutar sebuah benda dengan kecepatan awal 4 rad/s. Benda tersebut diputar dengan percepatan sudut 0,5 rad/s² Kecepatan benda pada sekon ke-empat adalah ... rad/s.", "4,0", "4,5", "5,0", "6,0", "6,0");
        this.addQuestionToDB(q8);
        Question q9 = new Question("Arus sungai dengan kelajuan 18,94 m/s digunakan untuk memutar kincir air. Diameter kincir air tersebut adalah 120 cm. Dalam 1 menit, kincir air akan berputar sebanyak ... kali.", "108,1", "201,8", "301,6", "310,6", "301,6");
        this.addQuestionToDB(q9);
        Question q10 = new Question("Sebuah benda mengalami gerak melingkar beraturan dengan jari-jari lintasan 1 m. Jika dalam waktu 10 s mengalami perpindahan sudut sebesar 20 putaran, maka periode gerak benda itu adalah ...", "0,2 s", "0,5 s", "2,0 s", "5,0 s", "0,5 s");
        this.addQuestionToDB(q10);
    }

    private void addQuestionToDB(Question q){
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, q.getQuestion());
        values.put(KEY_ANSWER,q.getAnswer());
        values.put(KEY_OPTA, q.getOptA());
        values.put(KEY_OPTB, q.getOptB());
        values.put(KEY_OPTC, q.getOptC());
        values.put(KEY_OPTD, q.getOptD());
        dbase.insert(DB_TABLE, null, values);
    }

    public List<Question> getAllQuestions(){
        List <Question> questionList = new ArrayList<Question>();

        dbase = this.getReadableDatabase();
        String selectQuery = "SELECT * FROM " + DB_TABLE;
        Cursor cursor = dbase.rawQuery(selectQuery,null);
        rowCount = cursor.getCount();

        if(cursor.moveToFirst()){
            do{
                Question q = new Question();
                q.setId(cursor.getInt(0));
                q.setQuestion(cursor.getString(1));
                q.setAnswer(cursor.getString(2));
                q.setOptA(cursor.getString(3));
                q.setOptB(cursor.getString(4));
                q.setOptC(cursor.getString(5));
                q.setOptD(cursor.getString(6));
                questionList.add(q);

            }while (cursor.moveToNext());
        }
        return questionList;
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ DB_TABLE);
        onCreate(db);
    }

    public int getRowCount(){
        return rowCount;
    }

}