fruits = {'mango','pineapple','apple','orange','kiwi'}

# fruits.add('dragon')

# print(fruits)
 

# print("----------------------------------------------------")


# fruits.clear() #this will clear the set but the memory allocation will be there.

# print("----------------------------------------------------")

# x = fruits.copy()

# print("----------------------------------------------------")

companies = {"google","apple","microsoft"}

# z = fruits.difference(companies) #this will print the elements from fruits which are not present in companies in a new set.
# print("----------------------------------------------------")

# fruits.difference_update(companies) #this will remove the unwanted elements from fruits wrt companies.

# fruits.discard("kiwi") #this will remove the elements from the set

# print("----------------------------------------------------")
a={"a","b","c"}
b={"e","a","c","d","b"}
c={"r","a","d","c","e"}
# z = fruits.intersection(companies) #this will print the elements present in both sets

# x = a.intersection(b,c) #will return the elements present in all the three sets
# print(x)

# print("----------------------------------------------------")

# a.intersection_update(b,c) #will return the elements present in
# print(a)

# print("----------------------------------------------------")

# l = fruits.isdisjoint(companies) #if similar elements present will return False.
# print(l)

# print("----------------------------------------------------")


# z = a.issubset(b) #if all elements of a are present in b then it will return true
# print(z)

# print("----------------------------------------------------")


z = a.issuperset(b) #check if all elements of b are present in a.

# print("----------------------------------------------------")

# fruits.pop() #will pop random elements from fruits.

# print("----------------------------------------------------")

# fruits.remove("kiwi") #will remove specified element
# print(fruits)

# print("----------------------------------------------------")

# z = fruits.symmetric_difference(companies) #will print all elements which are unique in both sets.
# print(z)
# fruits.symmetric_difference_update(companies) #will update set fruits with all the unique elements

# print("----------------------------------------------------")

# z = fruits.union(companies) #will print the elements present in bith the sets and also the remoaning elements from both the sets.
# print(z)

# z = a.union(b,c)
# print(z)

# print("----------------------------------------------------")

fruits.update(companies) #will update set fruits with all the elements and will not repeat the same element.

# print(fruits)