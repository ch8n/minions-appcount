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

public class MainActivity1 extends Activity 
{
	Button btn_howto,btn_play,btn_exit;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        btn_play=(Button)findViewById(R.id.btn_play);
        btn_howto=(Button)findViewById(R.id.btn_howto);
        btn_exit=(Button)findViewById(R.id.btn_exit);
        
        btn_exit.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				AlertDialog.Builder bu=new AlertDialog.Builder(MainActivity1.this);
				bu.setTitle("Quit");
				bu.setMessage("You Really leaving me alone?");
				
				bu.setPositiveButton("Yes",new DialogInterface.OnClickListener() 
				{
					
					@Override
					public void onClick(DialogInterface dialog, int which) 
					{
						// TODO Auto-generated method stub

						MainActivity1.this.finish();
						Toast.makeText(MainActivity1.this,"NO!! you left",Toast.LENGTH_LONG).show();
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
        
        btn_howto.setOnClickListener(new View.OnClickListener()
        {
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity1.this,"Read Instructions before Playing!!",Toast.LENGTH_LONG).show();
				Intent intt= new Intent(MainActivity1.this,MainActivity2.class);
				startActivity(intt);
				MainActivity1.this.finish();
			}
		});
        
        btn_play.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				AlertDialog.Builder bu=new AlertDialog.Builder(MainActivity1.this);
				bu.setTitle("Begin");
				bu.setMessage("You Ready?");
				
				bu.setPositiveButton("Yes",new DialogInterface.OnClickListener() 
				{
					
					@Override
					public void onClick(DialogInterface dialog, int which) 
					{
						// TODO Auto-generated method stub
						Toast.makeText(MainActivity1.this,"Lets Start!",Toast.LENGTH_LONG).show();
						Intent intt= new Intent(MainActivity1.this,MainActivity3.class);
						startActivity(intt);
						MainActivity1.this.finish();
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
        getMenuInflater().inflate(R.menu.main_activity1, menu);
        return true;
    }
    
}
