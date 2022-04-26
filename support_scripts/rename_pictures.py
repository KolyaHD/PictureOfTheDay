import os
import sys
import pathlib

folder = sys.argv[1]
image_prefix = "image"
mylist = os.listdir(folder)
count = 1
for item in mylist:
    if image_prefix not in item and any(char.isdigit() for char in item):
        filename, file_extension = os.path.splitext(item)
        inputImagePath = str(pathlib.Path(folder) / item)
        newName = str(pathlib.Path(folder) / (image_prefix + str(count) + file_extension))
        print("Renaming " + inputImagePath + " to " + newName)
        os.rename(inputImagePath, newName)
        count += 1