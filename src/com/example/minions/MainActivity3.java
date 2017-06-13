package com.example.minions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends Activity 
{
	
	Button btn_g1,btn_g2,btn_g3,btn_g4,btn_g5,btn_g6,btn_g7,btn_g8,btn_g9;
	int entered=0,prev=0,nxt=0,track=0,start=0;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main3);
		
		btn_g1=(Button)findViewById(R.id.btn_game1);
		btn_g2=(Button)findViewById(R.id.btn_game2);
		btn_g3=(Button)findViewById(R.id.btn_game3);
		btn_g4=(Button)findViewById(R.id.btn_4);
		btn_g5=(Button)findViewById(R.id.btn_5);
		btn_g6=(Button)findViewById(R.id.btn_6);
		btn_g7=(Button)findViewById(R.id.btn_7);
		btn_g8=(Button)findViewById(R.id.btn_8);
		btn_g9=(Button)findViewById(R.id.btn_9);
		
		btn_g1.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				entered=1;
				start++;
				start_point();
				game_inc();
				btn_g1.setBackgroundResource(R.drawable.done);
			}
		});
		
		btn_g2.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				entered=2;
				start++;
				start_point();
				game_inc();
				btn_g2.setBackgroundResource(R.drawable.done);
				
			}
		});
		
		btn_g3.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				entered=3;
				start++;
				start_point();
				game_inc();
				btn_g3.setBackgroundResource(R.drawable.done);
			}
		});
		
		btn_g4.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				entered=4;
				start++;
				start_point();
				game_inc();
				btn_g4.setBackgroundResource(R.drawable.done);
			}
		});
		
		btn_g5.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				entered=5;
				start++;
				start_point();
				game_inc();
				btn_g5.setBackgroundResource(R.drawable.done);
			}
		});
		
		btn_g6.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				entered=6;
				start++;
				start_point();
				game_inc();
				btn_g6.setBackgroundResource(R.drawable.done);
			}
		});
		
		btn_g7.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				entered=7;
				start++;
				start_point();
				game_inc();
				btn_g7.setBackgroundResource(R.drawable.done);
			}
		});
		
		btn_g8.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				entered=8;
				start++;
				start_point();
				game_inc();
				btn_g8.setBackgroundResource(R.drawable.done);
			}
		});
		
		btn_g9.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				entered=9;
				start++;
				start_point();
				game_inc();
				btn_g9.setBackgroundResource(R.drawable.done);
			}
		});
			
		
	}

	public void start_point()
    {
    	if(start==1)
    	{	
    		track=entered;
    		prev=track-1;
    		nxt=track+1;
    	}
    }
	
	
	 public void game_inc()
		{
	    
			if(entered>prev && entered<nxt)
			{
				Toast.makeText(MainActivity3.this,"Proceed", Toast.LENGTH_SHORT).show();
				prev++;
				nxt++;
				
				if(nxt==11)
				{
					Toast.makeText(MainActivity3.this,"Congratutations!", Toast.LENGTH_SHORT).show();
					Intent intt=new Intent(MainActivity3.this,MainActivity4.class);
					startActivity(intt);
					MainActivity3.this.finish();
				}
			}
			else
			{
				Toast.makeText(MainActivity3.this,"Invalid Move, You Lost!", Toast.LENGTH_SHORT).show();
				Intent intt2=new Intent(MainActivity3.this,MainActivity5.class);
				startActivity(intt2);
				MainActivity3.this.finish();
			}
		}
	    
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity3, menu);
		return true;
	}

}
