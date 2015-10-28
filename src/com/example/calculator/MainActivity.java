package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
//sends the savedInstance to the super method
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

}
