package edu.asu.dota2guide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class HeroActivity extends Activity{
	
	private ImageView image;
	private TextView name;
	private TextView description;
	private Button notes;
	private Hero hero;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hero); //set view
		
		//Initialize display objects
		image = (ImageView)findViewById(R.id.imageView2);
		name = (TextView) findViewById(R.id.textView2);
		description = (TextView) findViewById(R.id.descriptiontextView);
		notes = (Button) findViewById(R.id.notesbutton);
		
		Intent i = getIntent(); //get intent from main activity
		hero = (Hero) i.getSerializableExtra("Hero"); //set hero to the selected hero
		
		name.setText(hero.getName()); //display the selected hero's name
		image.setImageResource(hero.getImageId()); //display the selected hero's image
		description.setText(hero.getDescription()); //display the selected hero's description
	}
	
	public void openNotes(View vw) {
		Intent i = new Intent(this, NotesActivity.class);
		i.putExtra("HERO", hero);
		startActivity(i);
	}

}
