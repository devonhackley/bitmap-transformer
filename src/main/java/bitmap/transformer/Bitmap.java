package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bitmap {
    // instance variables
    int width;
    int height;
    String outputPath;
    BufferedImage image;


    // constructor
    public Bitmap(BufferedImage image, String outputPath){
        this.width = image.getWidth();
        this.height = image.getHeight();
        this.outputPath = outputPath;
        this.image = image;
    }

    public void transform(String name){

    }

    // instance methods
    public void writeToFile(){
        try
        {
            // create file for output from Bitmap instance
            File f = new File(this.outputPath);

            // write to output file
            ImageIO.write(this.image, "bmp", f);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
