package com.poly.polyapcsafinalproject23_24;

public class Eater {
    /**
     * Eater for eating simulator
     * @author Jesse Gonzalez
     * @since 1/16/2024
     * @version 1.0
     */

        /**
         * eaters name
         */
        private String name;

        /**
         * number of chicken
         */
        private int chicken;
        /**
         * number of salad
         */
        private int salad;

        /**
         * number of biscuits
         */
        private int biscuit;

        /**
         * number of potatoes
         */
        private int potatoes;
        /**
         * number of total eaten
         */
        private int eaten;

        /**
         * max number of food
         */
        private int maxEaten;

        /**
         * eater id
         */
        private int ID;

        /**
         * number of eaters
         */
        private static int numEaters;

        /**
         * default constructor
         * <br>Postconditions: eater with a name as an empty string
         * name, chicken, salad, biscuit, potatoes, eaten, all set to 0, maxEaten is set to 10, id is
         * assigned to eater
         */
        public Eater()
        {
            this.name = "";
            this.chicken = 0;
            this.salad = 0;
            this.biscuit = 0;
            this.potatoes = 0;
            this.eaten = 0;
            this.maxEaten = 10;
            numEaters++;
            this.ID = numEaters;
        }

        /**
         * constructor initializes name
         * <br>Preconditions: name must be non-null
         * <br>Postconditions: eater given a name, chicken, salad, biscuit, potatoes, eaten, all set to 0,
         * maxEaten is set to 10, id is assigned to eater
         * @param  name    name of eater
         */
        public Eater(String name)
        {
            this.name = name;
            this.chicken = 0;
            this.salad = 0;
            this.biscuit = 0;
            this.potatoes = 0;
            this.eaten = 0;
            this.maxEaten = 10;
            numEaters++;
            this.ID = numEaters;
        }

        /**
         * constructor initializes all food
         * <br>Preconditions: name must be non-null, other values can not be negative
         * <br>Postconditions: eater given a name, chicken, salad, biscuit, potatoes, eaten, all set to 0,
         * maxEaten is set to 10, id is assigned to eater
         * @param  name    name of eater
         * @param  chicken    number of chicken eaten ( >=0 )
         * @param  salad    number of salad eaten ( >=0 )
         * @param  biscuit    number of biscuits eaten ( >=0 )
         * @param  potatoes    number of potatoes eaten ( >=0 )
         * @param  eaten    number of food eaten ( >=0 )
         */
        public Eater(String name, int chicken, int salad, int biscuit, int potatoes, int eaten, int maxEaten)
        {
            this.name = name;
            this.chicken = chicken;
            this.salad = salad;
            this.biscuit = biscuit;
            this.potatoes = potatoes;
            this.eaten = eaten;
            this.maxEaten = maxEaten;
            numEaters++;
            this.ID = numEaters;
        }
        /**
         * gets eaters name
         * @return name of eater
         */
        public String getName()
        {
            return name;
        }

        /**
         * gets number of chicken
         * @return returns the number of chicken
         */
        public int getChicken()
        {
            return chicken;
        }

        /**
         * gets number of salad
         * @return returns the number of salad
         */
        public int getSalad()
        {
            return salad;
        }

        /**
         * gets number of biscuit
         * @return returns the number of biscuit
         */
        public int getBiscuit()
        {
            return biscuit;
        }

        /**
         * gets number of potatoes
         * @return returns the number of potatoes
         */
        public int getPotatoes()
        {
            return potatoes;
        }

        /**
         * gets number of food eaten
         * @return returns the number of foods eaten
         */
        public int getEaten()
        {
            return eaten;
        }

        /**
         * gets max number of food eaten
         * @return returns the max number of foods eaten
         */
        public int getMaxEaten()
        {
            return maxEaten;
        }
        /**
         * gets eaters ID
         * @return returns the eaters ID
         */
        public int getID()
        {
            return ID;
        }

        /**
         * sets the chicken
         * <br>Precondition: numChicken greater than or equal to 0
         * <br>Postcondition: numChicken set
         * @param numChicken    number of chicken ate ( >= 0)
         */
        public void setChicken(int numChicken)
        {
            this.chicken = numChicken;
        }

