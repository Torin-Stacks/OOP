public class DuplicateNo {
    public int returnDuplicate(int[] arr) {
        int[] newArray = new int[arr.length];
        for(int index =0; index< arr.length;index++){
            for(int index2 = index+1; index2 < arr.length;index2++){
                if(arr[index] == arr[index2]){
                    newArray[index] +=1;
                }

            }
        }
        int largest = newArray[0];
        for(int index =0; index<newArray.length;index++){
            if (largest < newArray[index]){
                largest = newArray[index];
            }
        }
        return largest;
    }
}
