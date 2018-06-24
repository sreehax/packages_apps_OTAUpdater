package com.sreeharis.ota;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.content.pm.PackageManager;

public final class Updater extends Activity {
	private Toolbar toolbar;
	@Override
	protected void onCreate(Bundle activityState) {
		super.onCreate(activityState);
		setContentView(R.layout.main);
		toolbar.setNavigationIcon(R.drawable.abc_ic_ab_back_material);
		toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				PackageManager pm;
				pm = getPackageManager();
				Intent LaunchIntent = pm.getLaunchIntentForPackage("com.android.settings");
				startActivity(LaunchIntent);
			}
		});
	}
}
