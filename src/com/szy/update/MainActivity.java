package com.szy.update;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

/**
 *@author coolszy
 *@date 2012-4-26
 *@blog http://blog.92coding.com
 */
public class MainActivity extends Activity

{
	public static  int i=0;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Button updateBtn = (Button) findViewById(R.id.btnUpdate);
		
		if(i<=3){
			Log.i("iiiiiiii",i+"");
		updateBtn.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v) 
			{	
				UpdateManager manager = new UpdateManager(MainActivity.this);
				
				// 妫�煡杞欢鏇存柊
				manager.checkUpdate();
			}
			
		});
		}else {
			Toast.makeText(MainActivity.this, "取消次数过多", 1);
		}
 
	}
}