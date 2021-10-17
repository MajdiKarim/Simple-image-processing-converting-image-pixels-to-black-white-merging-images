# Simple-image-processing-converting-image-pixels-to-black-white-merging-images


In this repo, we demonstrate simple image processing operations :

the first operation : TRANSFORM AN IMAGE TO BLACK AND WHITE 
transform a grayscale image into a binary image (black and white), we set a threshold s included
between 0 and 255 and we replace each pixel p either by 0 if p <s or by 255 otherwise.
Run the file convert.java : you will be asked enter the folder path to the input image, the pixel threshold s and the path folder where you want the processed file to land.

The second operation : MERGE TWO IMAGES
To merge two images of the same size and the same resolution, we create a third where the value of each
pixel will be the maximum of the corresponding pixel values ​​in each of the images to be merged.
Run the file merge.java : you will be asked to provid two paths to you input images, and  a third one to specify where you want the merged image to land.
