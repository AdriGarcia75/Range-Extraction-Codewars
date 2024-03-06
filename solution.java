class Solution {
		public static String rangeExtraction(int[] arr) {
        //i will use a stringbuilder to make the creation of the string more convenient
        StringBuilder result = new StringBuilder();
        //for every number found on the next while, this for will "skip" that number as we increase i on the while (if not clear, read the nested while loop)
        for (int i = 0; i < arr.length; i++) {
            //we initialize the start and the end at the first value
            int start = arr[i]; int end = arr[i];
            //the check loop for consecutive numbers
            while (i + 1 < arr.length && arr[i + 1] - arr[i] == 1) {
                end = arr[i + 1];
                //we have to increase i as we use it on the while and we use it as the index on the for loop
                i++;
            }
            //append a comma if it's not the first element, by looking at the 
            if (result.length() > 0) {
                result.append(",");
            }
            // Add the range to the result
            if (start == end) {
                result.append(start);
            //if its not the start we append the start number, if it's a range we append between them a comma
            } else if (end - start >= 2) {
                result.append(start).append("-").append(end);
            } else {
                result.append(start).append(",").append(end);
            }
        }
        return result.toString();
    }
}
