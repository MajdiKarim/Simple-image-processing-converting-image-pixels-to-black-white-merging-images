# Simple-image-processing-converting-image-pixels-to-black-white-merging-images
Les dossier input image/output image contiennent les images utilisé brute et celle traité,output images/converted images contient les outputs de l'exo1, output images/ fused images contient les images fusionné, output images/converted images contient les ouputs de l'exercice 3, inversion des pixels.

This work is done in eclipse IDE
In this repo, we demonstrate simple image processing operations :
the folder "input images contains the pre-processed images (brut images), ouput images shows the post-processing images 
the first operation : TRANSFORM AN IMAGE TO BLACK AND WHITE ex1
transform a grayscale image into a binary image (black and white), we set a threshold s included
between 0 and 255 and we replace each pixel p either by 0 if p <s or by 255 otherwise.
Run the file convert.java : you will be asked enter the folder path to the input image, the pixel threshold s and the path folder where you want the processed file to land.



The second operation : MERGE TWO IMAGES 
To merge two images of the same size and the same resolution, we create a third where the value of each
pixel will be the maximum of the corresponding pixel values ​​in each of the images to be merged.
Run the file merge.java : you will be asked to provid two paths to you input images, and  a third one to specify where you want the merged image to land.

The third operation : INVERSE PIXELS 
This operations allows to invers the grayscale level be tuning each pixel of the image, we loop through the pixel matrice edit the pixel value x by 255-x which means the white level pixel will turn into black, white-gray pixels will transform to gray-black pixels ect..
Run the file inverse.java : you will be asked enter the folder path to the input image, then the path folder where you want the processed file to land.

the fourth operation : Histogram 
frequency of grayscale level from 0 to 255 (265 level), we loop through all the image pixel and collect the frequency of these levels among, the pixels mean,standard deviation, minimum pixel, maximum pixel.
Run the file Histogram.java 

