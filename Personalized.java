public class Personalized {
    public static void regular_ad(){
        StdOut.println("\nAd:\nDiscover something EXTRA ORDINARY!\nThere is absolutely nothing special about our product, but you should buy it anyway because of our awesome generic ad.\n");
    }

    public static void dog_ad() {
        StdOut.println("\nDog Food Ad:\nIntroducing Tail-Waggin' Delights!\nMade with real, tender chicken, savory beef, and fresh vegetables! Give your furry friend the best quality only.\n");
    }

    public static void cat_ad(){
        StdOut.println("\nCat Food Ad: \nYummy cat food. Indulge your feline friend with the finest flavors of our premium cat food.\n");
    }

    public static void expen_ad(){
        StdOut.println("\nExpensive Product Ad: \nFor the LOW, LOW price of only 35 billion dollars, you could be the proud owner of a BRAND NEW sailboat!\n");
    }

    public static void cheap_ad(){
        StdOut.println("\nCheap Product Ad: \nListen up broke person. Since you make no money, you can afford our paper napkins for 16 cents! Get yours today!\n");
    }

    public static void tour_ad(){
        StdOut.println("\nTourism Ad: \nYou should visit Harrisburg or Philadelphia! You can join us on a helicopter tour of the area! Learn all there is to know about your new favorite vacation spot!\n");
    }

    public static void cust1_ad(){ //Male
        StdOut.println("\nCustom Ad 1: \nIntroducing our new top of the line Man-LEE-Man protein packed with nutrients and chemicals that will make everyone think you are on steroids.\n");
    }

    public static void cust2_ad(){ //Female
        StdOut.println("\nCustom Ad 2: \nCheck out our brand new women's line of clothing! From winter coats to summer outfits, we now have you covered.\n");
    }

    public static void cust3_ad(){ //Single
        StdOut.println("\nCustom Ad 3: \nCome visit our new dating site today if you are single and ready to mingle!\n");
    }

    public static void cust4_ad(){ //Dating
        StdOut.println("\nCustom Ad 4: \nJoin us for a romantic date night that's sure to impress your special someone!\n");
    }

    public static void cust5_ad(){ //Married
        StdOut.println("\nCustom Ad 5: \nAre you sick and tired of spending all your time with your spouse? Join us for a retreat in the mountains to clear you mind!\n");
    }

    public static void cust6_ad(){ //Republican
        StdOut.println("\nCustom Ad 6: \nWay to register to vote! Get out to the polls and vote for your new republican president!\n");
    }

    public static void cust7_ad(){ //Democrat
        StdOut.println("\nCustom Ad 7: \nWay to register to vote! Get out to the polls and vote for your new democratic president!\n");
    }

    public static void cust8_ad(){ //Independent
        StdOut.println("\nCustom Ad 8: \nWay to register to vote! Get out to the polls and vote for your new independent president!\n");
    }

    public static void cust9_ad(){ //Spring or summer
        StdOut.println("\nCustom Ad 9: \nWant a fun outside birthday party for your special spring/summer day? Join us at the Splash Mountain Waterpark!\n");
    }

    public static void cust10_ad(){ //Fall or winter
        StdOut.println("\nCustom Ad 10: \nBrrrr! Leave the hassle to us and let us plan your indoor birthday party for a fun day of warmth out of the snow!\n");
    }

    public static boolean str_question(String str_question){
        System.out.println(str_question); //Prints question given from main function
        String user_input = StdIn.readLine().toLowerCase(); //Gets user input and converts to all lowercase
        return user_input.equals("yes"); //Returns true if user input is yes, false if no
    }

    public static int int_question(String int_question){
        System.out.println(int_question);
        String user_input = StdIn.readLine();

        //Checks for input validity
        while (user_input.matches("[a-zA-Z]+") || Integer.parseInt(user_input) < 0){
            System.out.println("Input must be an integer greater than or equal to 0");
            System.out.println(int_question);
            user_input = StdIn.readLine();
        }
        int user_input_int = Integer.parseInt(user_input);
        return Integer.parseInt(user_input);
    }

    public static boolean gender_question(String gender_question){
        System.out.println(gender_question);
        String user_input = StdIn.readLine().toLowerCase();
        return user_input.equals("male"); //Returns true if person is male, false if female (Assumes there are only two genders.)
    }

    public static String extreme_question(String question){
        System.out.println(question);
        return StdIn.readLine().toLowerCase();
    }

    public static void Low_Personal(String pet_question){
        boolean result = str_question(pet_question);
        if(result){
            dog_ad();
        }else{
            regular_ad();
        }
    }

    public static void Med_Personal(String friends_question){
        int result = int_question(friends_question);
        if (result >= 500){
            dog_ad();
        }else if (result < 50){
            cat_ad();
        }else {
            regular_ad();
        }
    }

    public static void High_Personal(String zip_question, String age_question){
        int[] HAR_Zip_Codes = {17101, 17102, 17103, 17104, 17110, 17111, 17120};
        int[] PHI_Zip_Codes = {19102,  19103,  19104,  19106,  19107,  19109,  19111,  19112,
                19114,    19115,    19116,    19118,    19119,    19120,    19121,    19122,    19123,    19124,    19125,
                19126,    19127,    19128,    19129,    19130,    19131,    19132,    19133,    19134,    19135,    19136,
                19137,    19138,    19139,    19140,    19141,    19142,    19143,    19144,    19145,    19146,    19147,
                19148,    19149,    19150,    19151,    19152,    19153,    19154};

        int zip = int_question(zip_question);
        int age = int_question(age_question);

        //Start with person from neither harrisburg nor philly
        boolean har = false;
        boolean phi = false;

        //Check if zip code is in harrisburg
        for (int i : HAR_Zip_Codes){
            if (i == zip){
                har = true;
            }
        }

        //Check if zip code is in philly
        for (int i : PHI_Zip_Codes){
            if (i == zip){
                phi = true;
            }
        }

        //Chooses and displays the appropriate ad
        if (!har && !phi){
            tour_ad();
        }else if(age < 25){
            cheap_ad();
        }else{
            expen_ad();
        }
    }

    public static void Xtrem_Personal(String gender_question, String relationship_question, String political_question, String birthday_question){
        boolean gender_result = gender_question(gender_question);
        String relationship_result = extreme_question(relationship_question);
        String political_result = extreme_question(political_question);
        String birthday_result = extreme_question(birthday_question);

        //Male ad if true, female ad if false
        if (gender_result){
            cust1_ad();
        }else{
            cust2_ad();
        }

        if (relationship_result.equals("single")){
            cust3_ad();
        }else if (relationship_result.equals("dating")){
            cust4_ad();
        }else if (relationship_result.equals("married")){
            cust5_ad();
        }

        if (political_result.equals("republican")){
            cust6_ad();
        }else if (political_result.equals("democrat")){
            cust7_ad();
        }else if (political_result.equals("independent")){
            cust8_ad();
        }

        if (birthday_result.matches("march|april|may|june|july|august")){
            cust9_ad();
        }else if (birthday_result.matches("september|october|november|december|january|february")){
            cust10_ad();
        }
    }

    public static void main(String[] args){
        int level = int_question("Which level of customization would you like to see? (0, 1, 2, 3, 4)");
        System.out.println("level = " + level);
        switch (level){
            case 0:
                regular_ad();
                break;
            case 1:
                Low_Personal("\nDo you own a dog? (yes/no)");
                break;
            case 2:
                Med_Personal("How many Facebook friends do you have?");
                break;
            case 3:
                High_Personal ("What is your zip code?", "What is your age?");
                break;
            case 4:
                Xtrem_Personal("What is your gender? (male/female)", "What is your relationship status? (single/dating/married)", "What is your political affiliation? (republican/democrat/independent)", "What month were you born? (Please enter full month name e.g. January)");
                break;
        }
    }
}
