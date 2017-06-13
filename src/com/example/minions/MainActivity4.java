package com.example.minions;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends Activity 
{
	Button btn_tryAgain;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main4);
		
		btn_tryAgain=(Button)findViewById(R.id.btn_tryAgain);
		
		btn_tryAgain.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				AlertDialog.Builder bu=new AlertDialog.Builder(MainActivity4.this);
				bu.setTitle("Play Again");
				bu.setMessage("try Again?");
				
				bu.setPositiveButton("Yes",new DialogInterface.OnClickListener() 
				{
					
					@Override
					public void onClick(DialogInterface dialog, int which) 
					{
						// TODO Auto-generated method stub
						Intent intt=new Intent(MainActivity4.this,MainActivity1.class);
						startActivity(intt);
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
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity4, menu);
		return true;
	}

}
