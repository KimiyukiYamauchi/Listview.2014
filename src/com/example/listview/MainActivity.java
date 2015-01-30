package com.example.listview;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity 
	implements ListView.OnItemClickListener
{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// アイテムの準備
		int sli = android.R.layout.simple_list_item_1;
		ArrayAdapter<String> ad = new ArrayAdapter<String>(this, sli);
		ad.add("Add");
		ad.add("Delete");
		ad.add("Call");
		ad.add("Camera");
		ad.add("Day");
		ad.add("Directions");
		ad.add("Edit");
		ad.add("Help");
		ad.add("InfoDetails");
		ad.add("Preference");
		ad.add("Search");
		
		// リストビューの生成
		ListView lv = new ListView(this);
		lv.setBackgroundColor(Color.WHITE);
		lv.setAdapter(ad);
		lv.setOnItemClickListener(this);
		setContentView(lv);
		
//		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int pos,
			long id) {
		
		
		AlertDialog.Builder ad = new AlertDialog.Builder(this);
		ad.setMessage(((TextView)view).getText());
		
		ad.setPositiveButton("OK", null);
		ad.show();
		
	}
}
