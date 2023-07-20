list1 =['apple', 'banana', 'cherry', 'orange', 'kiwi', 'melon',  'dragon', 'litchi','banana','banana']


app_list = []

for i in list1:
    if i not in app_list:
        app_list.append(i)
        print(i ,list1.count(i))

    else:
        pass






# print(list1)

#to access the list with specific index
# print(list1[0]) #whatever integer inside square brackets will be the index.

# print("---------------------------------------------------------------------------")


#Iterate through the list 
# for elements in list1:
    # print(elements)

# print("---------------------------------------------------------------------------")


#to iterate through the list using the index value we use range.
#len(list1) will return the length of the list.


# for i in range(0, len(list1)):
    # print(i)
    # print(list1[i]) #this iterates over the list using the index value.




#While loop in list
# i = 0
# while i < len(list1): #Print all items, using a while loop to go through all the index numbers
    # print(list1[i])
    # i += 1 


#A short hand for loop that will print all items in a list:

# [print(x) for x in list1]



# print("---------------------------------------------------------------------------")  


#If we give negative index value it will give the last element of the list.

# print(list1[-1]) 


#range of index.By leaving out the start value, the range will start at the first item

# print(list1[2:5]) #Ths will print the values fromindex 2,3,4 which is starting form 2 but not including 5.

# print(list1[:5]) #this will start from 0th index.

# print(list1[2:]) #this will start from 2nd index and will print rest of the list.

#Specify negative indexes if you want to start the search from the end of the list:

# print(list1[-4:-1]) #this will start from the end of the list.

# print("---------------------------------------------------------------------------")


# check if in list using in keyword argument

# if "apple" in list1:
    # print("Present")

# print("---------------------------------------------------------------------------")


#Change element in the list

# list1[0] = "jamun"
# print(list1)

# print("---------------------------------------------------------------------------")


#Change range of elements in the list

# list1[2:5]= "pineapple","mango","watermelon"

# print(list1)

# print("---------------------------------------------------------------------------")


#If you insert less items than you replace,
# the new items will be inserted where you specified, and the remaining items will move accordingly:
#Change the second and third value by replacing it with one value:

# list1[1:3] = ["pineapple"]
# print(list1)

# print("---------------------------------------------------------------------------")

#insert a new item

# list1.insert(1, "papaya")
# print(list1)

#Append a new item

# list1.append("orange")
# print(list1)


#Join two lists
# tropical = ["mango","strawberry","papaya"]

# list1.extend(tropical)
# print(list1)

#The extend() method does not have to append lists, you can add any iterable object (tuples, sets, dictionaries etc.)

# list2 = ["apple", "banana", "cherry"]
# tropical_tuple = ("mango","strawberry","papaya")

# list2.extend(tropical_tuple)
# print(list2)

#REMOVE ELEMENTS FROM LIST1

# list1.remove("banana")
# print(list1)


# list2 = ["apple", "banana", "cherry"]
# list2.pop(1) #will remove element from the first index and if we do not specify it it will pop the last element from the list.
# print(list2)


# del list2[0] #this will delete the element from tje 0th index

# del list2 #this will delete the list

# list2.clear() #this will clear the list


#Based on a list of fruits, you want a new list, containing only the fruits with the letter "a" in the name.

# Without list comprehension you will have to write a for statement with a conditional test inside:

# fruits = ["apple", "banana", "cherry", "kiwi", "mango"]
# newlist = []

# for x in fruits:
#   if "a" in x:
#     newlist.append(x)

#newlist = [expression for item in iterable if condition ==  True] #imp

# print("---------------------------------------------------------------------------")


# # count_list = list1.count() 

# for i in list1:
#     count_list = list1.count(i)
#     # print(i)
#     print(count_list)

# print("---------------------------------------------------------------------------")


#reverse the list.
# list1.reverse()
# print(list1)


# print("---------------------------------------------------------------------------")

#sort the list

fruits =['apple','orange', 'kiwi', 'melon','dragon']

# def myFunc(e):
#     return len(e)


# fruits.sort() #Ascending order
# fruits.sort(reverse=True) # desecding order
# fruits.sort(key=myFunc) #sorted using length of the words in the list.
# fruits.sort(reverse=True,key=myFunc) #Sort the list by the length of the values and reversed:
# print(fruits)


# def myFunc(e):
#     return e["year"]

# cars = [{'car': 'Ford', 'year': 2005},
#   {'car': 'Mitsubishi', 'year': 2000},
#   {'car': 'BMW', 'year': 2019},
#   {'car': 'VW', 'year': 2011}]


# cars.sort(key=myFunc)
# print(cars)

# print("---------------------------------------------------------------------------")











