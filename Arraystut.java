import java.util.Arrays;
class Arraystut {
    public static void main(String[] args) {
        //char vowels[] =  new char[5];
        //vowels[0] = 'a';
        //vowels[1] = 'e';
        //vowels[2] = 'i';
        //vowels[3] = 'o';
        //vowels[4] = 'u';
        //int startindex = 1;
        //int endindex = 4;
        //Arrays.sort(vowels,startindex,endindex);
        //int founditemindex = Arrays.binarySearch(vowels, startindex, endindex,'e');
        //System.out.println(founditemindex);
        //char vowels[] = {'a','i','e','u','o'};
        //Arrays.fill(vowels, startindex,endindex,'X');
        //System.out.println(Arrays.toString(vowels));

        //example 2
        int numbers[] = {1,2,3,4,5};

        //int startingIndex = 1;
        //int endingIndex = 10;

        int copyofnumbers[] = Arrays.copyOf(numbers, numbers.length);

        //Arrays.fill(numbers,0);

        //System.out.println(Arrays.toString(numbers));
        //System.out.println(Arrays.toString(copyofnumbers));
        System.out.println(Arrays.equals(numbers, copyofnumbers));
    }
}
