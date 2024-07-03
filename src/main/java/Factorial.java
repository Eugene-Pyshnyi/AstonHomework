public class Factorial {
    public long printFactorial(long factorial) {
        long result = 1L;
        for (long i = 1L; i <= factorial; i++) {
            result = result * i;
        }
        return result;
    }
}
