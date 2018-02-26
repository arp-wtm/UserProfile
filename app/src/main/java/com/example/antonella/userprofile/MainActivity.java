package com.example.antonella.userprofile;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** we search in the list of resources the view
         *that will contain the image profile and
         *bind it to a variable of ImageView type named picture
         */

        ImageView picture = (ImageView) findViewById(R.id.profile_picture);

        /** assign the image of profile to variable picture */

        picture.setImageResource(R.drawable.antonella_rotondo);

        /**  search the three view that will contain profile
         * info and bind to variable of TextView type named
         * name, birthday and country
         */

        TextView name = (TextView) findViewById(R.id.name);
        TextView birthday = (TextView) findViewById(R.id.birthday);
        TextView country = (TextView) findViewById(R.id.country);

        /** fill variables with the right contents */

        name.setText(R.string.antonella_rotondo);
        birthday.setText(R.string.date);
        country.setText(R.string.Italy);

        /** change font style size and color to text */

        name.setTypeface(null, Typeface.BOLD);
        name.setTextSize(30);
        name.setTextColor(Color.GREEN);
        birthday.setTextSize(30);
        birthday.setTextColor(Color.BLUE);
        country.setTextSize(30);
        country.setTextColor(Color.RED);


    }
}
