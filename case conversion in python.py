"""str = "HII KHUSHI HOW ARE YOU"
print(str.lower())  # convert to lowercase
print(str.upper())  # convert to uppercase
print(str.capitalize())  # capitalize first letter
print(str.title())  # capitalize first letter of each word
print(str.swapcase())  # swap case  

str = input("Enter a string: ")
print("Lowercase:", str.lower()) """

#find and replace in string
text = "Hello World, Welcome to the World of Python"
print(text.find("d"))  # it will return the index of first occurrence of World

text = "Hello World, Welcome to the World of python"
print(text.replace("python", "Java"))  # it will replace python with java

str = "a,b,c"
print(str.split(","))
""""""

"""joining string
str = "a,b,c"
s = str.split(",")
print("after splitting:", s)

result = "-".join(s)
print("after joining:", result)"""

str = "python"
print(str.startswith('p'))
print(str.endswith("a"))
print(str.isalpha())  # it will return true if all characters are alphabets
print(str.isdigit())  # it will return true if all characters are digits
print(str.isalnum())  # it will return true if all characters are alphanumeric
print(str.isspace())  # it will return true if all characters are space

