package com.kossie.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class ThirdActivity extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third);
		
		//test
		
		
		ImageView iv = (ImageView)findViewById(R.id.imageView1);
		iv.setImageResource(R.drawable.bea);
		
	}
}
