package table.border.layout.adapter;

import java.util.List;
import java.util.Map;

import table.border.layout.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter{

    private List<Map<String, Object>> dataList;
    
    private LayoutInflater mInflater;
    
    public MyAdapter(Context context, List<Map<String, Object>> dataList){
	mInflater = LayoutInflater.from(context);
	this.dataList = dataList;
    }
    
    @Override
    public int getCount() {
	return dataList.size();
    }

    @Override
    public Object getItem(int position) {
	return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
	return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
	if(convertView == null){
	    convertView = mInflater.inflate(R.layout.item_main_list, null);
	}
	TextView tvTitle = (TextView)convertView.findViewById(R.id.tvTitle);
	Map<String, Object> item = dataList.get(position);
	tvTitle.setText((String)item.get("Title"));
	return convertView;
    }

}
