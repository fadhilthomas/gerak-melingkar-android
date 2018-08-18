package com.wibudev.gerakmelingkar.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.uncopt.android.widget.text.justify.JustifiedTextView;
import com.wibudev.gerakmelingkar.R;
import com.wibudev.gerakmelingkar.adapter.DbHelper;
import com.wibudev.gerakmelingkar.model.Question;

import java.util.Collections;
import java.util.List;

public class EvaluasiActivity extends AppCompatActivity {

    private List<Question> questionList;
    private int score = 0;
    private int quid = 0;
    private Question currentQuestion;
    private JustifiedTextView tvQuestion;
    private TextView tvEvaluasiMenu;
    private TextView tvEvaluasiNext;
    private RadioButton rda;
    private RadioButton rdb;
    private RadioButton rdc;
    private RadioButton rdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluasi);
        DbHelper dbHelper = new DbHelper(this);
        questionList = dbHelper.getAllQuestions();
        Collections.shuffle(questionList);
        currentQuestion = questionList.get(quid);
        tvQuestion = findViewById(R.id.question);
        tvEvaluasiMenu = findViewById(R.id.tvEvaluasiMenu);
        tvEvaluasiNext = findViewById(R.id.tvEvaluasiNext);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/font.ttf");

        tvQuestion.setTypeface(custom_font);
        tvEvaluasiNext.setTypeface(custom_font);
        tvEvaluasiMenu.setTypeface(custom_font);

        rda = findViewById(R.id.radio0);
        rda.setTypeface(custom_font);
        rdb = findViewById(R.id.radio1);
        rdb.setTypeface(custom_font);
        rdc = findViewById(R.id.radio2);
        rdc.setTypeface(custom_font);
        rdd = findViewById(R.id.radio3);
        rdd.setTypeface(custom_font);
        setQuestionView();

    }

    private void setQuestionView(){
        tvQuestion.setText(String.valueOf(quid+1)+ ". " + currentQuestion.getQuestion());
        rda.setText("A. "+ currentQuestion.getOptA());
        rdb.setText("B. "+ currentQuestion.getOptB());
        rdc.setText("C. "+ currentQuestion.getOptC());
        rdd.setText("D. "+ currentQuestion.getOptD());
        quid++;
    }

    public void evaluasiNext(View view){
        RadioGroup grp = findViewById(R.id.radioGroup1);
        RadioButton answer = findViewById(grp.getCheckedRadioButtonId());
        String answerStr = answer.getText().toString().substring(3,answer.getText().length());
        if(currentQuestion.getAnswer().equals(answerStr)){
            score++;
        }

        if(quid < 10){
            currentQuestion = questionList.get(quid);
            setQuestionView();
        }else{
            Intent intent = new Intent(EvaluasiActivity.this, HasilActivity.class);
            Bundle b = new Bundle();
            b.putInt("score", score);
            intent.putExtras(b);
            startActivity(intent);
            finish();
        }
    }

    public void evaluasiMenu(View view) {
        startActivity(new Intent(this, MenuActivity.class));
    }
}