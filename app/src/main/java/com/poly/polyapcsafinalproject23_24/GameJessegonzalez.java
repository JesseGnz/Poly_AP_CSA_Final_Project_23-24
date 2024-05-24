package com.poly.polyapcsafinalproject23_24;

public class GameJessegonzalez {

        /**
         * player in game
         */
        private Eater eater;

        //create variables up here



        //write game down here
        //  use other void methods as nesssary
        //  use loops as nessesary
        public void run()
        {
            createEater();
            runEating();
        }

        public void beginEating()
        {

        }

        /**
         * Method that creates the player. Method asks for user name and uses
         * it to create a contenstant
         */
        private void createEater()
        {
            System.out.println("What is your name? ");
            eater = new Eater(name);
        }

        /**
         *  method that runs the eating game, it loops and the eater eats chicken, salad, biscuits, or
         * potatoes
         * it ends when total food eaten reaches 10
         */

        private void runEating()
        {
            beginEating();
            while (eater.getEaten() < eater.getMaxEaten() )
            {
                displayStats();
                chooseOption();
            }
            endOfEating();
        }

        /**
         *  displays the eater stats
         */
        private void displayStats()
        {
            String text =
                    eater.getName() +
                            "\nChicken eaten: \t" + eater.getChicken() +
                            "\nSalad eaten: \t" + eater.getSalad() +
                            "\nBiscuits eaten: \t" + eater.getBiscuit() +
                            "\nPotatoes eaten: \t" + eater.getPotatoes() +
                            "\nTotal food eaten: \t" + eater.getEaten();
            System.out.println(text);
        }

        /**
         * eater chooses to eat chicken, salas, biscuits, or potatoes
         */

        private void chooseOption()
        {
            String text = """
      What would you like to eat?
      1. Chicken
      2. Salad
      3. Biscuit
      4. Potato
      """;
            System.out.println(text);
            int option = Util.enterInt(1,4);
            if (option == 1)
            {
                eater.eatChicken();
            }
            else if (option == 2)
            {
                eater.eatSalad();
            }
            if (option == 3)
            {
                eater.eatBiscuit();
            }
            else if (option == 4)
            {
                eater.eatPotatoes();
            }
        }

        /**
         * after eating reaches 10 the game ends
         * stats show how much of each food was eaten and may choose to player again
         */
        private void endOfEating()
        {
            if (eater.getEaten() >= eater.getMaxEaten())
            {
                System.out.println("Eating OVER!");
            }
            Util.pauseConsole();
            Util.clearConsole();
            System.out.println("You ate " + eater.getChicken() + "pieces of chicken " + eater.getSalad() + "salads " + eater.getBiscuit() + "biscuits " + eater.getPotatoes() + "potatoes. In total you ate " + eater.getEaten() + "foods!");
            Util.pauseConsole();
            System.out.println("Eat again\n1. yes\n2. no");
            int option = Util.enterInt(1,2);
            if (option == 1)
            {
                eater = new Eater(eater.getName());
                runEating();
            }
        }
    }

