package solution;

public class Solution
{
    public static void main(String[] args)
    {
        int n = 10;
        StringBuilder string = new StringBuilder();

        // First part: Upper pyramid
        for (int i = n / 2; i < n; i += 2)
        {
            // Print leading spaces
            for (int j = 1; j < n - i; j += 2)
            {
                string.append(" ");
            }

            // Print stars for left side
            for (int j = 1; j < i + 1; j++)
            {
                string.append("*");
            }

            // Print spaces between the two stars
            for (int j = 1; j < n - i + 1; j++)
            {
                string.append(" ");
            }

            // Print stars for right side
            for (int j = 1; j < i + 1; j++)
            {
                string.append("*");
            }

            string.append("\n");
        }

        // Second part: Bottom pyramid
        for (int i = n; i > 0; i--)
        {
            // Print leading spaces
            for (int j = 0; j < n - i; j++)
            {
                string.append(" ");
            }

            // Print stars
            for (int j = 1; j < i * 2; j++)
            {
                string.append("*");
            }

            string.append("\n");
        }

        System.out.println(string.toString());
    }
}
