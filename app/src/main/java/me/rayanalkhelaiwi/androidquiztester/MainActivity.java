package me.rayanalkhelaiwi.androidquiztester;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Global variables. The booleans are declared, for each question, to check if the questions are answered, also to prevent re-calculating the points.
     * The integer is declared to calculate the points for the player.
     */

    boolean isNotAnsweredQ1 = true;
    boolean isNotAnsweredQ2 = true;
    boolean isNotAnsweredQ3 = true;
    boolean isNotAnsweredQ4 = true;
    boolean isNotAnsweredQ5 = true;
    boolean isNotAnsweredQ6 = true;
    boolean isNotAnsweredQ7 = true;

    int pointCounter = 0;

    /**
     * The default onCreate method.
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * A method assigned to the first question to validate the answer and gives 2 points.
     *
     * @param view
     */
    public void q1Submit(View view) {

        EditText editText = (EditText) findViewById(R.id.q1enterEditText);
        String q1answer = editText.getText().toString().trim();

        //Nested if statements to check if the answer is correct or not, then to assign 2 points if it's correct.
        if ((q1answer.toLowerCase().equals(getString(R.string.q1AnswerCheck1))) || (q1answer.toLowerCase().equals(getString(R.string.q1AnswerCheck2)))) {
            if (isNotAnsweredQ1) {
                display(pointCounter += 2);
                Toast.makeText(this, getString(R.string.correct1), Toast.LENGTH_SHORT).show();
                isNotAnsweredQ1 = false;
            }
        } else {
            Toast.makeText(this, getString(R.string.thinkAgain), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * A method assigned to the second question to validate the answer and gives 2 points.
     *
     * @param view
     */
    public void q2Submit(View view) {

        RadioButton radioButton = (RadioButton) findViewById(R.id.q2option3);

        //Nested if statements to check if the answer is correct or not, then to assign 2 points if it's correct.
        if (radioButton.isChecked()) {
            if (isNotAnsweredQ2) {
                display(pointCounter += 2);
                Toast.makeText(this, getString(R.string.correct2), Toast.LENGTH_SHORT).show();
                isNotAnsweredQ2 = false;
            }
        } else {
            Toast.makeText(this, getString(R.string.thinkAgain), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * A method assigned to the third question to validate the answer and gives 2 points.
     *
     * @param view
     */
    public void q3Submit(View view) {

        RadioButton radioButton = (RadioButton) findViewById(R.id.q3option1);

        //Nested if statements to check if the answer is correct or not, then to assign 2 points if it's correct.
        if (radioButton.isChecked()) {
            if (isNotAnsweredQ3) {
                display(pointCounter += 2);
                Toast.makeText(this, getString(R.string.correct2), Toast.LENGTH_SHORT).show();
                isNotAnsweredQ3 = false;
            }
        } else {
            Toast.makeText(this, getString(R.string.thinkAgain), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * A method assigned to the fourth question to validate the answer and gives 2 points.
     *
     * @param view
     */
    public void q4Submit(View view) {

        CheckBox checkBox1 = (CheckBox) findViewById(R.id.q4option1cb);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.q4option2cb);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.q4option3cb);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.q4option4cb);

        //Nested if statements to check if the answer is correct or not, then to assign 2 points if it's correct.
        if (checkBox1.isChecked() && checkBox2.isChecked() && checkBox3.isChecked() && !checkBox4.isChecked()) {
            if (isNotAnsweredQ4) {
                display(pointCounter += 2);
                Toast.makeText(this, getString(R.string.correct1), Toast.LENGTH_SHORT).show();
                isNotAnsweredQ4 = false;
            }
        } else {
            Toast.makeText(this, getString(R.string.thinkAgain), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * A method assigned to the fifth question to validate the answer and gives 2 points.
     *
     * @param view
     */
    public void q5Submit(View view) {

        RadioButton radioButton = (RadioButton) findViewById(R.id.q5option3);

        //Nested if statements to check if the answer is correct or not, then to assign 2 points if it's correct.
        if (radioButton.isChecked()) {
            if (isNotAnsweredQ5) {
                display(pointCounter += 2);
                Toast.makeText(this, getString(R.string.correct2), Toast.LENGTH_SHORT).show();
                isNotAnsweredQ5 = false;
            }
        } else {
            Toast.makeText(this, getString(R.string.thinkAgain), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * A method assigned to the sixth question to validate the answer and gives 2 points.
     *
     * @param view
     */
    public void q6Submit(View view) {

        RadioButton radioButton = (RadioButton) findViewById(R.id.q6option1);

        //Nested if statements to check if the answer is correct or not, then to assign 2 points if it's correct.
        if (radioButton.isChecked()) {
            if (isNotAnsweredQ6) {
                display(pointCounter += 2);
                Toast.makeText(this, getString(R.string.correct2), Toast.LENGTH_SHORT).show();
                isNotAnsweredQ6 = false;
            }
        } else {
            Toast.makeText(this, getString(R.string.thinkAgain), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * A method assigned to the seventh question to validate the answer and gives 2 points.
     *
     * @param view
     */
    public void q7Submit(View view) {

        RadioButton radioButton = (RadioButton) findViewById(R.id.q7option4);

        //Nested if statements to check if the answer is correct or not, then to assign 2 points if it's correct.
        if (radioButton.isChecked()) {
            if (isNotAnsweredQ7) {
                display(pointCounter += 2);
                Toast.makeText(this, getString(R.string.correct1), Toast.LENGTH_SHORT).show();
                isNotAnsweredQ7 = false;
            }
        } else {
            Toast.makeText(this, getString(R.string.thinkAgain), Toast.LENGTH_SHORT).show();
        }
    }


    /**
     * A method to update and display the number of points earned.
     *
     * @param counterMessage
     */
    public void display(int counterMessage) {
        TextView textView = (TextView) findViewById(R.id.pointsValue);
        textView.setText("" + counterMessage);
    }
}
