public class EMICal {
// Function to calculate EMI
    static float EMI_CALCULATOR(float p, float r, float t)
    {

      float emi;
        r = r / (12 * 100); // one month interest
        t = t * 12;         // one-month period
        emi = (p * r * (float)Math.pow(1 + r, t))
                / (float)(Math.pow(1 + r, t) - 1);
        return (emi);
    }

    // Driver Program
    static public void main (String[] args)
    {

        float principal, rate, time,  EMI ;
        principal = 10000;
        rate = 12;
        time = 2;
        EMI = EMI_CALCULATOR(principal, rate, time);
        System.out.println("Monthly EMI is: " +EMI);

    }
}
