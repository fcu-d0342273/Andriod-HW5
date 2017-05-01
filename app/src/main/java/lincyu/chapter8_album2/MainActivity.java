package lincyu.chapter8_album2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity {

	ListView lv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ArrayList<AlbumItem> albumlist = new ArrayList<AlbumItem>();

		albumlist.add(new AlbumItem("巫師", R.drawable.sc001, "115", "賽爾提克", R.drawable.sc002, "99"));
		albumlist.add(new AlbumItem("爵士", R.drawable.sc003, "133", "快艇", R.drawable.sc004, "98"));


		AlbumArrayAdapter adapter =
				new AlbumArrayAdapter(this, albumlist);

		lv = (ListView) findViewById(R.id.lv);
		lv.setAdapter(adapter);
	}
}
