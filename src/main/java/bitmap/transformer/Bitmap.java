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
        if(name.equals("grayscale")) {
            for(int y = 0; y< height; y++){
                for(int x = 0; x < width; x++){
                    int pixel = image.getRGB(x, y);

                    // grab color values of pixel
                    int a = (pixel>>24)&0xff;
                    int r = (pixel>>16)&0xff;
                    int g = (pixel>>8)&0xff;
                    int b =  pixel&0xff;

                    // calculate average
                    int avg = (r+b+b)/3;

                    pixel = (a<<24) | (avg<<16) | (avg<<8) | avg;

                    image.setRGB(x, y, pixel);
                }
            }
        } else if(name.equals("blackout")) {
            for(int y = 0; y< height; y++){
                for(int x = 0; x < width; x++){
                    image.setRGB(x, y, 0);
                }
            }
        }
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
