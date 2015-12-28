package co.thegiven.tester.Activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import java.util.ArrayList;

import co.thegiven.tester.Adapters.PlayRoomAdapter;
import co.thegiven.tester.R;
import co.thegiven.tester.Objects.Rooms;

public class Playrooms extends ActionBarActivity {

    private double radius = 5.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playrooms);
        ListView lv = (ListView) findViewById(R.id.playrooms);
        ArrayList<Rooms> list = new ArrayList<Rooms>();
        for (int i=0;i<10;i++) {
            Rooms r = new Rooms("Daniel", "" + i, "this is a test", 1, i, 0, 0);
            list.add(r);
        }

        PlayRoomAdapter arrayAdapter = new PlayRoomAdapter(this, R.layout.playroomlistitems, list);
        lv.setAdapter(arrayAdapter);
    }

    public Rooms createRoom(String username, String title, String description) {

        return null;
    }

}
