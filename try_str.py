string_operation = input("Enter your name-")

#string slicing
# start_slicing = int(input("Start slicing index: "))
# end_slicing = int(input("End slicing index: "))

# slice_string = string_operation[start_slicing:end_slicing]

# print(slice_string)

print("----------------------------------------------------------------")


#lowercase & uppercase characters
# print(string_operation.upper())
# print(string_operation.lower())


print("----------------------------------------------------------------")
# replacing charaters in a string as strings are immutable 
# it will just print but wont store it in the variable 
# already assigned to the string
rep_string =string_operation.replace("a" , "0")
# print(rep_string)

print("----------------------------------------------------------------")

# split a string
#rsplit.


rsplit_string = string_operation.rsplit("@",1) #this will split from right when it'll find first @.




splitted_string = rep_string.split("@",1)   #whatever parameter is passed in the string with that 
                                                # parametr it will split the string and store it in a list.
# print(splitted_string)
print(rsplit_string)
print(splitted_string)


print("----------------------------------------------------------------")

#conacatenate a string

# print("Hello "+rep_string)


print("----------------------------------------------------------------")



#Format string

age = int(input("Enter your age:- "))
y_of_exp = float(input("Years of experience:- "))

bio = "My name is " + rep_string + "."+ "My age is {} , and my years of exp is {}"

# print(bio.format(age,y_of_exp))


print("----------------------------------------------------------------")


#Escape characters
# \'	Single Quote	
# \\	Backslash	will insert a backslashes
# \n	New Line	will go to new line
# \r	Carriage Return	
# \t	Tab	will add a tab whitespace
# \b	Backspace	will go backspace onne time
# \f	Form Feed	
print("----------------------------------------------------------------")

# \ooo	Octal value	#A backslash followed by three integers will result in a octal value:
txt1 = "\110\145\154\154\157"
# print(txt1+ " printed using octal value") 
print("----------------------------------------------------------------")
 
# \xhh	Hex value
#A backslash followed by an 'x' and a hex number represents a hex value:
txt2 = "\x48\x65\x6c\x6c\x6f"
# print(txt2 + " printed using hex value") 
print("----------------------------------------------------------------")














