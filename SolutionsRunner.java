public class SolutionsRunner {
    public static void main(String[] args) {
        SolutionStrategy[] strategies =
                new SolutionStrategy[]{
                        // Add strategies here
                        // new Strategy(),
        };
        // Add test cases here and the type of the result
        var input = new Object[]{};
        var output = new Object[]{};
        // add the type of result here and in SolutionStrategy.java
        Object result;
        int errors = 0;

        int nTestCases = input.length;
        for (SolutionStrategy s : strategies) {
            for (int i = 0; i < nTestCases; i++) {
                result = s.solve(input[i]);
                if(result != output[i]) {
                    System.out.println("Solution " + s.getClass().getName() + " wrong for input " + input[i]);
                    System.out.println("Expected: " + output[i] + " but got: " + result);
                    System.out.println();
                    errors++;
                }
            }
        }
        printResults(errors, nTestCases);
    }

    private static void printResults(int errors, int nTestCases) {
        if(errors == 0) {
            System.out.println("All tests passed!");
        } else {
            System.out.println(errors + " tests failed.");
            System.out.println(nTestCases - errors + " tests passed.");
            System.out.println((0.0 + nTestCases - errors) / nTestCases * 100  + "% of tests passed.");
        }
    }
}

