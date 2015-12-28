package co.thegiven.tester.Activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import java.util.ArrayList;

import co.thegiven.tester.Objects.Question;
import co.thegiven.tester.Adapters.QuestionAdapter;
import co.thegiven.tester.R;

public class Globalquestions extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_globalquestions);

        ListView lv = (ListView) findViewById(R.id.globallist);
        ArrayList<Question> list = new ArrayList<Question>();
        for (int i=0;i<10;i++) {
            Question q = new Question("Question: " + i, "This is a test question", "Dan");
            list.add(q);
        }

        QuestionAdapter arrayAdapter = new QuestionAdapter(this, R.layout.globalquestionlistitems, list);
        lv.setAdapter(arrayAdapter);

    }

}
