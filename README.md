# bitmap-transformer
bitmap transformer CLI

## Files
    * [App](../src/main/java/bitmap/transformer/App.java)
    * [Bitmap](../src/main/java/bitmap/transformer/Bitmap.java)

## Usage
    * run command:
        * ./gradlew run --args 'input output transform'
            * input and output arguments are filepath to bmps and transform is the name of the transform the user wants


### Transforms
    * grayscale - This transform will gray out the given bmp file.
    * blackout - This transform will blackout the entire bmp file.
