package com.example.myapplication;

import android.app.FragmentManager;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;

import android.text.Layout;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    public static DatabaseReference a1,a2,a3,a4;
//    private static FragmentManager fragmentManager;
    public static FragmentManager fragmentManager;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        a1=  FirebaseDatabase.getInstance().getReference();
        a2=a1.child("first node");
        a2.setValue("first");
        a3=a1.child("second node");
        a3.setValue("second");
        a4=a1.child("third node");
        a4.setValue("third");
        final LinearLayout linear =  findViewById(R.id.ss);

        b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                final ValueEventListener ali = a1.addValueEventListener(new ValueEventListener() {
//
//
//                    @Override
//                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//
//                        //
//                        //String value = dataSnapshot.getValue(String.class);
////                Log.v("ali" , "value " + value);
//                        for (DataSnapshot child : dataSnapshot.getChildren()) {
////                            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
////                                    LinearLayout.LayoutParams.MATCH_PARENT,
////                                    LinearLayout.LayoutParams.WRAP_CONTENT);
//
////                          Button btn = new Button(MainActivity.this);
//                            //((ViewGroup) Layout.getParent()).removeView(Layout);
////scrollView.removeView(scrollChildLayout);
//                          //  Button    btn = findViewById(R.id.button);
//                            View view;
//                            view = View.inflate(MainActivity.this, R.layout.bttnn, null);
                            fragmentManager.beginTransaction().replace(R.id.fragment_container, new RoomsFragment(), null).commit();
                            fragmentManager.beginTransaction().replace(R.id.fragment_container, new BlankFragment(), null).commit();
//                            linear.addView(view);

//                FragmentManager fragmentManager = getFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                BlankFragment hello = new BlankFragment();
//                fragmentTransaction.add(R.id.fragment_container, hello, "HELLO");
//                fragmentTransaction.commit();

/*
}
}

@Override
public void onCancelled(@NonNull DatabaseError databaseError) {


}
});

BlankFragment fragment = new BlankFragment();
FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
transaction.replace(R.id.fragment_container, fragment);
transaction.commit();
*/


            }
        });







//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
