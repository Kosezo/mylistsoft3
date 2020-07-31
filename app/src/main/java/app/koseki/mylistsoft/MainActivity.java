package app.koseki.mylistsoft;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ListView listView2;
    EditText editText;
    EditText editText2;
    ArrayAdapter adapter;
    ArrayAdapter adapter2;
    ImageView ImageView1;
    ImageView ImageView2;
    Button Button1;
    Button Button2;


    public void add1 (View v){
        String text;
        text = editText.getText().toString();

        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();

        adapter.add(text);


    }
    public void add2 (View v){
        String text;
        text = editText2.getText().toString();

        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();

        adapter2.add(text);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView1);
        editText = (EditText) findViewById(R.id.editText1);
        listView2 = (ListView) findViewById(R.id.listView2);
        editText2 = (EditText) findViewById(R.id.editText2);
        adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1);
        adapter2= new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1);

        listView.setAdapter(adapter);
        listView2.setAdapter(adapter2);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ArrayAdapter adapter = (ArrayAdapter) listView.getAdapter();

                String item = (String) adapter.getItem(position);
                adapter.remove(item);
                adapter.add(item);
            }
        });
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ArrayAdapter adapter = (ArrayAdapter) listView2.getAdapter();

                String item = (String) adapter.getItem(position);
                adapter.remove(item);
                adapter.add(item);
            }
        });


        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                ArrayAdapter adapter = (ArrayAdapter) listView.getAdapter();
                String item = (String) adapter.getItem(position);
                adapter.remove(item);

                return false;

            }
        });

        listView2.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                ArrayAdapter adapter = (ArrayAdapter) listView2.getAdapter();
                String item = (String) adapter.getItem(position);
                adapter.remove(item);

                return false;


            }
        });

        Button btn1 = (Button) this.findViewById(R.id.Button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ImageView img1 = (ImageView) MainActivity.this.findViewById(R.id.ImageView1);
                if (img1.getVisibility() != View.VISIBLE) {
                    img1.setVisibility(View.VISIBLE);
                } else {
                    img1.setVisibility(View.INVISIBLE);
                }

            }});

        Button btn2 = (Button) this.findViewById(R.id.Button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ImageView img2 = (ImageView) MainActivity.this.findViewById(R.id.ImageView2);
                if (img2.getVisibility() != View.VISIBLE) {
                    img2.setVisibility(View.VISIBLE);
                } else {
                    img2.setVisibility(View.INVISIBLE);
                }
            }});




    }



}


