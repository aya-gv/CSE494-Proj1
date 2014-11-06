package edu.asu.dota2guide;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.view.LayoutInflater;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;

public class GalleryAdapter extends BaseAdapter{
	
	private Context context;
	
	List<Hero> heroes;
	
	public GalleryAdapter(Context context, List<Hero> heroes)
    {
        this.context = context;
        this.heroes = heroes;
    }

    public int getCount() {
    	return heroes.size();
    }

    public Hero getItem(int position) {
        return heroes.get(position);
    }

    public long getItemId(int position) {
        return position;
    }
    
    /*private view holder class*/
    private class ViewHolder {
        ImageView image;
        TextView hero;
    }

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		ViewHolder holder = null;
        //Hero hero = getItem(position);
         
        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.hero_selection, null);
            holder = new ViewHolder();
            holder.hero = (TextView) convertView.findViewById(R.id.textView1);
            holder.image = (ImageView) convertView.findViewById(R.id.imageView1);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();
        
        holder.hero.setText(heroes.get(position).getName());
        holder.image.setImageResource(heroes.get(position).getImageId());
         
        return convertView;
	}

}
