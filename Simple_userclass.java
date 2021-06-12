package com.example.jansanjivani;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class SimpleUserclass extends AppCompatActivity {


    private ListView listView ;
    private Button button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_userclass);

        listView = (ListView)findViewById(R.id.listview) ;
        button = (Button)findViewById(R.id.Button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ArrayList<String> list = new ArrayList<>();
                final ArrayList<String> ulist = new ArrayList<>();
                final ArrayAdapter adapter = new ArrayAdapter<String>(SimpleUserclass.this,R.layout.list_items,list);

                listView.setAdapter(adapter);
                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("users");
                reference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        list.clear();
                        ulist.clear();
                        for (DataSnapshot snapshot : dataSnapshot.getChildren()){
                            users info = snapshot.getValue(users.class);
                            String currentUser = info.getUser().toString();

                            String unam = info.getUser().toString();
                            ulist.add(unam);

                            String txt = info.getName() + "\n"+ "Ph: "+info.getPh()+ "\nAddress: "+ info.getAdd();
                            list.add(txt);
                        }
                        adapter.notifyDataSetChanged();
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                final ArrayList<Integer> clist = new ArrayList<>();
                for(int i=0;i<clist.size();i++){
                    clist.add(i);
                }
                
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                        Intent bloodintent = new Intent(SimpleUserclass.this,Bloods_display.class);
                        bloodintent.putExtra("Uname", ulist.get(i).toString());
                        startActivity(bloodintent);
                    }
                });
            }
        });
    }
}
