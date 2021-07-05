package com.sg.ramimans.doggenetics;

import java.util.Random;

/**
 *
 * @author Rami Mansieh 
 * email: rmansieh@gmail.com 
 * data: Jun. 13, 2021 
 * purpose:
 */
public class DogGenetics {

    public static void main(String[] args) {

        String[] dogBreeds = {"Afghan Hound", "Akbash", "Alaskan Klee Kai",
            "American Bulldog", "American Cocker Spaniel", "American Foxhound",
            "American Hairless Terrier", "Anatolian Shepherd", "Australian Kelpie",
            "Australian Terrier", "Basset Hound", "Bearded Collie",
            "Bedlington Terrier", "Belgian Shepherd", "Belgian Shepherd Dog",
            "Bichon Frise", "Bloodhound", "Boerboel", "Border Collie",
            "Boston Terrier", "Boxer", "Brittany Spaniel", "Bull Mastiff",
            "Canaan Dog", "Cardigan Welsh Corgi", "Caucasian Shepherd Dog",
            "Chesapeake Bay Retriever", "Chihuahua", "Chow Chow", "Clumber Spaniel",
            "Coton de Tulear", "Dachshund", "Dalmatian", "Doberman Pinscher",
            "Dutch Shepherd", "English Bulldog", "English Pointer", "English Setter",
            "English Toy Spaniel", "Field Spaniel", "Finnish Spitz", "French Bulldog",
            "German Shepherd Dog", "German Spitz", "Giant Schnauzer", "Golden Retriever",
            "Great Dane", "Great Pyrenees", "Greyhound", "Havanese", "Ibizan Hound",
            "Karelian Bear Dog", "Kerry Blue Terrier", "Komondor", "Labrador Retriever",
            "Lancashire Heeler", "Leonberger", "Lowchen", "Maltese", "Manchester Terrier",
            "Mastiff", "Miniature Dachshund", "Miniature Poodle", "Mountain Cur",
            "Neapolitan Mastiff", "Norfolk Terrier", "Norwegian Elkhound",
            "Norwich Terrier", "Old English Sheepdog", "Papillon", "Patterdale Terrier",
            "Pembroke Welsh Corgi", "Peruvian Inca Orchid", "Pharaoh Hound",
            "Polish Lowland Sheepdog", "Pomeranian", "Poodle", "Portugese Water Dog",
            "Pug", "Pyrenean Shepherd", "Rottweiler", "Saint Bernard", "Samoyed",
            "Schipperke", "Schnauzer", "Scottish Terrier", "Shar-Pei", "Shiba Inu",
            "Shih Tzu", "Silky Terrier", "Small Musterlander", "Spinone Italiano",
            "Sussex Spaniel", "Tibetan Mastiff", "Tibetan Terrier", "Toy Fox Terrier",
            "Weimaraner", "Welsh Terrier", "Whippet", "Yorkshire Terrier"
        };

        Random randomNum = new Random();
        int percentages = 5;
        percentages = randomNum.nextInt(100) + 1;

        int separations = percentages - 1;

        // will return something that looks like {0, 32, 4, 9, 83, 100}
        int[] separationsArray = getSeparationsArray(separations);

        // will sort above to {0, 4, 9, 32, 83, 100} and assign it
        sortArray(separationsArray);

        // will get { 4 - 0, 9 - 4, 32 - 9, 83 - 32, 100 - 83 } or { 4, 5, 23, 51, 17}
        // values in percetages array will amount to 100
        int[] percentagesArray = getPercentagesArray(separationsArray);

        sortArray(percentagesArray);
        
        scrambleArray(dogBreeds);

        String[] breeds = cutArray(dogBreeds, percentagesArray.length);

        for (int i = 0; i < breeds.length; i++) {
            System.out.print(breeds[i]);
            System.out.print("  -  %");
            System.out.print(percentagesArray[i]);
            System.out.println();
        }

    }

    // check if number is in arr
    // eg. if number is 3 and arr is {1, 2, 3}, then true is returned
    public static boolean isInArray(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

    

    // returns an array containg 0 at index 0, 100 at the last index, and numSeparations unique random values in between 
    // e.g. {0, 79, 6, 4, 28, 100} when numSeparations == 4
    public static int[] getSeparationsArray(int numSeparations) {
        Random randomSeparation = new Random();
        int indices = numSeparations + 2; // index 0 will contain 0, last index contains 100
        int[] resultArray = new int[indices];
        resultArray[indices - 1] = 100;
        int num;

        // add random non-repeating values (range is 0-99 inclusive) between but not including index 0 and last index
        for (int i = 1; i < resultArray.length - 1; i++) {
            do {
                num = randomSeparation.nextInt(100 + 1);
            } while (isInArray(num, resultArray));
            resultArray[i] = num;
        }
        return resultArray;
    }
    
    // use selection sort to return a new Array with values from arr in increasing order
    // eg. if arr is {0, 79, 6, 4, 28, 100}, it will become {0, 4, 6, 28, 29, 100}
    public static int[] sortArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int min = arr[i];

            int replaceIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    replaceIndex = j;
                }
            }
            arr[replaceIndex] = arr[i];
            arr[i] = min;
            i++;
        }

        return arr;
    }

    // return an array containing the differences between each consecutive value (respectively) in diffArray (result.length == diffArray.length - 1)
    // e.g. if diffArray is {0, 4, 6, 28, 79, 100}, result will be {4, 2, 22, 51, 21} i.e values will add up to 100 
    public static int[] getPercentagesArray(int[] diffArray) {
        int[] result = new int[diffArray.length - 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = diffArray[i + 1] - diffArray[i];
        }
        return result;
    }
    
    // iterates through values in arr and replaces each value with a random other value from the same array
    // e.g. if arr is {"Chihuaha, "Doberman Pinscher", "Shiba Inu"} it could become {"Doberman Pinscher", "Shiba Inu", "Chihuahua"}
    public static String[] scrambleArray(String[] arr) {
        Random randomNum = new Random();
        int randomIndex;
        String temp;
        for (int i = 0; i < arr.length; i++) {
            randomIndex = randomNum.nextInt(arr.length);
            temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        return arr;
    }
    
    // return first chunkSize values from arr in a new array or arr iff chunkSize >= arr.length
    public static String[] cutArray(String[] arr, int chunkSize) {
        if (chunkSize <= arr.length) {
             String[] chunk = new String[chunkSize];
             for (int i = 0; i < chunk.length; i++) {
                 chunk[i] = arr[i];
             }
             return chunk;
        }   
        return arr;
    }
}
