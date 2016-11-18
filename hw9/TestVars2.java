import java.io.*;

class TestVars2 {

    /** helper function to read user input and convert to an integer.
        returrns 0 if there is an exception (e.g., user enters non-integer) */
    public static int getVal(String prompt) {
        byte [] buff = new byte[100];
        int count;
        int value = 0;

        try {
            System.out.print(prompt);
            count = System.in.read(buff, 0, 100);
            value = Integer.parseInt(new String(buff, 0, count-1));
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
        return value;
    }

    public static void main(String args[]) {
        // AddN.n = 7;
        int val;
        val = getVal("enter an integer value: ");
        AddN a = new AddN();
        System.out.println("The call addn(" + val + ") returns " + a.addn(val));
        return;
    }
}

class AddN {
    public int n = 7;
    public int addn(int x) {
        return x + n;
    }
}