num1 = float(input("Enter a number1: "))

num2 = float(input("Enter a number2: "))

#Division
div_value = num1/num2
# print("Divided num1 with num2-- "+  str(value))

#------------------------------------------------------------------------------


#Multiplication
mul_value = num1*num2
# print("Multiplication of two numbers--- " +str(mul_value))



#Addition of two numbers

add_value = num1 + num2
# print("Addition of two numbers--- "+ str(add_value))

#Substraction of two numbers

sub_value = num1 - num2
# print("Substraction of two numbers---|  " + str(sub_value))




#Check bodmas for validity

bodmas_value = add_value +(sub_value * div_value) /mul_value 

print("Check bodmas for validity----|  " + str(bodmas_value))


