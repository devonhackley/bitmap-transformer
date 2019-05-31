# bitmap-transformer
bitmap transformer CLI

## Files
* [App.java](../src/main/java/bitmap/transformer/App.java)
* [Bitmap.java](../src/main/java/bitmap/transformer/Bitmap.java)

## Usage
    * run command:
        * ./gradlew run --args 'input output transform'
            * input and output arguments are filepaths to bmps and transform is the name of the transformation the user wants.(Look at available transform list)


### Available Transforms
    * grayscale - This transform will gray out the given bmp file.
    * blackout - This transform will blackout the entire bmp file.
    * randomize - This transform will randomize the pixels in the bmp file.
    * pixelate - This transform will pixelate the bmp file.
