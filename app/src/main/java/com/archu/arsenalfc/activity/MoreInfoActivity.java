package com.archu.arsenalfc.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;

import com.archu.arsenalfc.R;

public class MoreInfoActivity extends Activity {

    private CircleMenu circleMenu;
    private int selectedIndex = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_info);
        circleMenu = findViewById(R.id.circleMenu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.drawable.add, R.drawable.remove);
        circleMenu.addSubMenu(Color.parseColor("#3b5998"), R.drawable.facebook);
        circleMenu.addSubMenu(Color.parseColor("#1da1f2"), R.drawable.twitter);
        circleMenu.addSubMenu(Color.parseColor("#34a853"), R.drawable.googlemaps);
        circleMenu.addSubMenu(Color.parseColor("#ff0000"), R.drawable.youtube);
        circleMenu.addSubMenu(Color.parseColor("#c32aa3"), R.drawable.instagram);
        circleMenu.addSubMenu(Color.parseColor("#19a7a4"), R.drawable.contact);
        circleMenu.setOnMenuSelectedListener(new OnMenuSelectedListener() {
            @Override
            public void onMenuSelected(int i) {
                selectedIndex = i;
            }
        });
        circleMenu.setOnMenuStatusChangeListener(new OnMenuStatusChangeListener() {
            @Override
            public void onMenuOpened() {

            }

            @Override
            public void onMenuClosed() {
                Intent intent = new Intent(MoreInfoActivity.this, WebViewActivity.class);
                Intent app = new Intent(Intent.ACTION_VIEW);

                switch (selectedIndex) {
                    case 0:
                        String url = "https://www.facebook.com/Arsenal";
                        Uri uri = Uri.parse(url);
                        try {
                            ApplicationInfo applicationInfo = getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                            if (applicationInfo.enabled) {

                                uri = Uri.parse("fb://facewebmodal/f?href=" + url);
                            }
                        } catch (PackageManager.NameNotFoundException ignored) {
                        }
                        app.setData(uri);
                        startActivity(app);
                        break;
                    case 1:
                        try {
                            app.setData(Uri.parse("twitter://user?screen_name=arsenal"));
                            startActivity(app);
                        } catch (Exception e) {
                            intent.putExtra("url", "https://twitter.com/#!/arsenal");
                            startActivity(intent);
                        }
                        break;
                    case 2:
                        startActivity(new Intent(MoreInfoActivity.this, MapsActivity.class));
                        break;
                    case 3:
                        app.setData(Uri.parse("https://www.youtube.com/channel/UCpryVRk_VDudG8SHXgWcG0w"));
                        startActivity(app);
                        break;
                    case 4:
                        try {
                            getPackageManager().getPackageInfo("com.instagram.android", 0);
                            app.setData(Uri.parse("https://www.instagram.com/_u/arsenal"));
                            startActivity(app);
                        } catch (Exception e) {
                            intent.putExtra("url", "https://www.instagram.com/arsenal");
                            startActivity(intent);
                        }
                        break;
                    case 5:
                        Intent phoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + Uri.encode("020 7619 5003")));
                        startActivity(phoneIntent);
                        break;
                }
                selectedIndex = -1;
            }
        });
    }
}
