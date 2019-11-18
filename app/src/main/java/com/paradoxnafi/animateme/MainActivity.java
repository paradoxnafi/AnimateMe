package com.paradoxnafi.animateme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

	public void fadeInto(View view) {

		ImageView rose = (ImageView) findViewById(R.id.imageViewRose);
		ImageView flowerFull = (ImageView) findViewById(R.id.imageViewFullFlower);
		rose.animate().alpha(0f).setDuration(2000);
		flowerFull.animate().alpha(1f).setDuration(4000);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
}
