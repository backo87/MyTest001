package com.example.mytest001;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListViewAdapter extends BaseAdapter {
    private List<DataVo> list= new ArrayList<DataVo>() ;

    public ListViewAdapter() {

    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position ;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.items, parent, false);
        }
        TextView idx = (TextView) convertView.findViewById(R.id.text1) ;
        TextView name = (TextView) convertView.findViewById(R.id.text2) ;
        TextView content = (TextView) convertView.findViewById(R.id.text3) ;
        DataVo dataVo = list.get(position);

        idx.setText("idx:"+dataVo.getIdx());
        name.setText("name:"+dataVo.getName());
        content.setText("content:"+dataVo.getContent());
        return convertView;
    }
    public void addItem(int idx,int name, int content) {
        DataVo dv=new DataVo();

        dv.setIdx(idx);
        dv.setName(name);
        dv.setContent(content);

        list.add(dv);
    }
}
