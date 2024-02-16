public class PrintWithDelay {
    public static void main(String[] args) {
        String welcome = "Welcome to CSTAD",
                quote = "Don't give up this Opportunity, do your best first",
                download = "Downloading..............completed 100%";
        // Print welcome message
        printDelay(welcome);
        // Print quote with border and delay
        printWithBorderAndDelay(quote);
        // Print download message
        printDelay(download);
    }

    private static void printDelay(String str) {
        // Print quote with delay
        for (char c : str.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(300); // 500ms delay for each character
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    private static void printWithBorderAndDelay(String quote) {
        // Print top border
        printBorder(quote.length());

        // Print quote with delay
        for (char c : quote.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(300); // 500ms delay for each character
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); // Move to next line after quote

        // Print bottom border
        printBorder(quote.length());
    }

    private static void printBorder(int length) {
        for (int i = 0; i < length; ++i) {
            System.out.print("-");
            try {
                Thread.sleep(300); // 500ms delay for each character
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); // Move to next line after border
    }
}
