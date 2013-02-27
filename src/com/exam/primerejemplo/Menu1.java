package com.exam.primerejemplo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.widget.Button;

public class Menu1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.men1);
		
	}

	public void siguiente2 (View view) {
		Intent intento1 = new Intent (this,Menu2.class);
		startActivity(intento1);
		
	}

	
	

}
