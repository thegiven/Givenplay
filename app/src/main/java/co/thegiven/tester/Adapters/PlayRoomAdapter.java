package co.thegiven.tester.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import co.thegiven.tester.R;
import co.thegiven.tester.Objects.Rooms;

/**
 * Created by danielkim on 11/25/15.
 */
public class PlayRoomAdapter extends ArrayAdapter<Rooms> {

    private ArrayList<Rooms> rooms;
    private Context c;

    public PlayRoomAdapter(Context context, int textViewResourceId, ArrayList<Rooms> rooms) {
        super(context, textViewResourceId, rooms);
        this.rooms = rooms;
        c = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.playroomlistitems, null);
        }

        Rooms room = rooms.get(position);
        if (room != null) {
            TextView title = (TextView) v.findViewById(R.id.roomtitle);
            TextView description = (TextView) v.findViewById(R.id.roomdescription);
            if (title != null) {
                title.setText(room.getTitle());
            }

            if(description != null) {
                description.setText("Description: " + room.getDescription());
            }
        }
        return v;
    }

}
