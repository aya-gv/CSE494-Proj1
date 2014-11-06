package edu.asu.dota2guide;

import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends ActionBarActivity {
	
	private Button helpButton;
	private Gallery gallery;
	
	private Intent i;
	
	private HeroDatabase heroDatabase;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		heroDatabase = new HeroDatabase();
		
		gallery = (Gallery) findViewById(R.id.gallery);
        gallery.setSpacing(1);
        gallery.setAdapter(new GalleryAdapter(this, heroDatabase.heroes));
        
        i = new Intent(this, HeroActivity.class);
        
        gallery.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // show the selected Image
            	Hero hero = (Hero) gallery.getAdapter().getItem(position);
            	i.putExtra("Hero", hero);
                startActivity(i);
            }
        });
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
	
	public void strength(View v) {
		gallery.setAdapter(new GalleryAdapter(this, heroDatabase.strengthheroes));
	}
	
	public void agility(View v) {
		gallery.setAdapter(new GalleryAdapter(this, heroDatabase.agilityheroes));
	}
	
	public void intelligence(View v) {
		gallery.setAdapter(new GalleryAdapter(this, heroDatabase.intelligenceheroes));
	}
	
	public void help(View v) {
		AlertDialog alertDialog = new AlertDialog.Builder(this).create();
		alertDialog.setTitle("Help");
		alertDialog.setMessage("Welcome fellow Dota2 Player!! (:\n" +
				"This app just provides you information about certain heroes in Dota2.\n" +
				"You can pick the category of heroes (Strength, Agility or Intelligence) " +
				"by clicking one of the buttons at the top to show just those kinds of characters.\n" +
				"Then, simply choose a hero that appeals to you.\n" +
				"Take additional notes on your own and hfgl!!");
		alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
		   public void onClick(DialogInterface dialog, int which) {
		      // TODO Add your code for the button here.
		   }
		});
		// Set the Icon for the Dialog
		alertDialog.setIcon(R.drawable.android_dota);
		alertDialog.show();
	}
	
	public void tips(View v) {
		AlertDialog alertDialog = new AlertDialog.Builder(this).create();
		alertDialog.setTitle("Don't Be a Newb!");
		alertDialog.setMessage("Please, don't be a newb. These simple quick tips helps you become a better player (:\n\n" +
				"DO NOT EVER:\n\n" +
				"1) Auto attack creeps. If you push the lane too far in the early game, you get closer to the " +
				"enemy's tower and that is a bad thing. You do not have many abilities nor many escape methods " +
				"that early into the game, so the tower will deal a lot of damage and then the enemy will " +
				"attack you and you pretty much just fed the other team. Just don't do it.\n\n" +
				"2) Use all your mana on creeps. When it's around middle game and it's time to push towers do " +
				"not push the lane by using your spells on creeps. Obviously, the enemy is going to want to " +
				"protect their tower so by the time you actually get to the tower you are all out of spells and mana " +
				"and again, the enemy will have the upperhand. So once again, you threw the game away if you do this.\n\n" +
				"3) Waste your money on Healing Salves and Clarities. It is nice to be able to hear allies and " +
				"all, but you only need these items in early game so you can stay longer in the lane. You want " +
				"to save up your gold for better items (your core or situational items).\n\n" +
				"4) Have 5 heroes in one lane. If 5 people are laning together, you will be lvl 1 for a very " +
				"long time since experience is split amongst 5 people.\n\n" +
				"5) Save your gold until you get enough for a very expensive item. Most of the items can be bought " +
				"in increments. For example to get a Mekansm you can buy it all in one go, or buy a headdress, then " +
				"buckler then the recipe. Items have their own ingredients to make. So if you happen to die before" +
				"you get your item, you will be saving gold for a very long time. Plus, if you spend your gold often, " +
				"the gold output on your death will not be very much compared to those who saved a lot of gold.\n\n" +
				"6) Lack a teleport. You want to carry a teleport at all times. If you need to be reinforcements " +
				"because another lane is being lost, use the teleport. If in early game you have to go all the way " +
				"back to base because your lane was harrassed, use a teleport to save time from walking. It's better " +
				"to get back to your lane faster than wasting time walking and not getting any experience.\n\n" +
				"glhf~ (:");
		alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
		   public void onClick(DialogInterface dialog, int which) {
		      // TODO Add your code for the button here.
		   }
		});
		// Set the Icon for the Dialog
		alertDialog.setIcon(R.drawable.android_dota);
		alertDialog.show();
	}
	
	public void credits(View v) {
		AlertDialog alertDialog = new AlertDialog.Builder(this).create();
		alertDialog.setTitle("Credits and References");
		alertDialog.setMessage("Dota 2 Guide Version 1.0\ndeveloped by Alyza Villa\n\n" +
				"References:\nhttp://dota2.gamepedia.com/Dota_2_Wiki\n\n" +
				"Dota 2 content and material are trademarks and copyrights of Valve or its licensors. " +
				"All rights reserved.");
		alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
		   public void onClick(DialogInterface dialog, int which) {
		      // TODO Add your code for the button here.
		   }
		});
		// Set the Icon for the Dialog
		alertDialog.setIcon(R.drawable.android_dota);
		alertDialog.show();
	}
}
