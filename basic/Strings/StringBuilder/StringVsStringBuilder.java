class StringVsStringBuilder {
    public static void main(String[] args) {
        long startTime, endTime;
        
        // Using String (Inefficient)
        startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += i; // Creates a new String object each time
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by String: " + (endTime - startTime) + " ms");

        // Using StringBuilder (Efficient)
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append(i); // Modifies the existing object
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ms");
    }
}
