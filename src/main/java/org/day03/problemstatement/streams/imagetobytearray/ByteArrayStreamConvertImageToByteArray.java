package org.day03.problemstatement.streams.imagetobytearray;

import java.io.*;
import java.util.Arrays;

public class ByteArrayStreamConvertImageToByteArray {
    public static void main(String[] args) {
        String inputImagePath = "src/main/java/com/streams/bytearraystream/inputimage.jpg";
        String outputImagePath = "src/main/java/com/streams/bytearraystream/writeimage.jpg";

        try {
            // Converting image to byte array using method
            byte[] imageBytes = ConvertImageToByteArray.convertImageToByteArray(inputImagePath);

            // Writing byte array back to image file
            WriteByteArrayToImage.writeByteArrayToImage(imageBytes,outputImagePath);

            //Output
            System.out.println();
            System.out.println("Image converted successfully");
            System.out.println("Image written successfully");
            System.out.println("Check output image file -> " + outputImagePath);

            //Creating byte array for output image
            byte[] imageBytes2 = ConvertImageToByteArray.convertImageToByteArray(outputImagePath);
            if(Arrays.equals(imageBytes,imageBytes2) ){
                System.out.println("Both images are identical");
            }
            else{
                System.out.println("Both images are not identical");
            }
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
