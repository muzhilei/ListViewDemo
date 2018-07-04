package com.example.a28062.listviewexam;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;



import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<myBean> myBeanList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listview);
        init();
        myAdapter adapter = new myAdapter(MainActivity.this,R.layout.myitem,myBeanList);

        listView.setAdapter(adapter);
    }
    private void init(){
        myBean bean1 = new myBean("aa",R.mipmap.ic_launcher);
        myBeanList.add(bean1);

        myBean bean2 = new myBean("ss",R.mipmap.ic_launcher);
        myBeanList.add(bean2);

        myBean bean3 = new myBean("jj",R.mipmap.ic_launcher);
        myBeanList.add(bean3);

        myBean bean4 = new myBean("hh",R.mipmap.ic_launcher);
        myBeanList.add(bean4);

        myBean bean5 = new myBean("dd",R.mipmap.ic_launcher);
        myBeanList.add(bean5);

        myBean bean6 = new myBean("cc",R.mipmap.ic_launcher);
        myBeanList.add(bean6);

        myBean bean7 = new myBean("bb",R.mipmap.ic_launcher);
        myBeanList.add(bean7);
        myBean bean8 = new myBean("jj",R.mipmap.ic_launcher);
        myBeanList.add(bean8);
        myBean bean9 = new myBean("kk",R.mipmap.ic_launcher);
        myBeanList.add(bean9);
    }
}
