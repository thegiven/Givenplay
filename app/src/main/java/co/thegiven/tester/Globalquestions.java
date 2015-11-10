package co.thegiven.tester;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

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

        ArrayAdapter<Question> arrayAdapter = new ArrayAdapter<Question>(this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(arrayAdapter);

    }

}
