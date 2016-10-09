# FloatingMenu
Android Floating Menu

in XML
 <  <com.adilmirza.arcmenu.arclib.GFloatingMenu
        android:id="@+id/flmenu"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:padding="16sp"
        app:floatIcon="@drawable/menu" /> >
        
        and in Java File 
        
          private GFloatingMenu gFloatingMenu;
          
           configUI();
           private void configUI() {
        mRelativeLayout = (RelativeLayout) findViewById(R.id.activity_main);
        gFloatingMenu = (GFloatingMenu) findViewById(R.id.flmenu);
        gFloatingMenu.setParentBlurView(mRelativeLayout);
    }
![floatingmenu](https://cloud.githubusercontent.com/assets/3800098/19223017/eb98908c-8e7e-11e6-9942-70d7d8ee65a8.png)

