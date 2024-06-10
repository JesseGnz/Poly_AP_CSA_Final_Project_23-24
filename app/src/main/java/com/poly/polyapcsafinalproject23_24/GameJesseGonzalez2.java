package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameJesseGonzalez2 extends GameActivity {

    /**
     * player in game
     */
    private Eater eater;

    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3, btn4;
    private boolean isWon;
    private int numLives;

    @Override
    protected void run() {
        setContentView(R.layout.activity_game_4_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);

        tvTitle.setText("Eater club");
        tvSubtitle.setText("High School Edition");


        start();
    }


    //write game down here
    //  use other void methods as nesssary
    //  use loops as nessesary
    public void start() {
        createEater();
        runEating();
    }


    private void setAllBtnsVisible() {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.VISIBLE);
    }


    /**
     * Method that creates the player. Method asks for user name and uses
     * it to create a contenstant
     */
    private void createEater() {
        tvStoryText.setText("Hello Player");
        Eater player = new Eater();
        runEating();
    }

    /**
     * method that runs the eating game, it loops and the eater eats chicken, salad, biscuits, or
     * potatoes
     * it ends when total food eaten reaches 10
     */

    private void runEating() {
        if (eater.getEaten() < eater.getMaxEaten()) {
            displayStats();
            chooseOption();
        } else {
            ivMain.setImageResource(R.drawable.im_gonzalezjesse_1);
            endOfEating();
        }
    }

    /**
     * displays the eater stats
     */
    private void displayStats()
    {
        tvBisuitVal.setText(""+eater.getBiscuit());
        tvChickenVal.setText(""+eater.getChicken());
        tvPotatoesVal.setText(""+eater.getPotatoes());
        tvSaladVal.setText(""+eater.getSalad());
    }

    /**
     * eater chooses to eat chicken, salas, biscuits, or potatoes
     */

    private void chooseOption()
    {
        setAllBtnsVisible();
        btn1.setText("Chicken");
        btn2.setText("Salad");
        btn3.setText("Biscuit");
        btn4.setText("potato");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                eater.eatChicken();
                ivMain.setImageResource(R.drawable.im_gonzalezjesse_2);
                runEating();
            }
        } );
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                eater.eatSalad();
                ivMain.setImageResource(R.drawable.im_gonzalezjesse_3);
                runEating();
            }
        } );

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                eater.eatBiscuit();
                ivMain.setImageResource(R.drawable.im_gonzalezjesse_1);
                runEating();
            }
        } );

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                eater.eatPotatoes();
                ivMain.setImageResource(R.drawable.im_gonzalezjesse_2);
                runEating();
            }
        } );


    }

    /**
     * after eating reaches 10 the game ends
     * stats show how much of each food was eaten and may choose to player again
     */
    private void endOfEating()
        {
            ivMain.setImageResource(R.drawable.im_gonzalezjesse_2);

            btn1.setText("Chicken");
            btn2.setText("Salad");
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);

            if (eater.getEaten() >= eater.getMaxEaten()) {
                System.out.println("Eating done");
                ivMain.setImageResource(R.drawable.im_gonzalezjesse_1);
            }

            tvMain.setText("You ate " + eater.getChicken() + "pieces of chicken " + eater.getSalad() + "salads " + eater.getBiscuit() + "biscuits " + eater.getPotatoes() + "potatoes. In total you ate " + eater.getEaten() + "foods! \nEat again\n1. yes\n2. no");


            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    eater = new Eater(eater.getName());
                    tvMain.setText("Choose your food");

                    ivMain.setImageResource(R.drawable.im_gonzalezjesse_1);
                    runEating();
                }
            });

        }
}        `




