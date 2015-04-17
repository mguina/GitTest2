package com.example.matthewboulton.number;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class Game extends ActionBarActivity {


    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in); //this is where you get the input system.in is the keyboard.


        out.print("Enter any number from 1 to 10: ");


        int inputNo = keyboard.nextInt();

        int randomNo = new Random() .nextInt(2) + 1; // the number in the brackets is the number of possibilities from which the random number can be chosen.


        if (inputNo == randomNo) {

            out.println(" ***************");

            out.println(" *** YOU WIN ***");

            out.println(" ***************");

        } else {

            out.println("******************");

            out.println("**** YOU LOSE ****");

            out.println("******************");

            out.println("* The Number was *");

            out.println("******* " + randomNo + " *******");

        }

    }



}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
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
