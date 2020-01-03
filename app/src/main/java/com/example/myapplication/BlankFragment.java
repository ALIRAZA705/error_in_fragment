package com.example.myapplication;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import static com.example.myapplication.MainActivity.a1;
import static com.example.myapplication.MainActivity.a2;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    LinearLayout linear1 = null;
    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_blank, container, false);
    // final   LinearLayout linear =view.findViewById(R.id.ss2);
a1.addValueEventListener(new ValueEventListener() {
    @Override
    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
        for (DataSnapshot child : dataSnapshot.getChildren()) {
            final View view = inflater.inflate(R.layout.bttnn, linear1, false);
           first value = dataSnapshot.getValue(first.class);
            Log.v("ali", "value " + value.getFirstnode());
           linear1.addView(view);
        }
    }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {

    }
});


        return  view;
    }

}
