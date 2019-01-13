package com.example.abhinav.projectquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question extends AppCompatActivity {
    RadioButton question1_choice3;
    RadioButton question2_choice1;
    CheckBox question3_choice1;
    CheckBox question3_choice2;
    CheckBox question3_choice3;
    CheckBox question3_choice4;
    CheckBox question4_choice1;
    CheckBox question4_choice2;
    CheckBox question4_choice3;
    CheckBox question4_choice4;
    RadioButton question5_choice2;
    RadioButton question6_choice2;
    CheckBox question7_choice1;
    CheckBox question7_choice2;
    CheckBox question7_choice3;
    CheckBox question7_choice4;
    CheckBox question8_choice1;
    CheckBox question8_choice2;
    CheckBox question8_choice3;
    CheckBox question8_choice4;
    RadioButton question9_choice3;
    RadioButton question10_choice1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
    }
    public void Submit(View view) {

        int answer1_marks;
        int answer2_marks;
        int answer3_marks;
        int answer4_marks;
        int answer5_marks;
        int answer6_marks;
        int answer7_marks;
        int answer8_marks;
        int answer9_marks;
        int answer10_marks;

        Boolean answer1;

        question1_choice3 = (RadioButton) this.findViewById(R.id.question1_choice3);
        answer1 = question1_choice3.isChecked();
        if (answer1) {
            answer1_marks = 1;
        } else {
            answer1_marks = 0;
        }
        Boolean answer2;
        question2_choice1 = (RadioButton) this.findViewById(R.id.question2_choice1);
        answer2 = question2_choice1.isChecked();
        if (answer2) {
            answer2_marks = 1;
        } else {
            answer2_marks = 0;
        }
        Boolean answer3_choice1;
        Boolean answer3_choice2;
        Boolean answer3_choice3;
        Boolean answer3_choice4;
        question3_choice1 = (CheckBox) this.findViewById(R.id.question3_choice1);
        question3_choice2 = (CheckBox) this.findViewById(R.id.question3_choice2);
        question3_choice3 = (CheckBox) this.findViewById(R.id.question3_choice3);
        question3_choice4 = (CheckBox) this.findViewById(R.id.question3_choice4);
        answer3_choice1 = question3_choice1.isChecked();
        answer3_choice2 = question3_choice2.isChecked();
        answer3_choice3 = question3_choice3.isChecked();
        answer3_choice4 = question3_choice4.isChecked();
        if (answer3_choice1 && !answer3_choice2 && answer3_choice3 && !answer3_choice4) {
            answer3_marks = 2;
        } else {
            answer3_marks = 0;
        }
        Boolean answer4_choice1;
        Boolean answer4_choice2;
        Boolean answer4_choice3;
        Boolean answer4_choice4;
        question4_choice1 = (CheckBox) this.findViewById(R.id.question4_choice1);
        question4_choice2 = (CheckBox) this.findViewById(R.id.question4_choice2);
        question4_choice3 = (CheckBox) this.findViewById(R.id.question4_choice3);
        question4_choice4 = (CheckBox) this.findViewById(R.id.question4_choice4);
        answer4_choice1 = question4_choice1.isChecked();
        answer4_choice2 = question4_choice2.isChecked();
        answer4_choice3 = question4_choice3.isChecked();
        answer4_choice4 = question4_choice4.isChecked();
        if (answer4_choice1 && !answer4_choice2 && answer4_choice3 && !answer4_choice4) {
            answer4_marks = 2;
        } else {
            answer4_marks = 0;
        }
        Boolean answer5;
        question5_choice2 = (RadioButton) this.findViewById(R.id.question5_choice2);
        answer5 = question5_choice2.isChecked();
        if (answer5) {
            answer5_marks = 1;
        } else {
            answer5_marks = 0;
        }
        Boolean answer6;
        question6_choice2 = (RadioButton) this.findViewById(R.id.question6_choice2);
        answer6 = question6_choice2.isChecked();
        if (answer6) {
            answer6_marks = 1;
        } else {
            answer6_marks =0;
        }
        Boolean answer7_choice1;
        Boolean answer7_choice2;
        Boolean answer7_choice3;
        Boolean answer7_choice4;
        question7_choice1 = (CheckBox) this.findViewById(R.id.question7_choice1);
        question7_choice2 = (CheckBox) this.findViewById(R.id.question7_choice2);
        question7_choice3 = (CheckBox) this.findViewById(R.id.question7_choice3);
        question7_choice4 = (CheckBox) this.findViewById(R.id.question7_choice4);
        answer7_choice1 = question7_choice1.isChecked();
        answer7_choice2 = question7_choice2.isChecked();
        answer7_choice3 = question7_choice3.isChecked();
        answer7_choice4 = question7_choice4.isChecked();
        if (!answer7_choice1 && !answer7_choice2 && !answer7_choice3 && answer7_choice4) {
            answer7_marks = 2;
        } else {
            answer7_marks = 0;
        }
        Boolean answer8_choice1;
        Boolean answer8_choice2;
        Boolean answer8_choice3;
        Boolean answer8_choice4;
        question8_choice1 = (CheckBox) this.findViewById(R.id.question8_choice1);
        question8_choice2 = (CheckBox) this.findViewById(R.id.question8_choice2);
        question8_choice3 = (CheckBox) this.findViewById(R.id.question8_choice3);
        question8_choice4 = (CheckBox) this.findViewById(R.id.question8_choice4);
        answer8_choice1 = question8_choice1.isChecked();
        answer8_choice2 = question8_choice2.isChecked();
        answer8_choice3 = question8_choice3.isChecked();
        answer8_choice4 = question8_choice4.isChecked();
        if (answer8_choice1 && answer8_choice2 && !answer8_choice3 && !answer8_choice4) {
            answer8_marks = 2;
        } else {
            answer8_marks = 0;
        }
        Boolean answer9;
        question9_choice3 = (RadioButton) this.findViewById(R.id.question9_choice3);
        answer9 = question9_choice3.isChecked();
        if (answer9) {
            answer9_marks = 1;
        } else {
            answer9_marks = 0;
        }

        Boolean answer10;
        question10_choice1 = (RadioButton) this.findViewById(R.id.question10_choice1);
        answer10 = question10_choice1.isChecked();
        if (answer10) {
            answer10_marks = 1;
        } else {
            answer10_marks = 0;
        }

        int   final_marks =  answer1_marks + answer2_marks + answer3_marks + answer4_marks + answer5_marks +
                answer6_marks + answer7_marks + answer8_marks + answer9_marks + answer10_marks;

        if (final_marks == 14) {
            Toast.makeText(Question.this,"You scored Full Marks Well Done!!!!",Toast.LENGTH_SHORT).show();

        } else if (final_marks<4){
            Toast.makeText(Question.this,"You scored :"+final_marks+" Marks Out Of 14 Improve Yourself",Toast.LENGTH_SHORT).show();

        }
    else if (final_marks>=4||final_marks<=8){
        Toast.makeText(Question.this,"You Scored :"+final_marks+" Marks Out Of 14 You can do better ",Toast.LENGTH_SHORT).show();

    }

        else {

            Toast.makeText(Question.this,"You Scored :"+final_marks+" Marks Out Of 14 Good",Toast.LENGTH_SHORT).show();
        }
        Button exit;
        exit=(Button)findViewById(R.id.exit);
      exit.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              finish();

          }
      });


    }
}
