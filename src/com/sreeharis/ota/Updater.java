package com.sreeharis.ota;
import android.widget.Toast;
public final class Updater extends android.app.Activity {
	@Override
	protected void onCreate(android.os.Bundle activityState) {
		super.onCreate(activityState);
		Toast.makeText(Updater.this, "Hello, World", Toast.LENGTH_LONG).show();
	}
}
