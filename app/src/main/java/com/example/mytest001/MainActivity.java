package com.example.mytest001;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private Button btn1,btn2;
    private List<DataVo> list1,list2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        listView = findViewById(R.id.list);
        list1 = new ArrayList<>();
    }

    public void btnclicked(View view) {
        switch (view.getId()){
            case R.id.btn1:
                ListViewAdapter adapter1 = new ListViewAdapter() ;
                //adapter1.insertList(list1);
                listView.setAdapter(adapter1);
                for(int i=1;i<10;i++){
                    adapter1.addItem(i,i+1,i+2);
                }
                break;
            case R.id.btn2:
                ListViewAdapter adapter2 = new ListViewAdapter();
                //adapter2.insertList(list2);
                listView.setAdapter(adapter2);
                for(int j=10;j<20;j++){
                    adapter2.addItem(j,j+1,j+1);
                }
                break;
        }
    }
}
