//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.xy.hellowolrd.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.xy.hellowolrd.MyErrorQuestionActivity;
import com.example.xy.hellowolrd.adapter.MyErrorQuestionListAdapter.ViewHolder;
import java.util.List;
import java.util.Map;

public class MyErrorQuestionListAdapter extends BaseAdapter {
    private ListView listView;
    private List<Map<String, Object>> list;
    private LayoutInflater mInflater;
    private Context context;

    public MyErrorQuestionListAdapter(Context context, List<Map<String, Object>> list, ListView listView) {
        this.listView = listView;
        this.context = context;
        this.list = list;
        this.mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        Map map = (Map)this.list.get(position);
        if(convertView != null) {
            viewHolder = (ViewHolder)convertView.getTag();
        } else {
            viewHolder = new ViewHolder(this);
            convertView = this.mInflater.inflate(2130903046, (ViewGroup)null);
            viewHolder.title = (TextView)convertView.findViewById(2131296298);
        }

        if(map != null && map.size() > 0) {
            viewHolder.title.setText(position + 1 + "." + map.get("title").toString());
        }

        convertView.setTag(viewHolder);
        return convertView;
    }

    public List<Map<String, Object>> GetData() {
        return this.list;
    }

    public int getCount() {
        return this.list.size();
    }

    public Object getItem(int position) {
        return this.list.get(position);
    }

    public long getItemId(int position) {
        return (long)position;
    }

    public class ViewHolder {
        TextView title;

        public ViewHolder(MyErrorQuestionListAdapter var1) {
            this.title = var1.con;
        }
    }
}
