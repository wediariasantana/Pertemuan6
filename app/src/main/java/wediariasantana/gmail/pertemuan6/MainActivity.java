package wediariasantana.gmail.pertemuan6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    TextView textView;
    String[] listItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO  1 : mengaitkan program aktiviti dengan komponen pada view
        listView=(ListView)findViewById(R.id.listView);
        textView=(TextView)findViewById(R.id.textView);

        //TODO 2 : mengambil string array dari sumber daya string.xml
        listItem = getResources().getStringArray(R.array.data);

        //TODO 3 : membuat adapter dimana data yang diperolah berasal dari ListItem
        final ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, listItem);

        //TODO 4 : memasangkan adapter ke listView dari layout
        listView.setAdapter(adapter);

        //TODO 5 : membuat  Item Click Listener agar list dapat di klik dan memberikan nilai
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //TODO 6 : mengambil nilai dari item yang dipilih sebagai string
                String value=adapter.getItem(position);

                //TODO 7 : menampilkan Toast dengan isi string dari item yang dipilih  LENGTH_SHORT berarti munculnya sebentar
                Toast.makeText(getApplicationContext(),value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
