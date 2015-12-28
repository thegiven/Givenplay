package co.thegiven.tester.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import co.thegiven.tester.Objects.Question;
import co.thegiven.tester.R;

/**
 * Created by danielkim on 12/1/15.
 */
public class QuestionAdapter extends ArrayAdapter<Question> {
    private ArrayList<Question> questions;
    private Context c;

    public QuestionAdapter(Context context, int textViewResourceId, ArrayList<Question> questions) {
        super(context, textViewResourceId, questions);
        this.questions = questions;
        c = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.globalquestionlistitems, null);
        }

        Question q = questions.get(position);
        if (q != null) {
            TextView title = (TextView) v.findViewById(R.id.questiontitle);
            TextView description = (TextView) v.findViewById(R.id.questiondescription);
            if (title != null) {
                title.setText(q.getTitle());
            }

            if(description != null) {
                description.setText("Description: " + q.getDescription());
            }
        }
        return v;
    }

}
