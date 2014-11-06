package edu.asu.dota2guide;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class NotesActivity extends Activity{
	
	private SharedPreferences sp;
	private static final String NOTES = "NOTES";
	
	private ImageView image;
	private TextView name;
	private EditText notes;
	private Hero hero;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notes);
		
		name = (TextView) findViewById(R.id.textView3);
		notes = (EditText) findViewById(R.id.editText1);
        image=(ImageView)findViewById(R.id.imageView3);
        
        Intent i = getIntent(); //get intent from hero activity
		hero = (Hero) i.getSerializableExtra("HERO"); //set hero to the selected hero
		
		name.setText(hero.getName());
		image.setImageResource(hero.getImageId());
		
		//--load the SharedPreferences object--
		sp = getSharedPreferences(hero.getName(), MODE_PRIVATE);
		notes.setText(sp.getString(NOTES, "[Enter notes here]"));

	}
	
	public void saveNotes(View v) {
		//--get the SharedPreferences object--
    	sp = getSharedPreferences(hero.getName(), MODE_PRIVATE);
    	SharedPreferences.Editor editor = sp.edit();
    	
    	//--save the value in the EditText view to preferences--
    	editor.putString(NOTES, notes.getText().toString());
    	
    	//--saves the value--
    	editor.commit();
	}

}
