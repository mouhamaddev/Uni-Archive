class ex4 {
    public static void main(String[] args) {

        double CHEM_credits = 4;
        double CMPS_credits = 2;
        double MATH_credits = 2;
        double PHYS_credits = 4;

        double CHEM_grades = 90;
        double CMPS_grades = 87;
        double MATH_grades = 78;
        double PHYS_grades = 75;

        double sum_of_credits = CHEM_credits + CMPS_credits + MATH_credits + PHYS_credits;

        double GPA = (CHEM_credits * CHEM_grades + CMPS_credits * CMPS_grades + MATH_credits * MATH_grades + PHYS_credits * PHYS_grades) / (sum_of_credits * 25);

        System.out.println("CHEM 112: "+CHEM_credits+" credits and "+CHEM_grades+" grade");
        System.out.println("CMPS 114: "+CMPS_credits+" credits and "+CMPS_grades+" grade");
        System.out.println("MATH 102: "+MATH_credits+" credits and "+MATH_grades+" grade");
        System.out.println("PHYS 112: "+PHYS_credits+" credits and "+PHYS_grades+" grade");

        System.out.println("");

        System.out.println("Your total GPA is: " + GPA);

    }
}