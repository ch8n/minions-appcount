package com.example.minions;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends Activity 
{

	Button btn_play;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		
		btn_play=(Button)findViewById(R.id.btn_play);
		btn_play.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				AlertDialog.Builder bu=new AlertDialog.Builder(MainActivity2.this);
				bu.setTitle("Begin");
				bu.setMessage("You Ready?");
				
				bu.setPositiveButton("Yes",new DialogInterface.OnClickListener() 
				{
					
					@Override
					public void onClick(DialogInterface dialog, int which) 
					{
						// TODO Auto-generated method stub
						Toast.makeText(MainActivity2.this,"Lets Start!",Toast.LENGTH_LONG).show();
						Intent intt= new Intent(MainActivity2.this,MainActivity3.class);
						startActivity(intt);
						MainActivity2.this.finish();
					}
					
				});
				
				bu.setNeutralButton("Cancel", new DialogInterface.OnClickListener()
				{
					
					@Override
					public void onClick(DialogInterface dialog, int which) 
					{
						// TODO Auto-generated method stub
						
					}
				});
				
				AlertDialog al=bu.create();
				al.show();
				
				
			}
		});
        
    }
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity2, menu);
		return true;
	}

}
