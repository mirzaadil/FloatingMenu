package com.adilmirza.arcmenu;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.adilmirza.arcmenu.arclib.GFloatingMenu;
import com.adilmirza.arcmenu.utils.AppConstant;

import static com.adilmirza.arcmenu.utils.AppConstant.menu4;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout mRelativeLayout;
    private GFloatingMenu gFloatingMenu;
    private GFloatingMenu.OnItemClickListener mListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configUI();
        configFloatArc();
        configMenu();
    }

    private void configUI() {
        mRelativeLayout = (RelativeLayout) findViewById(R.id.activity_main);
        gFloatingMenu = (GFloatingMenu) findViewById(R.id.flmenu);
        gFloatingMenu.setParentBlurView(mRelativeLayout);
    }

    private void configMenu() {

        gFloatingMenu.AddMenuItem(((BitmapDrawable) getResources().getDrawable(R.drawable.exit)).getBitmap(), AppConstant.menu1, mListener);
        gFloatingMenu.AddMenuItem(((BitmapDrawable) getResources().getDrawable(R.drawable.openmenu)).getBitmap(), AppConstant.menu2, mListener);
        gFloatingMenu.AddMenuItem(((BitmapDrawable) getResources().getDrawable(R.drawable.expense)).getBitmap(), AppConstant.menu3, mListener);
        gFloatingMenu.AddMenuItem(((BitmapDrawable) getResources().getDrawable(R.drawable.income)).getBitmap(), AppConstant.menu3, mListener);
        gFloatingMenu.AddMenuItem(((BitmapDrawable) getResources().getDrawable(R.drawable.voice)).getBitmap(), menu4, mListener);
    }

    private void configFloatArc() {
        mListener = new GFloatingMenu.OnItemClickListener() {
            @Override
            public void onItemClick(GFloatingMenu.GFloatingMenuItem view) {

                gFloatingMenu.closeMenu();
                if (view.getItemInfo().text.equals(AppConstant.menu1)) {
                    Toast.makeText(MainActivity.this, AppConstant.menu1, Toast.LENGTH_SHORT).show();
                } else if (view.getItemInfo().text.equals(AppConstant.menu2)) {
                    Toast.makeText(MainActivity.this, AppConstant.menu2, Toast.LENGTH_SHORT).show();
                } else if (view.getItemInfo().text.equals(AppConstant.menu3)) {
                    Toast.makeText(MainActivity.this, AppConstant.menu3, Toast.LENGTH_SHORT).show();
                } else if (view.getItemInfo().text.equals(AppConstant.menu4)) {
                    Toast.makeText(MainActivity.this, AppConstant.menu4, Toast.LENGTH_SHORT).show();
                } else if (view.getItemInfo().text.equals(AppConstant.menu5)) {
                    Toast.makeText(MainActivity.this, AppConstant.menu5, Toast.LENGTH_SHORT).show();
                }
            }
        };
    }
}
