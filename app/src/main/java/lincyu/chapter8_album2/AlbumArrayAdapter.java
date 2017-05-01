package lincyu.chapter8_album2;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumArrayAdapter extends ArrayAdapter<AlbumItem> {

	Context context;
	
	public AlbumArrayAdapter(Context context,
			ArrayList<AlbumItem> items) {
		super(context, 0, items);
		this.context = context;
	}

	@Override
	public View getView(int position, View convertView,
			ViewGroup parent) {

		LayoutInflater inflater = LayoutInflater.from(context);
		
		LinearLayout itemlayout = null;
		if(convertView == null) {
			itemlayout = (LinearLayout)inflater.inflate
					(R.layout.listitem, null);
		} else {
			itemlayout = (LinearLayout) convertView;
		}
		AlbumItem item = (AlbumItem)getItem(position);
		
		TextView tv_name1 = (TextView)itemlayout.
				findViewById(R.id.itemtv11);
		tv_name1.setText(item.name1);
		TextView tv_sorce1 = (TextView)itemlayout.
				findViewById(R.id.itemtv12);
		tv_sorce1.setText(item.sorce1);
		ImageView iv1 = (ImageView)itemlayout.
				findViewById(R.id.itemiv11);
		iv1.setImageResource(item.imgid1);

		TextView tv_name2 = (TextView)itemlayout.
				findViewById(R.id.itemtv21);
		tv_name2.setText(item.name2);
		TextView tv_sorce2 = (TextView)itemlayout.
				findViewById(R.id.itemtv22);
		tv_sorce2.setText(item.sorce2);
		ImageView iv2 = (ImageView)itemlayout.
				findViewById(R.id.itemiv21);
		iv2.setImageResource(item.imgid2);

		int s1= Integer.parseInt(item.sorce1);
		int s2= Integer.parseInt(item.sorce2);
		if(s1 > s2){
			tv_sorce1.setTextColor(Color.RED);
		}
		else if(s2>s1){
			tv_sorce2.setTextColor(Color.RED);
		}
		return itemlayout;
	}
}
