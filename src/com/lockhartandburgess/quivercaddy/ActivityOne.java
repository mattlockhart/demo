package com.lockhartandburgess.quivercaddy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityOne extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_one);
		super.onCreate(savedInstanceState);
		
		Button b = (Button) findViewById(R.id.startButton);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(ActivityOne.this, ActivityTwo.class));
				
			}
		});
	}

}
