package table.border.layout.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import table.border.layout.R;
import table.border.layout.adapter.MyAdapter;
import table.border.layout.view.TableBorderLayout;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    private List<Map<String, Object>> dataList;

    private TableBorderLayout layTable;

    private String[] datas = new String[] { "疯狂", "个性", "张扬", "抖擞", "加油", "奋斗",
	    "努力", "精神" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	initViews();
	loadDatas();
	refreshViews();
    }

    private void initViews() {
	layTable = (TableBorderLayout) findViewById(R.id.layTable);
    }

    private void loadDatas() {
	dataList = new ArrayList<Map<String, Object>>();
	Map<String, Object> item = null;
	for (int i = 0; i < datas.length; i++) {
	    item = new HashMap<String, Object>();
	    item.put("Title", datas[i]);
	    dataList.add(item);
	}
    }

    private void refreshViews() {
	layTable.setAdapter(new MyAdapter(this, dataList));
    }

}
