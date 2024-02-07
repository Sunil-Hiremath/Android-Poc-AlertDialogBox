package com.example.alertdialogbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* //single button
        AlertDialog alertDialog=new AlertDialog.Builder(MainActivity.this).create();

        //title
        alertDialog.setTitle("Terms and condition");
        //icon
        alertDialog.setIcon(R.drawable.baseline_circle_notifications_24);
        //message
        alertDialog.setMessage("Have you read all the T & C");


        //button
       alertDialog.setButton(AlertDialog.BUTTON_POSITIVE,"yes i've Read", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //action on button click
                Toast.makeText(MainActivity.this, "Yes, you can proceed now..", Toast.LENGTH_SHORT).show();

            }
        });
       alertDialog.show();
*/
       // for 2 button
        AlertDialog.Builder delDialog =new AlertDialog.Builder(MainActivity.this);
        delDialog.setTitle("Delete");
        delDialog.setIcon(R.drawable.baseline_delete_24);
        delDialog.setMessage("Are you sure you want to delete");

        delDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            //yes
                Toast.makeText(MainActivity.this, "Item deleted", Toast.LENGTH_SHORT).show();
            }
        });

        delDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //No
                Toast.makeText(MainActivity.this, "Item not deleted", Toast.LENGTH_SHORT).show();
            }
        });

        delDialog.show();


    }
// positive,negative and neutral  defines only positions
    @Override
    public void onBackPressed() {
       AlertDialog.Builder exitDialog= new AlertDialog.Builder(this);
       exitDialog.setTitle("exit");
       exitDialog.setMessage("Are you sure you want to exit");
       exitDialog.setIcon(R.drawable.baseline_arrow_back_ios_new_24);


       exitDialog.setPositiveButton("No", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
               Toast.makeText(MainActivity.this, "Welcome back", Toast.LENGTH_SHORT).show();
           }
       });

       exitDialog.setNegativeButton("yes", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
               MainActivity.super.onBackPressed();
            }
       });

       exitDialog.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
               Toast.makeText(MainActivity.this, "Operaton canceled", Toast.LENGTH_SHORT).show();
           }
       });

       exitDialog.show();


    }
}