package com.lockhartandburgess.quivercaddy;

import com.lockhartandburgess.quivercaddy.R.id;
import com.lockhartandburgess.quivercaddy.R.string;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

@SuppressLint({ "NewApi", "UseValueOf" })
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final CharSequence gNum = "3";
		Button b1 = (Button) findViewById(R.id.game_increase); 
		final TextView tv1 = (TextView) findViewById(R.id.game_number);
		tv1.append(gNum);
		
		b1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				CharSequence string = gNum;
				Integer num = Integer.parseInt((String) string);
				Integer newNum = new Integer(num.intValue() + 1);
				tv1.setText(newNum.toString());
				
				};
		});
				
		
	}
	
	

}
