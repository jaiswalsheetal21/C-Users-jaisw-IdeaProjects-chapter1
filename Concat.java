public class Concat {

        public static void main(String[] args)
        {
            String s = "Geeks", g = "";

            // Using concat() method over strings
            String f = s.concat(g);

            // Checking if both strings are equal

            // Case 1
            if (f == s)

                // Identical strings
                System.out.println("Both are same");

            else

                // Non-identical strings
                System.out.println("not same");

            // Case 2
            String e = s + g;

            // Again checking if both strings are equal
            if (e == s)

                // Identical strings
                System.out.println("Both are same");
            else

                // Non-identical strings
                System.out.println("not same");
        }
    }