        /**
         * sets the salad
         * <br>Precondition: numSalad greater than or equal to 0
         * <br>Postcondition: numSalad set
         * @param numSalad    number of salad ate ( >= 0)
         */
        public void setSalad(int numSalad)
        {
            this.salad = numSalad;
        }

        /**
         * sets the biscuit
         * <br>Precondition: numBiscuit greater than or equal to 0
         * <br>Postcondition: numBiscuit set
         * @param numBiscuit    number of biscuit ate ( >= 0)
         */
        public void setBiscuit(int numBiscuit)
        {
            this.biscuit = numBiscuit;
        }

        /**
         * sets the potatoes
         * <br>Precondition: numPotatoes greater than or equal to 0
         * <br>Postcondition: numPotatoes set
         * @param numPotatoes    number of potatoes ate ( >= 0)
         */
        public void setPotatoes(int numPotatoes)
        {
            this.potatoes = numPotatoes;
        }

        /**
         * sets the eaten
         * <br>Precondition: numEaten greater than or equal to 0
         * <br>Postcondition: numEaten set
         * @param numEaten    number of eaten ate ( >= 0)
         */
        public void setEaten(int numEaten)
        {
            this.eaten = numEaten;
        }

        /**
         * sets the max food eaten
         * <br>Precondition: maxEaten greater than or equal to 0
         * <br>Postcondition: maxEaten set to 10
         * @param maxEaten    max number of food edible (10)
         */
        public void setMaxEaten(int numMaxEaten)
        {
            this.maxEaten = numMaxEaten;
        }

        /**
         * sets the eaters ID
         * <br>Precondition: ID is a non empty int
         * <br>Postcondition: ID set for eater
         * @param ID    new ID for the eater
         */
        public void setID(int id)
        {
            this.ID = ID;
        }

        /**
         * sets the eaters name
         * <br>Precondition: newName is a non empty string
         * <br>Postcondition: name set to newName
         * @param newName    new name set for the eater
         */
        public void setName(String newName)
        {
            this.name = newName;
        }

        /**
         *  toString method
         *  @return gymhead as a string
         */
        @Override
        public String toString()
        {
            return
                    "\nEater name: \t" + name +
                            "\nChicken eaten: \t" + chicken +
                            "\nSalad eaten: \t" + salad +
                            "\nBiscuits eaten: \t" + biscuit +
                            "\nPotatoes eaten: \t" + potatoes +
                            "\nTotal food eaten: \t" + eaten +
                            "\nEater ID: \t" + ID;
        }

        /**
         * returns true if all atrributes match between equal
         * <br>Precondition: anotherEater must be non null
         * @param anotherEater    another eater object
         * @return true if eaters are equal
         */
        public boolean equals(Eater anotherEater)
        {
            if (this.name.equals(anotherEater.name) &&
                    this.chicken == anotherEater.chicken &&
                    this.salad == anotherEater.salad &&
                    this.biscuit == anotherEater.biscuit &&
                    this.potatoes == anotherEater.potatoes &&
                    this.eaten == anotherEater.eaten &&
                    this.ID == anotherEater.ID
            )
            {
                return true;
            }
            return false;
        }

        /**
         * run this method when the eater eats chicken
         * <br>Precondition:
         * <br>chicken increases by 1
         * <br>eaten increases by 1
         */
        public void eatChicken()
        {
            chicken++;
            eaten++;
        }

        /**
         * run this method when the eater eats salad
         * <br>Precondition:
         * <br>salad increases by 1
         * <br>eaten increases by 1
         */
        public void eatSalad()
        {
            salad++;
            eaten++;
        }

        /**
         * run this method when the eater eats biscuit
         * <br>Precondition:
         * <br>biscuit increases by 1
         * <br>eaten increases by 1
         */
        public void eatBiscuit()
        {
            biscuit++;
            eaten++;
        }

        /**
         * run this method when the eater eats potatoes
         * <br>Precondition:
         * <br>potatoes increases by 1
         * <br>eaten increases by 1
         */
        public void eatPotatoes()
        {
            potatoes++;
            eaten++;
        }


    }
}
