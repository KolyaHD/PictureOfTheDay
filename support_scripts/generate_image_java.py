import sys
number_of_images = int(sys.argv[1])
image_prefix = "R.drawable.image"
outString = "{"
for i in range(number_of_images):
    outString += image_prefix + str(int(i+1))
    if i <= (number_of_images-2):
        outString += ", "
outString += "}"
print(outString)